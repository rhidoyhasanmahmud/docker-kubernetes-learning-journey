package com.hasan.dockerintro;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/environment")
public class EnvironmentController {

    private final String applicationName;

    public EnvironmentController(@Value("${app.name:Docker Intro API}") String applicationName) {
        this.applicationName = applicationName;
    }

    @GetMapping
    public Map<String, Object> environment() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("application", applicationName);
        response.put("hostname", hostname());
        response.put("javaVersion", System.getProperty("java.version"));
        response.put("processId", ProcessHandle.current().pid());
        return response;
    }

    private String hostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException exception) {
            return System.getenv().getOrDefault("HOSTNAME", "unknown");
        }
    }
}
