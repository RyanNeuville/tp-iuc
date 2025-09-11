package com.codexmaker;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello World!");

        LOGGER.info("Debut du pragemme et instantiation");
        Moyenne moyenne = new Moyenne();

        LOGGER.severe("apres l'instatntiotion(affichage)");
        System.out.println(moyenne.nombreDeNotes);  
    }
}