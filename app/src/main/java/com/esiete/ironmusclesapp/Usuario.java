package com.esiete.ironmusclesapp;

import java.util.Date;

public class Usuario {
    private String nombre;
    private Boolean sexo;
    private String nacimiento;
    private String curp;
    private String domicilio;
    private int membresia;

    private String correo;
    private String contra;

    public Usuario(String nombre, String correo, String contra, int membresia){
        this.nombre=nombre;
        this.correo=correo;
        this.contra=contra;
        this.membresia=membresia;
    }
    public Usuario(String nombre, Boolean sexo, String nacimiento, String curp, String rfc, String domicilio){
        this.nombre=nombre;
        this.sexo=sexo;
        this.nacimiento=nacimiento;
        this.curp=curp;
        this.domicilio=domicilio;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContra(){
        return contra;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMembresia(){
        return Integer.toString(membresia);
    }
}
