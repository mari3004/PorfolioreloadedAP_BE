package com.ar.maribelaizpitarte.backend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String titulo;
    
    @Column
    private String establecimiento;

    @Column
    private String fechadeingreso;

    @Column
    private String fechadeegreso;
    
    @Column
    private String fotoedu;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String getFechadeegreso() {
        return fechadeegreso;
    }

    public void setFechadeegreso(String fechadeegreso) {
        this.fechadeegreso = fechadeegreso;
    }

    public String getFotoedu() {
        return fotoedu;
    }

    public void setFotoedu(String fotoedu) {
        this.fotoedu = fotoedu;
    }

}