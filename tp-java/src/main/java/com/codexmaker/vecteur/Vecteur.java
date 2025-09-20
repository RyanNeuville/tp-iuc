package com.codexmaker.vecteur;

public class Vecteur {
    double abs;
    double ord;

    public Vecteur(){}
    public Vecteur(double abs, double ord){
        this.abs = abs;
        this.ord = ord;
    }

    /** fonction pour avoir la longueur d'un vecteur */
    public double longeur(){
        return Math.sqrt(abs*abs + ord*ord);
    }

    /** fonction pour savoir si un vecteur est plus petit que l'autre */
    public boolean plusPetitQue(Vecteur vecteur){
        double longueur = vecteur.longeur();

        if (this.longeur() < longueur){
            return true;
        }else {
            return false;
        }
    }

    /** fonction pour additionner 1  vecteur a un autre vecteur */
    public void addition(Vecteur vecteur){
        System.out.println("v1 apres l'addition de v2 : "+"("+ (this.abs + vecteur.abs) +" , "+(this.ord + vecteur.ord) + ")");
    }

    /** fonction pour additionner 2 vecteurs */
    public static Vecteur addition(Vecteur vecteurA, Vecteur vecteurB){
        Vecteur vecteurSomme 
    }

    /** Getters de la methodes vecteurs */
    public double getAbs() {
        return abs;
    }
    public double getOrd() {
        return ord;
    }

    /** Setters de la methodes vecteurs */
    public void setAbs(double abs) {
        this.abs = abs;
    }
    public void setOrd(double ord) {
        this.ord = ord;
    }


    public static void main(String[] args) {
        Vecteur vecteur = new Vecteur();

        vecteur.abs = 1;
        vecteur.ord = 2;

        Vecteur newVecteur = new Vecteur(2,1);

        if (vecteur.plusPetitQue(newVecteur)){
            System.out.println("Vecteur "+"("+vecteur.abs +","+ vecteur.ord+")"+" est plus petit que le Vecteur" + " ("+newVecteur.abs+","+ newVecteur.ord+")");
        }else{
            System.out.println("Vecteur "+"("+vecteur.abs +","+ vecteur.ord+")"+" est plus grand que le Vecteur" + " ("+newVecteur.abs+","+ newVecteur.ord+")");
        }

        /** Affichier la longueur du vecteur */
        System.out.println("Longueur de vecteur "+"("+vecteur.abs+"," +vecteur.ord+")"+" :"+vecteur.longeur());
    }
}
