/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion5;

public class Inicializacion {

    String campo1 = "hola";
    String campo2;
    int campo3;

    {
        campo1 = "inicializacion de bloque";
    }

    public static void main(String[] args) {
        test1("valor pasado al metodo");
    }

    public static void test1(String var1) {
        String var2, var3, var4;
        System.out.println(var1);
    }
}
