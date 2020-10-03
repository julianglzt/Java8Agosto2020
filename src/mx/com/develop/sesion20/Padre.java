/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion20;

public class Padre {

//    public String practicandoJava() {
//        return "Estoy practicando JAva de una manera";
//    }
    String practicandoJava(String var1) {
        return var1 + " Estoy practicando JAva de una manera clase Padre";
    }

    public final void imprimePracticandoJava() {
        System.out.println("imprimePracticandoJava");
        System.out.println(practicandoJava("Hola "));
    }

    public static void metodoEstatico() {
        System.out.println("Metodo clase Padre");
    }

    public static void imprimeMetodoEstatico() {
        metodoEstatico();
    }
}
