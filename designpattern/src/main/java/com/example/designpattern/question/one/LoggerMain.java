package com.example.designpattern.question.one;

public class LoggerMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("User logged in");

        Logger logger2 = Logger.getInstance();
        logger2.log("User Two logged in");
    }
}
