package com.cyber.utils;

import com.alibaba.fastjson.JSON;
import com.cyber.constant.ResultCode;
import com.cyber.entity.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Responses {

    private static final Logger LOGGER = LoggerFactory.getLogger(Responses.class);

    public static final void response(HttpServletResponse response, String content) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(content);
        } catch (IOException e) {
            LOGGER.error("repsonse with json error", e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static final void response(HttpServletResponse response, ResultCode resultCode) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();

            Response result = new Response();
            result.setCode(resultCode.getCode());
            response.setStatus(resultCode.getCode());
            out.append(JSON.toJSONString(result));
        } catch (IOException e) {
            LOGGER.error("repsonse with json error", e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static final void response(HttpServletResponse response, Response result) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(JSON.toJSONString(result));
        } catch (IOException e) {
            LOGGER.error("repsonse with json error", e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}
