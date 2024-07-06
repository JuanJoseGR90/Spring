package com.example.spring;

import com.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserController {

    @GetMapping("/details")
    public String details (Model model) {

        User user = new User("Hellrider", "Fire");

        model.addAttribute("title", "User Details");
        model.addAttribute("user", user);

        return "details";
    }
}
