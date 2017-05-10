package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         Diseñar una clase Piloto destinada a gestionar la información de pilotos de la Fórmula 1.

         Un piloto de Fórmula 1 vendrá caracterizado por su dorsal, nombre, nacionalidad, escudería y tipo de piloto.

         Las escuderías estarán definidas por su nombre y la posición que
         ocuparon en la clasificación del mundial de la temporada 2015-2016.

         Un piloto podrá ser de tres tipos: Primer piloto, Segundo piloto o piloto probador.

         Como es habitual, la clase Piloto deberá estar provista de sus
         correspondientes constructores, accesores y métodos utilitarios que creas conveniente.
         */

        Piloto Piloto1 = new Piloto(6,"Nico Rosberg","Aleman",TipoEscuderia.MERCEDES,
                PosicionPiloto.SEGUNDO_PILOTO);
        Piloto Piloto2 = new Piloto(44,"Lewis Hamilton","Reino Unido",TipoEscuderia.MERCEDES,
                PosicionPiloto.PRIMER_PILOTO);

        Piloto Piloto3 = new Piloto(3,"Daniel Ricciardo","Australia",TipoEscuderia.RED_BULL,
                PosicionPiloto.PRIMER_PILOTO);
        Piloto Piloto4 = new Piloto(26,"Daniil Kvyat","Rusia",TipoEscuderia.RED_BULL,
                PosicionPiloto.SEGUNDO_PILOTO);

        Piloto Piloto5 = new Piloto(5,"Sebastian Vettel","Alemania",TipoEscuderia.FERRARI,
                PosicionPiloto.PRIMER_PILOTO);
        Piloto Piloto6 = new Piloto(7,"Kimi Raikkonen","Finlandia",TipoEscuderia.FERRARI,
                PosicionPiloto.SEGUNDO_PILOTO);

        Piloto Piloto7 = new Piloto(14,"Fernando Alonso","España",TipoEscuderia.MCLAREN,
                PosicionPiloto.PRIMER_PILOTO);
        Piloto Piloto8 = new Piloto(22,"Jenson Button","Reino Unido",TipoEscuderia.MCLAREN,
                PosicionPiloto.SEGUNDO_PILOTO);

        System.out.println( Piloto1 );
        System.out.println( Piloto2 );
        System.out.println( Piloto3 );
        System.out.println( Piloto4 );
        System.out.println( Piloto5 );
        System.out.println( Piloto6 );
        System.out.println( Piloto7 );
        System.out.println( Piloto8 );
    }
}
