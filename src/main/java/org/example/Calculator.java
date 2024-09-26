package org.example;

public interface Calculator {
     static int add(int a, int b ) {
        return a + b;
    }
    static int div(int a, int b) {
        if ( b == 0) {
            throw new ArithmeticException("Division operation is incorrect");
        }
        return a/b;
    }
    static int multiplication(int a, int b){
        return a * b;
    }
    static int difference(int a, int b){
        return a - b;
    }

    static int add() {
        return 0;
    }

    static int difference() {
        return 0;
    }

    static int multiplication() {
        return 0;
    }

    static int div() {
        return 0;
    }
}
