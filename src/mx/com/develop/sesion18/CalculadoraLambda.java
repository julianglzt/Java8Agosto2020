/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion18;

public class CalculadoraLambda {

    public static void main(String[] args) {
        ICalculadorLambda isuma = (x, y) -> x + y;
        System.out.println("isuma: " + isuma.operacion(5, 6));
        
        ICalculadorLambda iresta = (x, y) -> x - y;
        System.out.println("iresta: " + iresta.operacion(5, 6));
        
        ICalculadorLambda in = (x, y) -> x * y;
        System.out.println("in: " + in.operacion(5, 6));
    }
}
