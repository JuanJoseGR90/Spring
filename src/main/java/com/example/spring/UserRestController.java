package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details () {

        Map<String, Object> body = new HashMap<>();

        body.put("title", "User Details");
        body.put("name", "Juan José");
        body.put("lastName", "Guirado Ruiz");

        return body;
    }
}
