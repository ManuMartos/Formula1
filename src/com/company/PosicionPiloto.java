package com.company;

/**
 * Created by Manu on 09/05/2017.
 */
public enum PosicionPiloto {
    PRIMER_PILOTO,
    SEGUNDO_PILOTO,
    PILOTO_PROBADOR;

    private final String tipo;

    PosicionPiloto() {
        tipo = "sin piloto";
    }

    PosicionPiloto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
