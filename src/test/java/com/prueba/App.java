package com.prueba;

import org.jetbrains.annotations.NotNull;

import javax.management.StringValueExp;
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
    //Invertir un String
    //Invertir un String
    //Invertir un String
    //Invertir un String
//    public static void m1InvertirString(String text) {
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

      /*  String peliculaTexto = new StringBuilder(text).reverse().toString();
        System.out.println(peliculaTexto);

        String[] peliculaFull = text.split("");
        StringBuilder  peliculaReverse = new StringBuilder();

        for ( int i = peliculaFull.length; i > 0; i--) {

            peliculaReverse.append(peliculaFull[i - 1]);

        }
        System.out.println(peliculaReverse);*/


    /*    String invertirTexto = new StringBuilder(text).reverse().toString();
        System.out.println(invertirTexto);*/

//        String[] invertirPalabras = text.split(",\\s*");
 /*       String[] invertirPalabras = text.split("");
        StringBuilder invertirCaracteres = new StringBuilder();

        for ( int i = invertirPalabras.length; i > 0 ; i-- ) {

            invertirCaracteres.append(invertirPalabras[i - 1]);

        }
        System.out.println(invertirCaracteres);

    }
*/
   /* private void toUpperCase(String holas) {
    }*/

    /*private void  m1InvertirString(@NotNull String texto) {

        String[] reverseTexto = texto.split("");
        StringBuilder reverseNewTexto = new StringBuilder();

        for ( int i = reverseTexto.length; i > 0; i -- ) {

            reverseNewTexto.append(reverseTexto[i - 1]);
            System.out.println(reverseNewTexto);
        }
    }*/
/*
    private void m1InvertirString(String letras) {

        String[] palabrasTexto = letras.split("");
        StringBuilder nuevasPalabrasTexto = new StringBuilder();

        for ( int i = palabrasTexto.length; i > 0; i --) {

            nuevasPalabrasTexto.append(palabrasTexto[i - 1]);
        }    System.out.println(nuevasPalabrasTexto);
    }*/

/*    private void m1InvertirString(String cadenaTexto) {

        String[] revertirPalabra = cadenaTexto.split("");
        StringBuilder revertirWord = new StringBuilder();

        for ( int i = revertirPalabra.length; i > 0; i -- ) {

            revertirWord.append(revertirPalabra[i - 1]);

        } System.out.println(revertirWord);

    }*/

     /*private void m1InvertirString(String text) {

         String[] textRe = text.split("");
         StringBuilder textReN = new StringBuilder();

         for ( int i = textRe.length; i > 0; i-- ) {

             textReN.append(textRe[i - 1]);
         }
         System.out.println(textReN);
     }*/

   /* private void m1InvertirString(String palabras) {

        String[] palabraTexto = palabras.split("");
        StringBuilder palabraReverse = new StringBuilder();

        for ( int i = palabraTexto.length; i > 0; i--) {

            palabraReverse.append(palabraTexto[i - 1]);
        }
        System.out.println(palabraReverse);
    }*/

    private void m1InvertirString(String reverso) {
        String[] textoReverso = reverso.split("");
        StringBuilder newTextoReverso =  new StringBuilder();

        for ( int i =  textoReverso.length; i > 0 ; i --) {

            newTextoReverso.append(textoReverso[ i - 1]);

        } System.out.println(newTextoReverso);
    }

    private void mMInvertirString(String palabra) {
        String fraseRevez = new StringBuilder(palabra).reverse().toString();
        System.out.println(fraseRevez);
    }

    //CAPICUA
    //CAPICUA
    //CAPICUA
    //CAPICUA

/*    private  void m2IsCapicua(int number) {

        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if ( numberText.equals(reverseNumber) ) {

            System.out.println("Is Capicula " + reverseNumber);

        } else {
            System.out.println("No es Capicula " + reverseNumber);
        }
    }*/

/*    private void m2IsCapicua(String number) {

        Integer numeroATexto = Integer.valueOf(number);
        //String numeroReverse = new StringBuilder(numeroATexto).reverse().toString();
        Integer numeroInver = Integer.valueOf(numeroATexto);

        for ( int i = numeroInve;  )

        if ( numeroATexto.equals(numeroInver))  {

            System.out.println("El número " + numeroInver + " es Capicula");
        } else {
            System.out.println("El número " + numeroInver + " no es Capicula");
        }*/

    /*private void m2IsCapicua(int number) {

        String numeroTexto  = String.valueOf(number);
        String numeroATexto = new StringBuilder(numeroTexto).reverse().toString();

        if ( numeroTexto.equals(numeroATexto)) {
            System.out.println("El número " + numeroATexto + " es Capicua");
        } else {
            System.out.println("El número " + numeroATexto + " no es Capicua");
        }*/

 /*   private void m2IsCapicua(int numeroLargo) {


        String numeroATexto = String.valueOf(numeroLargo);
        String numeroReverse = new StringBuilder(numeroATexto).reverse().toString();

        if (numeroATexto.equals(numeroReverse)) {

            System.out.println("El número " + numeroReverse + " es Capicula");
        } else {
            System.out.println("El número " + numeroReverse + " no es Capicua");
        }
    }*/

   /* private void m2IsCapicuas(int numeros) {

        String numeroExtraño = String.valueOf(numeros);
        String numerosTextos = new StringBuilder(numeroExtraño).reverse().toString();

        if ( numeroExtraño.equals(numerosTextos)) {
            System.out.println("El Capicua " + numerosTextos);
        }
        System.out.println("El Capicua " + numerosTextos);

    }*/

