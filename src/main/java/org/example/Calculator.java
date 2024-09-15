package org.example;

public interface Calculator {
     static int sum  (int a, int b ) {
        return a + b;
    }
    static int div(int a, int b) {
        if ( b == 0) {
            throw new ArithmeticException("Ты не прав подумай");
        }
        return a/b;
    }
    static int com(int a, int b){
        return a * b;
    }
    static int dif(int a, int b){
        return a - b;
    }
}
