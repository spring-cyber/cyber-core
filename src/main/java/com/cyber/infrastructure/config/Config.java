
package com.cyber.infrastructure.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.net.ssl.*;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Configuration
public class Config {

    private static final Logger LOGGER = LoggerFactory.getLogger(Config.class);

    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(100);
        executor.setMaxPoolSize(200);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("spring-cyber-async-");
        executor.initialize();
        return executor;
    }

    @Bean
    public okhttp3.OkHttpClient okHttpClient() {
        return new okhttp3.OkHttpClient.Builder()
                .sslSocketFactory(sslSocketFactory(), x509TrustManager())
                .hostnameVerifier(hostnameVerifier())
                .retryOnConnectionFailure(true)
                .connectionPool(new okhttp3.ConnectionPool(200, 5, TimeUnit.MINUTES))
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(0, TimeUnit.SECONDS)
                .build();
    }

    @Bean
    public X509TrustManager x509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    @Bean
    public SSLSocketFactory sslSocketFactory() {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{x509TrustManager()}, new SecureRandom());
            return sslContext.getSocketFactory();
        } catch (Exception exception) {
            LOGGER.debug("SSLSocketFactory Error...", exception);
        }
        return null;
    }

    @Bean
    public static HostnameVerifier hostnameVerifier() {
        HostnameVerifier hostnameVerifier = (s, sslSession) -> true;
        return hostnameVerifier;
    }
}
