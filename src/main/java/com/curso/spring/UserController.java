package com.curso.spring;

import com.curso.spring.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




@Controller
public class UserController {

    /*  Es una clase para procesar peticiones y respuestas de usuarios, que maneja métodos de @Request.

        Se conocen cómo métodos handlers porque manejan peticiones de usuario.

        Procesan una petición/request y devuelven un response.
        
        Con la anotación @Controller es para trabajar con vistas, html, webs o api rest con json.

        La clase se anota con @Controller, esto indica que es un controlador de Spring.

            Es una especialización de @Component, que son objetos que se guardan en un
            contenedor para ser manejados por Spring. 

        */

        /*  Tipos de @Request
         *      -   GetMapping es para cualquier petición de una ruta o enlace.
         *      -   Post para enviar datos a través de un formulario.
         *      -   
         */

    @GetMapping("/details")
    public String details (Model model) {

        model.addAttribute("title", "Hola Spring!")
        .addAttribute("name", "Juan José")
        .addAttribute("lastname", "G.R.")
        .addAttribute("email", "hellrider@hotmail.com");

        return "details";
    }

    
    @GetMapping("/detailsMap")
    public String detailsMap (Map<String, Object> model) {

        model.put("title", "Hola Spring!");
        model.put("name", "Juan José");
        model.put("lastname", "G.R.");

        return "details";
    }


    @GetMapping("/detailsMapJs")
    @ResponseBody
    public Map<String, Object> detailsMapJs () {
        
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("title", "Saludando con map");
        modelMap.put("name", "hellrider");
        modelMap.put("lastname", "1990");
        modelMap.put("email", "hellrider@hotmail.com");

        return modelMap;
    }

    @GetMapping("/listaUsuarios")
    public String listUsuarios(ModelMap model) {

        List<User> users = Arrays.asList(
                new User("Juan José", "G.R", "juanjose@gmail.com"),
                new User("Hellrider", "1990")
        );

        model.addAttribute("users", users);
        model.addAttribute("title", "Lista de usuarios");

        return "list";
    }
    
}
