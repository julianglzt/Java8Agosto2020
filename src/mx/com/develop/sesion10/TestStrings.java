/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion10;

public class TestStrings {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test5();
    }

    public static void test5() {
        int result = "AnimAl ".trim().toLowerCase().replace("a", "A").length();
        System.out.println("result: " + result);
        StringBuilder sb = new StringBuilder();
    }

    public static void test4() {
        String var1 = "Cadena 1  ";
//        String var2 = "Cadena 1  ";
        String var2 = new String("Cadena 1  ");
        System.out.println(var1 == var2);
        System.out.println(var1.equals(var2));
    }

    public static void test3() {
        String var1 = "Cadena 1  2";
        String var2 = "Cadena|,c|";
        System.out.println(var1 == var2);
        System.out.println("var1.indexOf: " + var1.indexOf("1   2"));
        System.out.println("var2.split(|).length: " + var2.split("|"));
        String[] arreglos = var2.split("-");
        System.out.println("var2.split: " + arreglos.length);
        System.out.println("var2.split: " + arreglos[0]);
//        System.out.println("var2.split: " + arreglos[1]);
        System.out.println(var2.replace("a", "A"));
    }

    public static void test2() {
        String var1 = new String("hola");
        String var2 = new String("hola");
        String var3 = new String("hola");
        String var4 = "hola";
        String var5 = "hola";
        String var6 = "hola";

    }

    public static void test1() {
        String var0 = "Hello";
        String var1 = "Hola";

        String var2 = " mundo";
        var1 = var1.concat(var2);
        System.out.println("var1 :" + var1);
        System.out.println("var2: " + var2);

        System.out.println(var1);
        System.out.println(var0 + var2);

    }

}
