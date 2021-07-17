package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Component
public class WebUtils {
    private final HttpServletRequest request;

    @Autowired
    public WebUtils(HttpServletRequest request) {
        this.request = request;
    }

    public String getUserIpAddress() {
        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }

    public String getUserAgent() {
        return request.getHeader("User-Agent");
    }
}
