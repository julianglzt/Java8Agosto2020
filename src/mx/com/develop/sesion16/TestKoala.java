/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion16;

import static java.util.Arrays.asList;

public class TestKoala {

    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        Koala n = new Koala();
        System.out.println("n.nombre: " + n.nombre);
        n.nombre = "oso cafe";
        pruebaTest3(n);
        System.out.println("n.nombre: " + n.nombre);
    }
    
    public static void pruebaTest3(Koala n) {
//        n = new Koala();
        System.out.println("n.nombre: " + n.nombre);
        n.nombre = "oso cafe con rayas";
    }
    
    public static void test2() {
        asList("");
    }

    public static void test1(String[] args) {
        int algo = mx.com.develop.sesion16.Koala.count;
        int algo2 = mx.com.develop.sesion16.Koala.count;
    }

}
