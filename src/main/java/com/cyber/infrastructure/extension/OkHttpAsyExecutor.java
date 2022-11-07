package com.cyber.infrastructure.extension;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.CompletableFuture;

@Component
public class OkHttpAsyExecutor {

    private static final Logger LOGGER = LoggerFactory.getLogger(OkHttpAsyExecutor.class);

    @Autowired
    private OkHttpClient okHttpClient;

    @Async
    public CompletableFuture<Object> execute(Request request) {
        long startTime = System.currentTimeMillis();
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                if (!StringUtils.isEmpty(responseBody)) {
                    return CompletableFuture.completedFuture(JSONObject.parse(responseBody));
                }
                LOGGER.error("OkHttpClient Executor Request {} , Response Is Empty ...", JSON.toJSONString(request));
            }
        } catch (Exception exception) {
            LOGGER.error("OkHttpClient Executor Request {} , Exception ...", JSON.toJSONString(request), exception);
        } finally {
            LOGGER.info("OkHttpClient Executor Request {} , Response Code {} , Cost {} ...", JSON.toJSONString(request), null == response ? null : response.code(), (System.currentTimeMillis() - startTime));
        }
        return null;
    }
}

