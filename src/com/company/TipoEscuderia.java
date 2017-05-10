package com.company;

/**
 * Created by Manu on 09/05/2017.
 */
public enum TipoEscuderia {
    MERCEDES,
    RED_BULL,
    FERRARI,
    MCLAREN;


    private final String tipoEs;

    TipoEscuderia() {
        tipoEs = "sin esuderia";
    }

    TipoEscuderia(String tipoEs) {
        this.tipoEs = tipoEs;
    }

    public String getTipoEs() {
        return tipoEs;
    }
}
