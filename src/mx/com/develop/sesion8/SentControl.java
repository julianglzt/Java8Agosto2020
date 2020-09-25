/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion8;

import mx.com.develop.sesion15.NewClass;

public class SentControl {
    
    private String Nombre;

    public static void main(String[] args) {
//        test1();
//        System.out.println(test1());
//        test2();
//        System.out.println(test3());
//        test4();
//        new SentControl().test5();
//NewClass.newClassMethod();
           test5();
    }

    private static void test5() {
        int x = 10;
        for (int i = x; i > 0; i--) {
            System.out.println("x: " + x);
            System.out.println("i: " + i);
//            x--;
        }
//        do {
//            System.out.println("x: " + x);
//            x++;
//        } while (x < 10);
//        while (x < 10) {
//            System.out.println("x: " + x);
//            x++;
//        }
    }

    public static void test4() {
        String x = "0";
        switch (x) {
            default:
                System.out.println("default");
                break;
            case "2":
                System.out.println("dos");
                break;
            case "3": {
                System.out.println("tres");
                break;
            }
            case "100": {
                System.out.println("100");
                break;
            }
        }
    }

    public static String test3() {
        String x = "3";
        switch (x) {
            case "2":
                System.out.println("dos");
                return "dos";

            case "3": {
                return "tres";
            }
            case "100": {
                return "cien";
            }
            default:
                return "si";
        }
    }

    public static void test2() {
        int x = 2;
        int y = 6;
        int z = 2;

        int a = x == z ? (y == 6 ? 1 : 2) : 6;
        System.out.println("a: " + a);
    }

    public static String test1() {
        int x = 3;
        if (x == 2) {
            System.out.println("dos");
            return "dos";
        } else if (x == 3) {
            if (true) {
                if (true) {

                } else {

                }
            } else {

            }
            System.out.println("tres");
            System.out.println("tres");
            System.out.println("tres");
            return "tres";
        } else if (x == 100) {
            return "cien";
        }
//        else {
//            return "otro";
//        }
        return "si";
    }
}
