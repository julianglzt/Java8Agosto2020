/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion5;

public class TestInstancias {
    
    String varInstancia;

    public static void main(String[] args) {
//        test1("");
        test2();
    }

    public static void test1(String variable) {
        System.out.println(variable);
        Inicializacion obj1 = new Inicializacion();
        obj1.campo1 = "algo";
        Inicializacion obj2 = new Inicializacion();
        System.out.println(obj1.campo1);
        System.out.println(obj1.campo2);
        System.out.println(obj1.campo3);
//        System.out.println(obj2.campo1);
//        System.out.println(obj2.campo2);
//        System.out.println(obj2.campo3);
    }

    public static void test2() {
//        System.out.println(varInstancia);
        String varx = "a";
        for(int i = 0; i < 10;  i++) {
            System.out.println(varx);
        }
    }

}
