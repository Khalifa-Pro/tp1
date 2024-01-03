package presentation;

import entity.Etudiant;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        // Instanciation d'un objet
        Etudiant etudiant1 = new Etudiant("DIADHIOU","Khalifa Ababacar");
        Etudiant etudiant2 = new Etudiant("DIAME","Fatou",18);
        System.out.println("======================================================");
        System.out.println("NOM: "+etudiant1.getNom());
        System.out.println("PRENOM: "+etudiant1.getPrenom());
        System.out.println("DATE DE NAISSANCE: "+etudiant1.getAnneeNaiss()+" ans");
        System.out.println("======================================================");
        System.out.println("NOM: "+etudiant2.getNom());
        System.out.println("PRENOM: "+etudiant2.getPrenom());
        System.out.println("DATE DE NAISSANCE: "+etudiant2.getAnneeNaiss()+" ans");
        System.out.println("======================================================");
        etudiant1.setAnneeNaiss(28);
        System.out.println("======================================================");
        System.out.println("NOM: "+etudiant1.getNom());
        System.out.println("PRENOM: "+etudiant1.getPrenom());
        System.out.println("DATE DE NAISSANCE: "+etudiant1.getAnneeNaiss()+" ans");
        System.out.println("======================================================");
    }
}