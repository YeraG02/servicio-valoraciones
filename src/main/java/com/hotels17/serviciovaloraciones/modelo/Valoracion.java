package com.hotels17.serviciovaloraciones.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Valoraciones")
public class Valoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_hotel")
    private Integer idHotel;

    private String comentario;

    private Date fecha;

    private Double nota;

    public Valoracion() {
    }

    public Valoracion(Integer id, Integer idUsuario, Integer idHotel, String comentario, Date fecha, Double nota) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idHotel = idHotel;
        this.comentario = comentario;
        this.fecha = fecha;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valoracion that = (Valoracion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Valoracion{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idHotel=" + idHotel +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", nota=" + nota +
                '}';
    }
}
