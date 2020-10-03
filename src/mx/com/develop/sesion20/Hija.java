/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion20;

public class Hija extends Padre {
//public class Hija  {

    public static void main(String[] args) {
//        System.out.println(new Padre().practicandoJava(""));
//        Hija hija = new Hija();
//        System.out.println(hija.practicandoJava(""));
//        hija.imprimePracticandoJava();
        metodoEstatico();
        imprimeMetodoEstatico();
    }

    public static void metodoEstatico() {
        System.out.println("Metodo clase Hija");
    }

//    @Override
    public String practicandoJava() {
        return "Estoy practicando JAva de OTRA manera";
    }

    @Override
    public String practicandoJava(String c) {
        return c + " Estoy practicando JAva de OTRA manera clase Hija";
    }

    public String practicandoJava(String c, String d) {
        return "Estoy practicando JAva de OTRA manera";
    }
}
