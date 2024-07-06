package com.pruebas.spring_pruebas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControlador {

    @GetMapping("/2")
    public Map<String, Object> detalles() {

        Map<String, Object> model = new HashMap<>();

        model.put("title", "Doc Pruebas");
        model.put("h1", "Doc");

        return model;
    }
}
