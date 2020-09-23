/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion13;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

    public static void main(String[] args) {
        test6();
    }

    public static void test6() {
        ArrayList<Integer> listaNombres = new ArrayList();
        listaNombres.add(1);
        listaNombres.add(3);
        listaNombres.add(2);
        System.out.println("listaNombres: " + listaNombres);
        Collections.sort(listaNombres);
        System.out.println("listaNombres: " + listaNombres);
    }
    
    public static void test5() {
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Agustin");
        listaNombres.add(1, "Jose");
        listaNombres.add(2, "Miguel");
        System.out.println(listaNombres);
        Object [] arreglo = listaNombres.toArray();
        System.out.println(arreglo);
        String [] arregloStrings = listaNombres.toArray(new String[0]);
        System.out.println(arregloStrings);
    }
    
    public static void test4() {
        int numerico = Integer.valueOf("4");
//        int numerico = Integer.parseInt("4");
        
//        Integer numerico = Integer.parseInt("4");
//        numerico.
        System.out.println("numerico: " + numerico);
    }

    public static void test3() {
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Agustin");
        listaNombres.add(1, "Jose");
        listaNombres.add(2, "Miguel");
        ArrayList<String> listaNombres2 = new ArrayList<String>();
        listaNombres2.add("Agustin");
        listaNombres2.add(1, "Jose");
        listaNombres2.add(2, "Miguel");
        System.out.println(listaNombres == listaNombres2);
        System.out.println(listaNombres.equals(listaNombres2));
    }

    public static void test2() {
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Agustin");
        listaNombres.add(1, "Jose");
        listaNombres.add(2, "Miguel");
        listaNombres.add(0, "Arturo");
        listaNombres.add("Alma");
        listaNombres.add("Ana");
        System.out.println("listaNombres:\n" + listaNombres);
        listaNombres.remove("Ana");
        System.out.println("listaNombres:\n" + listaNombres);
        listaNombres.remove(0);
        System.out.println("listaNombres:\n" + listaNombres);
        listaNombres.set(0, "Francisco");
        System.out.println("listaNombres:\n" + listaNombres);
        System.out.println("listaNombres.isEmpty():\n" + listaNombres.isEmpty());
        System.out.println("listaNombres.size():\n" + listaNombres.size());
        System.out.println("listaNombres.contains():\n" + listaNombres.contains("Josee"));
    }

    public static void test1() {
//        ArrayList<String> al = new ArrayList();
//        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al = new ArrayList<String>();
    }
}
