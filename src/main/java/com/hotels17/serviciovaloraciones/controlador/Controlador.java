package com.hotels17.serviciovaloraciones.controlador;

import com.hotels17.serviciovaloraciones.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valoraciones")
public class Controlador {
    @Autowired
    private Servicio servicio;
}
