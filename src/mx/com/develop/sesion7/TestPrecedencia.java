package mx.com.develop.sesion7;

public class TestPrecedencia {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
        test9();
    }

    public static void test9() {
        boolean x = true;
        boolean y = false;
        
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        
        String cadena = null;
        
        if(cadena != null && cadena.length() == 1) {
            System.out.println("cadena de un caracter");
        }
    }

    public static void test8() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("y: " + y);
    }

    public static void test7() {
        int a = 0;
        a = a++;
        System.out.println("1. a: " + a);
        System.out.println("2. a: " + a);
        System.out.println("3. a: " + a);
        int b;
        b = ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void test6() {
//        Boolean c = !0;
        boolean c = !true;
    }

    public static void test5() {
        int num1 = 55_555;
        int num2 = 66_666;
//        long num3 = num1 * num2;
        long num3 = (long) (num1 * num2);
        System.out.println("num3: " + num3);
    }

    public static void test4() {
        short a = 14;
        float b = 13;
        double c = 30;
        double z = a * b / c;
        System.out.println("z: " + z);
    }

    public static void test3() {
        short a = 3, b = 2;
//        a = a + b;
        int ab = a + b;
        System.out.println("ab: " + ab);
    }

    public static void test2() {
        System.out.println(9 / 3);
        System.out.println(9 % 3);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
    }

    public static void test1() {
//                 30  +   12  -   50   - 10
        int x = 10 * 3 + 2 * 6 - 10 * 5 - 10;
        System.out.println("x:" + x);
//                 -300
//              10 * (   - 30                  )      
//              10 * (   30       -    50  - 10)        
//              10 * (   5    * 6 - 10 * 5 - 10)
        int y = 10 * ((3 + 2) * 6 - 10 * 5 - 10);
        System.out.println("y:" + y);

        //                 -300
//              10 * (   - 30                  )      
//              10 * (   30       -    50  - 10)        
//              10 * (   5    * 6 -    50  - 10)        
//              10 * (   5    * 6 - (10 * 5) - 10)
        int z = 10 * ((3 + 2) * 6 - (10 * 5) - 10);
        System.out.println("z:" + z);
    }

}
