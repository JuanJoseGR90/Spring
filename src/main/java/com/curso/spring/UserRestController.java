package com.curso.spring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.dto.UserDto;
import com.curso.spring.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

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

    @GetMapping("/details3")
    public UserDto detailsDto () {
        
        User user = new User("Juan José", "G.R.");
        UserDto userDto = new UserDto();

        userDto.setTitle("Hola Spring! con dto");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/details2")
    public Map<String, Object> details () {
        
        User user = new User("Juan José", "G.R.");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Spring!");
        body.put("user", user);

        return body;
    }

    @GetMapping("/list")
    public List<User> listaUsuarios () {

        User user = new User();
        User user2 = new User();
        
        user.setName("Hellrider");
        user.setLastname("1990");
        
        user2.setName("Juan José");
        user2.setLastname("G.R.");

        List<User> list = Arrays.asList(user, user2);

        return list;
    }

    @GetMapping("/detailsMapJsRest")
    public Map<String, Object> detailsMapJs () {
        
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("title", "Saludando con map");
        modelMap.put("name", "hellrider");
        modelMap.put("lastname", "1990");
        modelMap.put("email", "hellrider@hotmail.com");

        return modelMap;
    }

}
