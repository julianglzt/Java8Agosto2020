/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion16;

public class Koala {

    public static int count;
    
    public String nombre = "Oso";

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {

        System.out.println("count: " + count);
        System.out.println("count: " + Koala.count);
        Koala k;// = new Koala();
//        System.out.println("k.count: " + k.count);
        k = null;
        System.out.println("k: " + k);
        System.out.println("k.count: " + k.count);
    }
}
