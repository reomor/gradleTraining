package ru.rem.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.rem.library.Library;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Start main");
        System.out.println("stdout");
        System.out.println("Generated UUID is: " + Library.usefullFoo());
        log.info("End main");
    }
}
