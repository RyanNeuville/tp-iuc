package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ClasseIdent {
    private static final Logger LOGGER = Logger.getLogger(ClasseIdent.class.getName());
    int numero;

    public ClasseIdent() {
        numero = 0;
    }

    public int getIdentMax(List<ClasseIdent> liste) {
        int max = 0;
        for (ClasseIdent ci : liste) {
            if (ci.numero > max) {
                max = ci.numero;
            }
        }
        return max;
    }

    public int getNumero() {
        return numero;
    }

    public static void main(String[] args) {

        List<ClasseIdent> liste = new ArrayList<ClasseIdent>();    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien d'objets voulez-vous entrer ?");
        int nombreDeNombres = scanner.nextInt();

        for (int i = 0; i < nombreDeNombres; i++) {
            System.out.println("Entrez le numero " + (i + 1) + " :");
            try {
                int numero = scanner.nextInt();
                ClasseIdent ci = new ClasseIdent();
                LOGGER.info("Tous est bon");
                ci.numero = numero;
                LOGGER.info("Tous est bon");
                for (int j = 0; j < liste.size(); j++) {
                    if (liste.get(j).getNumero() == numero) {
                        System.out.println("Numero deja existant choisir un autre SVP");
                        break;
                    }
                }
                liste.add(ci);
            } catch (Exception e) {
                System.out.println("Erreur veuillez entrer un nombre : "+ e);
                e.getStackTrace();
            }
        }

        ClasseIdent ci = new ClasseIdent();
        System.out.println("Le numero max est de : " + ci.getIdentMax(liste));
        scanner.close();
    }
}