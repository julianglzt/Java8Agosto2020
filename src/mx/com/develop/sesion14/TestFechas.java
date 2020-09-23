/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


public class TestFechas {

    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        
        System.out.println(LocalTime.of(10, 10));
        System.out.println(LocalTime.of(20, 10, 20));
        System.out.println(LocalTime.of(23, 10, 20, 123));
        System.out.println(LocalTime.of(23, 10, 20, 123).minusMinutes(10));
    }
    
    public static void test2() {
        System.out.println(LocalDate.of(2020, 10, 20));
        System.out.println(LocalDate.of(2020, Month.OCTOBER, 20));
        LocalDate ld = LocalDate.of(2020, Month.DECEMBER, 20);
        System.out.println("ld: " + ld);
        System.out.println("ld: " + ld.plusDays(32));
        ld = ld.plusDays(32);
        System.out.println("2 ld: " + ld);
        System.out.println("ld: " + ld.minusDays(32));
    }
    public static void test1() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
