/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        String[] nombre = {"Juan", "Pedro", "Ana"};
        Arrays.stream(nombre).forEach(nom -> System.out.println("Hola " + nom));
    }

    public static void test1() {
        List<Integer> lista = new ArrayList();
        lista.add(4);
        lista.add(6);
        lista.add(5);
        Stream st = lista.stream();
        System.out.println(st.filter(Predicate.isEqual(5)));
    }

}
