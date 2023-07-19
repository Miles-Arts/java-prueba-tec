package com.prueba;

import java.util.ArrayList;


import static java.lang.Math.max;



public  class App {

   /* private void numero(String[] args) {
        int m = max(1,2);

        if ( 1 > 2) {
            m = 1;
        } else {
            m = 2;
        }
        System.out.println(m);

    }*/

    //Invertir un String
    public static void m1InvertirString(String text) {
     /*   String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for ( int i = array.length; i > 0; i--) {

            newText.append(array[i - 1]);

        }

        System.out.println(newText);*/

      /*  String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);*/


   /*     String[] cadenaTexto = text.split("");
        StringBuilder nuevoTexto = new StringBuilder();

        for ( int i = cadenaTexto.length; i > 0; i-- ) {

            nuevoTexto.append(cadenaTexto[i - 1]);

        } System.out.println(nuevoTexto);*/

        /*String[] palabrasTexto = text.split("");
        StringBuilder cadenaTexto = new StringBuilder();

        for ( int i = palabrasTexto.length; i > 0; i --) {
            cadenaTexto.append(palabrasTexto[i - 1]);
        }
        System.out.println(cadenaTexto);*/

       /* String juegoTexto = new StringBuilder(text).reverse().toString();
        System.out.println(juegoTexto);*/

        /*String reverseTexto = new StringBuilder(text).reverse().toString();
        System.out.println(reverseTexto);*/

      /*  String[] jugandoTexto = text.split("");
        StringBuilder revertirTexto = new StringBuilder();

        for ( int i = jugandoTexto.length; i > 0; i--) {

            revertirTexto.append(jugandoTexto[i - 1 ]);

            String mover = new StringBuilder(revertirTexto).reverse().toString();
            String mover1 = new StringBuilder("Hola").reverse().toString();

            System.out.println(mover);
            System.out.println(mover1);

        }
        System.out.println(revertirTexto);*/

       /* String[] juegoPalabras = text.split("");
        StringBuilder imprimirPalabras = new StringBuilder();
        StringBuilder imprimirPalabras1  = new StringBuilder();

        String[] otroModo = juegoPalabras;
        System.out.println(otroModo);

        for ( int i = juegoPalabras.length; i > 0; i--) {

            imprimirPalabras.append(juegoPalabras[i - 1]);
            imprimirPalabras1.append(otroModo[i - 1]);

            System.out.println(imprimirPalabras);
        }
        System.out.println(imprimirPalabras);
        System.out.println("---");*/


      /*  String hola = "Que cuenta la gente bella";
        String holaMundo = new StringBuilder(text).reverse().toString();
        System.out.println(holaMundo);

        String[] holaPeople = text.split("");
        StringBuilder holaGente = new StringBuilder();

        for ( int i = holaPeople.length; i > 0; i-- ) {

            holaGente.append(holaPeople[i - 1]);

        }


        System.out.println(holaGente);*/

        String peliculaTexto = new StringBuilder(text).reverse().toString();
        System.out.println(peliculaTexto);

        String[] peliculaFull = text.split("");
        StringBuilder  peliculaReverse = new StringBuilder();

        for ( int i = peliculaFull.length; i > 0; i--) {

            peliculaReverse.append(peliculaFull[i - 1]);

        }
        System.out.println(peliculaReverse);



    }

   /* private void toUpperCase(String holas) {
    }*/

    public static void main(String[] args) {

        App app = new App();
        //app.m1InvertirString("aprender");
        app.m1InvertirString("La Estrategía del Caracol");
    }
}
