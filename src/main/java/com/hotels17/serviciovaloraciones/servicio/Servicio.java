package com.hotels17.serviciovaloraciones.servicio;

import com.hotels17.serviciovaloraciones.dao.ValoracionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private ValoracionDAO dao;
}
