package com.cyber.infrastructure.toolkit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocals {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadLocals.class);
    protected final static ThreadLocal<Map<String, Object>> threadContext = new MapThreadLocal();

    private ThreadLocals() {

    };

    public static void put(String key, Object value) {
        getContextMap().put(key, value);
    }

    public static Object remove(String key) {
        return getContextMap().remove(key);
    }

    public static Object get(String key) {
        return getContextMap().get(key);
    }

    private static class MapThreadLocal extends ThreadLocal<Map<String, Object>> {
        protected Map<String, Object> initialValue() {
            return new HashMap<String, Object>() {
                private static final long serialVersionUID = 3637958959138295593L;
                public Object put(String key, Object value) {
                    if (LOGGER.isDebugEnabled()) {
                        if (containsKey(key)) {
                            LOGGER.debug("Overwritten attribute to thread context: {} = {}", key, value);
                        } else {
                            LOGGER.debug("Added attribute to thread context: {} = {}", key, value);
                        }
                    }
                    return super.put(key, value);
                }
            };
        }
    }

    protected static Map<String, Object> getContextMap() {
        return (Map<String, Object>) threadContext.get();
    }

    public static void reset() {
        getContextMap().clear();
    }
}
