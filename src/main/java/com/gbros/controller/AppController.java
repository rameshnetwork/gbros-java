package com.gbros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping("/test")
    public Map<String, String> gelloWorld() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "java");
        map.put("2", "javk8sa");

        return map;
    }
}