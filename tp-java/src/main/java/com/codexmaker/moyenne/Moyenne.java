package com.codexmaker.moyenne;

import java.util.Scanner;
import java.util.logging.Logger;

public class Moyenne {
    double note;
    int nombreDeNotes;

    private static final  Logger LOGGER = Logger.getLogger(Moyenne.class.getName());

    public Moyenne() {
        note = 0;
    }

    public Moyenne(int nombreDeNotes) {
        this.nombreDeNotes = nombreDeNotes;
    }

    public void ajouteNote(double note) {
        LOGGER.info("debut de ajouter note");
        note += note;
    }

    public double calculMoyenne() {
        return note / nombreDeNotes;
    }



    public static void main(String[] args) {
        System.out.println("--- Calculer vos notes --- ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien de notes voulez-vous entrer ?");
        int nombreDeNotes = scanner.nextInt();
        
        Moyenne moyenne = new Moyenne(nombreDeNotes);

        for (int i = 0; i < nombreDeNotes; i++) {
            System.out.println("Entrez la note " + (i + 1) + " :");
            try {
                double note = scanner.nextDouble();
                moyenne.ajouteNote(note);
            } catch (Exception e) {
                System.out.println("Erreur veuillez entrer un nombre"+ e.getMessage());
            }
        }
        scanner.close();

        System.out.println("La moyenne est de : " + moyenne.calculMoyenne());
    }
}