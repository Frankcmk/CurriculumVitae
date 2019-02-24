package com.uabc.edu.mx.cv.modelo;


import lombok.Data;

import java.util.List;

@Data
public class Curriculum {

    //Datos personales
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private String correoE;

    //Fotografia
    private String fotografia;

    //Trayectoria academica
    private List<String> estudios;

    //Trayectoria complementaria
    private List<String> trayCompl;

    //Experiencia
    private List<String> expLabo;

    //Idiomas
    private List<String> idiomas;


}
