package com.example;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

/**
 * Hello world!
 *
 */
public class App {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        init();

        System.out.println("Hello World!");

        Calc calc = new Calc();
        int a = 10;
        int b = 20;
        int ret = calc.add(a, b);
        System.out.println(ret);

        logger.info("ret=" + ret);
    }

    private static void init() {
        LoggerContext context  = (LoggerContext)LogManager.getContext(false);
        context.setConfigLocation(new File("log4j2.xml").toURI());
    }
}
