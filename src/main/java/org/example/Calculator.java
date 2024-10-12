package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Calculator {
    Logger logger = LogManager.getLogger(Calculator.class);

    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            logger.error("Attempted division by zero.");

        }
        return a / b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
