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

        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);

    }

    public static void main(String[] args) {

        App app = new App();
        app.m1InvertirString("aprender");

    }
}