/*    private void m2IsCapicua(int numero) {
        String numeroTexto = String.valueOf(numero);
        String nuevoNumeroTexto = new StringBuilder(numeroTexto).reverse().toString();

        if (numeroTexto.equals(nuevoNumeroTexto)) {
            System.out.println("El numero es Capicua " + nuevoNumeroTexto);
        } else {
            System.out.println("El número no es Capícua " + nuevoNumeroTexto);
        }

    }*/

    /*private void m2IsCapicua(int numero) {

        String numeroCapicua = String.valueOf(numero);
        String numeroCapicuaUno = new StringBuilder(numeroCapicua).reverse().toString();

        if ( numeroCapicua.equals(numeroCapicuaUno) ) {

            System.out.println("Capicua");

        } else {
            System.out.println("No Capicua");
        }
    }*/


/*    private void m2IsCapicua(int number) {

        String capi = String.valueOf(number);
        String capi1 = new StringBuilder(capi).reverse().toString();

        if (capi1 == capi1) {
            System.out.println("Capicua");
        } else {
            System.out.println("No Capicua");
        }
    }*/

    /*private void m2IsCapicua( int number ) {

        String capicua1 = String.valueOf(number);
        String capicua2 = new StringBuilder(capicua1).reverse().toString();

        if ( capicua1.equals(capicua2) ) {

            System.out.println("Capicua");
        } else  {
            System.out.println("No Capicua");
        }

    }*/


/*    private void m2IsCapicua(int numero) {

        String numeroCapi = String.valueOf(numero);
        String numeroCua = new StringBuilder(numeroCapi).reverse().toString();

        if ( numeroCapi.equals(numeroCua) ) {
            System.out.println("Capicua");
        } else {
            System.out.println("No Capicua");
        }
    }*/

    private void m2IsCapicua(int numero) {
        String capi = String.valueOf(numero);
        String capicua = new StringBuilder(capi).reverse().toString();

        if ( capicua.equals(capicua) ) {
            System.out.println("Capicua");
        } else {
            System.out.println("Mo Capicua");
        }
    }

    //casa
    //casa
    //casa
    //casa
    //casa
    //c=1, a=2, s=1,

   /* private void m3CountCharacterTimes(String text) {
        int i, lenght, counter[] = new int[256];
        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            *//*counter[text.charAt(i)] = counter[text.charAt(i)] + 1;*//*
            counter[text.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
        System.out.println("-----");
    }*/


    /*private void m4CountCharacterTimes(String texto) {
            int i, lenght, counter[] = new  int [256];
            lenght = texto.length();;

            for ( i = 0;i < lenght; i++ ) {
                counter[texto.charAt(i)] ++;
            } for (i = 0; i < 256; i ++) {
                if ( counter[i] != 0 ) {
                    System.out.println((char) i + ": " + counter[i]);
                }
            }
    }*/

   /* private void m4CountCharacterTimes(String frase) {
       int  i, length, counter[] = new int [256];
       length = frase.length();

       for ( i = 0; i < length; i ++) {
           counter[frase.charAt(i)] ++;
       } for ( i = 0; i < 256; i ++ ) {
           if ( counter[i] != 0) {
               System.out.println((char) i + ": " + counter[i]);
           }
        }
    }*/

    private void m4CountCharacterTimes(String texto) {

        int i, length, counter[] = new int [256];
        length = texto.length();

        for ( i =  0; i < length; i ++  ) {

            counter[texto.charAt(i)] ++;
        } for ( i = 0; i < 256; i ++ ) {
            if ( counter[i] != 0 ) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }  System.out.println("---");
    }

 /*   private void mCCountCharacterTimes(String cuenta) {
        int i , length, counter[] = new int [256];
        length = cuenta.length();

        for ( i = 0; i < length; i ++) {
            counter[cuenta.charAt(i)] ++;
        } for ( i = 0; i < 256; i ++ ) {
            if ( counter[i] != 0 ) {

                System.out.println((char) i + ":" + counter[i]);
            }
        }
    }*/

    private void mCCountCharacterTimes(String word) {
        int i, lenght, counter[] = new int[256];
        lenght = word.length();

        for ( i = 0; i < lenght; i ++ ) {
            counter[word.charAt(i)] ++;
        } for( i = 0; i < 256; i ++ ) {
            if ( counter[i] != 0 ) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }




    public static void main(String[] args) {

        App app = new App();
        //app.m1InvertirString("aprender");
       // app.m1InvertirString("La Estrategia del Caracol");
        app.m1InvertirString("El Oso come Miel");
        app.mMInvertirString("Miel");
        app.m2IsCapicua(96869);
       // app.m3CountCharacterTimes("casacasa");
        app.m4CountCharacterTimes("amarilla");
        app.mCCountCharacterTimes(" ojo por ojo ");


    }
}
