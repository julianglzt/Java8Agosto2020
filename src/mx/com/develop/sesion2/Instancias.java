/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion2;

public class Instancias {

    public static void main(String[] args) {
        NewClass nc = new NewClass();
        System.out.println("nc: " + nc);
        NewClass nc1 = nc;
        NewClass nc2 = nc;
        System.out.println("nc1: " + nc1);
        System.out.println("nc2: " + nc2);
        nc1 = new NewClass();
        System.out.println("nc1: " + nc1);
        
    }
}
