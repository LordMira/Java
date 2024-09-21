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
}
