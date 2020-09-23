/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion6;

import mx.com.develop.sesion2.NewClass;

public class TestGC {

    public static void main(String[] args) {
        NewClass var1 = new NewClass();
        System.out.println(var1);
        System.out.println(var1);
        System.out.println(var1);
        var1 = new NewClass();
        System.out.println(var1);
//        nc.

        String hola = new String("adios");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println(hola);
        }
        System.gc();
    }

}
