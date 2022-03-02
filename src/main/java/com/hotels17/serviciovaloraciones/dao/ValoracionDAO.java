package com.hotels17.serviciovaloraciones.dao;

import com.hotels17.serviciovaloraciones.modelo.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoracionDAO extends JpaRepository<Valoracion, Integer> {
}
