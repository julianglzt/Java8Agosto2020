/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion12;

import java.util.Arrays;

public class PruebaArreglos {

    public static void main(String[] args) {

        test3();
    }

    public static void test3() {
        String var1 = "";
        var1.length();
        System.out.println(0 + 1 + "a");
        System.out.println("a" + 0 + (1));
        int[] edades = {56, 45, 17, 32, 20};
        int j = 7;
        Arrays.sort(edades);
        for (int i = 0; i < j -1; i = i +2) {
//            System.out.println(i);
        }
        String stuff = "";
        String res = "";
    }

    public static void test2() {

        String []var4, var5, var6;
        var4 = new String[1];
        var5 = new String[1];
        var6 = new String[1];

        System.out.println(var4[0]);

    }

    public static void test1() {
        String arregloDos[] = {"Develop", "Java"};
        String arregloCuatro[] = {"Develop", "Java"};
        String arreglosTres[] = arregloDos;
        System.out.println(arregloDos.equals(arreglosTres));
        System.out.println(arregloDos == arreglosTres);
        System.out.println("-----------------------------");
        System.out.println(arregloDos.equals(arregloCuatro));
        System.out.println(arregloDos == arregloCuatro);
    }
}
