package com.prueba;

import java.util.ArrayList;

public class App {


    //Invertir un String
    private void m1InvertirString(String text) {
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

        String[] jugandoTexto = text.split("");
        StringBuilder revertirTexto = new StringBuilder();

        for ( int i = jugandoTexto.length; i > 0; i--) {

            revertirTexto.append(jugandoTexto[i - 1 ]);

        }
        System.out.println(revertirTexto);

    }

    public static void main(String[] args) {

        App app = new App();
        //app.m1InvertirString("aprender");
        app.m1InvertirString("Un bello paseo por el parque el campo");
    }
}
