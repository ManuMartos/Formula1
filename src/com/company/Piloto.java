package com.company;

/**
 * Created by Manu on 09/05/2017.
 */
public class Piloto {

    private int dorsal;
    private String nombre;
    private String nacionalidad;
    private TipoEscuderia escuderia;
    private PosicionPiloto tipoPiloto;

    //Constructor por defecto

    public Piloto() {
    }

    //Constructor


    public Piloto(int dorsal,
                  String nombre,
                  String nacionalidad,
                  TipoEscuderia escuderia,
                  PosicionPiloto tipoPiloto) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.escuderia = escuderia;
        this.tipoPiloto = tipoPiloto;
    }

    //Accesores
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public TipoEscuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(TipoEscuderia escuderia) {
        this.escuderia = escuderia;
    }

    public PosicionPiloto getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(PosicionPiloto tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    @Override
    public String toString() {
        return "Piloto:" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", escuderia=" + escuderia +
                ", tipoPiloto=" + tipoPiloto +
                '}';
    }
}
