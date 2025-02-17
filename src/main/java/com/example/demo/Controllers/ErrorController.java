package com.example.demo.Controllers;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ErrorController {

    @GetMapping("/null")
    public String nullPointer() {
        String value = null;
        return value.toString();
    }

    @GetMapping("/stack")
    public String stack() {
        return stack(); 
    }

    @GetMapping("/parametroInvalido")
    public String parametroInvalido() {
        throw new IllegalArgumentException("Parámetro inválido");
    }

    @GetMapping("/entidadNoEncontrada")
    public String entidadNoEncontrada() {
        throw new EntityNotFoundException("Entidad no encontrada en la base de datos");
    }

    @GetMapping("/accesoDenegado")
    public String accesoDenegado() throws AccessDeniedException {
        throw new AccessDeniedException("Acceso denegado");
    }

    @GetMapping("/metodoIncorrecto")
    public String metodoIncorrecto() throws HttpRequestMethodNotSupportedException {
        throw new HttpRequestMethodNotSupportedException("POST");
    }

    @GetMapping("/tipoDeArchivo")
    public String tipoDeArchivo() throws HttpMediaTypeNotSupportedException {
        throw new HttpMediaTypeNotSupportedException("Tipo de contenido no soportado");
    }

    @GetMapping("/general")
    public String errorGeneral() {
        throw new RuntimeException("Error interno del servidor");
    }
}