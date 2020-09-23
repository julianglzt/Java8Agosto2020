/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion11;

public class StringBuilderPrueba {

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    public static void test3() {
        StringBuilder sb = new StringBuilder("Hola");
        sb.append("*Mundo");
        System.out.println("sb: " + sb);
        StringBuilder ejemplo2 = sb.append("+Alumnos");
        System.out.println("sb: " + sb);
        System.out.println("ejemplo2: " + ejemplo2.length());
        System.out.println(sb == ejemplo2);
        StringBuilderPrueba dbp = new StringBuilderPrueba();
        System.out.println("dbp: " + dbp);
    }

    public static void test2() {
        StringBuilder alpha = new StringBuilder(5);//1
        for (char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
            System.out.println("alpha: " + alpha);
            System.out.println("alpha.length(): " + alpha.length());
        }
    }

    public static void test1() {
        String alpha = "";//1
        String beta = "";//1
//        String alpha = null;//1
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            alpha.concat("");
            System.out.println("alpha: " + alpha);
            System.out.println("alpha.length(): " + alpha.length());
        }
    }

}
