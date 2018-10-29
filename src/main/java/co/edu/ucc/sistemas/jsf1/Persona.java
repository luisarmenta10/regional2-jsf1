/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucc.sistemas.jsf1;

import java.util.Date;

/**
 *
 * @author Luis Armenta
 */
public class Persona {

    private String nombres;
    private Date fecha;
    private Boolean activo;
    private Integer n1;
    private Integer n2;
    private Integer n3;
    private Integer n4;
    private Integer n5;
    private Integer n6;

    public Persona() {

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public Integer getN3() {
        return n3;
    }

    public void setN3(Integer n3) {
        this.n3 = n3;
    }

    public Integer getN4() {
        return n4;
    }

    public void setN4(Integer n4) {
        this.n4 = n4;
    }

    public Integer getN5() {
        return n5;
    }

    public void setN5(Integer n5) {
        this.n5 = n5;
    }

    public Integer getN6() {
        return n6;
    }

    public void setN6(Integer n6) {
        this.n6 = n6;
    }

}
