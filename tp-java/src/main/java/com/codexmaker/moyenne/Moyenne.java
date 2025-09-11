package com.codexmaker;

import java.util.logging.Logger;

public class Moyenne {
    double note;
    int nombreDeNotes;

    private static final  Logger LOGGER = Logger.getLogger(Moyenne.class.getName());

    void ajouteNote(double note) {
        LOGGER.info("debut de ajouter note");
        note += note;
        nombreDeNotes += 1;
    }

    double calculMoyenne() {
        LOGGER.info("debut de calculmoyenne");
        return note / nombreDeNotes;
    }
}