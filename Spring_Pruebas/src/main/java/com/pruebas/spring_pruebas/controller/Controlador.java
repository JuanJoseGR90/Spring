package com.pruebas.spring_pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping("/detalles")
    public String detalles (Model model) {

        model.addAttribute("title", "Doc Pruebas");
        model.addAttribute("h1", "Doc");

        return "detalles";
    }
}
