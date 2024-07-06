package com.example.spring;

import com.example.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details() {

        User user = new User("Hellrider","Prende tu alma en llamas");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "User Details");
        body.put("user", user);

        return body;
    }
}
