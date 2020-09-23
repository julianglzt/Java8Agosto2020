/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion4;

public class TestPrimitivos {
    
    String var1 ;

    public static void main(String[] args) {
//        testChar();
//        testBoolean();
//        testTamanio();
        testVariables("");
    }

    /**
     * Demostramos como declarar variables
     * @param var123 cadena de prueba
     * @return cadena con un saludo
     */
    public static String testVariables(String var123) {
//        String var1 = "hola";

        String var1, var2 = "hola";//declaracion
//        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(var3);
        var1 = "hola";//inicializacion
        var1 = "adios";
        return "hola";
    }
    
    public static void testTamanio() {
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        float variable = 12331.02f;
        int variable2 = 1233_1;
        long variable3 = 12331;
        String var1 = null;
        int tam = var1.length();
        System.out.println(var1);
//        System.out.println(tam);
    }

    public static void testChar() {
//        char arroba = 64;
        char arroba = '@';
        System.out.println(arroba);

    }

    public static void testBoolean() {
        boolean verdad = false;
//        boolean resultado = (5 != 5);
//        boolean resultado = false;
        int resultado = (5 + 5);
        System.out.println("verdad: " + verdad);
        System.out.println("resultado: " + resultado);
    }
}
