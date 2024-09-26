package com.valdzrg.Apiprueba.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apisaludos")
public class SaludoController {

    @GetMapping("/saludo")
    public String holaMundo() {
        return "Hola Mundo";
    }
    @GetMapping("/nombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre, @PathVariable int edad) {
        return "Hola Mundo " + nombre + " tu edad es: " + edad;
    }
}
