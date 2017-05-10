package com.company;

/**
 * Created by Manu on 09/05/2017.
 */
public class Escuderia{

    private TipoEscuderia escuderia;
    private int posicion;

    private final String nombre;

    //Constructor por defecto
    public Escuderia(String nombre) {
        this.nombre = "sin escuderia";
    }

    //Constructor


    public Escuderia(TipoEscuderia escuderia,
                     int posicion,
                     String nombre) {
        this.escuderia = escuderia;
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public TipoEscuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(TipoEscuderia escuderia) {
        this.escuderia = escuderia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Escuderia{" +
                "escuderia=" + escuderia +
                ", posicion=" + posicion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
