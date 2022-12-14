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
@Table (name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String empresa;
    
    @Column
    private String rol;

    @Column
    private String fechadeingreso;

    @Column
    private String fechadeegreso;

    @Column
    private String tarea1;

    @Column
    private String tarea2;   

    @Column
    private String tarea3;   

    @Column
    private String tarea4;   

    @Column
    private String tarea5;   

    @Column
    private String tarea6;
    
    @Column
    private String tarea7;   
    
    @Column
    private String tarea8;   
    
    @Column
    private String tarea9;
    
    @Column
    private String fotoexp;
    
        public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public String getTarea1() {
        return tarea1;
    }

    public void setTarea1(String tarea1) {
        this.tarea1 = tarea1;
    }

    public String getTarea2() {
        return tarea2;
    }

    public void setTarea2(String tarea2) {
        this.tarea2 = tarea2;
    }

    public String getTarea3() {
        return tarea3;
    }

    public void setTarea3(String tarea3) {
        this.tarea3 = tarea3;
    }

    public String getTarea4() {
        return tarea4;
    }

    public void setTarea4(String tarea4) {
        this.tarea4 = tarea4;
    }

    public String getTarea5() {
        return tarea5;
    }

    public void setTarea5(String tarea5) {
        this.tarea5 = tarea5;
    }

    public String getTarea6() {
        return tarea6;
    }

    public void setTarea6(String tarea6) {
        this.tarea6 = tarea6;
    }

    public String getTarea7() {
        return tarea7;
    }

    public void setTarea7(String tarea7) {
        this.tarea7 = tarea7;
    }

    public String getTarea8() {
        return tarea8;
    }

    public void setTarea8(String tarea8) {
        this.tarea8 = tarea8;
    }

    public String getTarea9() {
        return tarea9;
    }

    public void setTarea9(String tarea9) {
        this.tarea9 = tarea9;
    }

    public String getFotoexp() {
        return fotoexp;
    }

    public void setFotoexp(String fotoexp) {
        this.fotoexp = fotoexp;
    }
}