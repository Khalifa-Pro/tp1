package entity;

public class Etudiant {
    // Constantes
    public final int MAX_NOTES = 10;
    // Attributs
    private String nom;
    private String prenom;
    private int anneeNaiss;
    private double[] tabNotes;
    private int nbNotes;
    // Constructeurs
    public Etudiant(String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public Etudiant(String nom,String prenom,int anneeNaiss){
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaiss = anneeNaiss;
    }

    //Accesseurs ou getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNaiss() {
        return anneeNaiss;
    }


    //Mutateur ou Modificateur ou setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeNaiss(int anneeNaiss) {
        this.anneeNaiss = anneeNaiss;
    }

    public double[] getTabNotes() {
        return tabNotes;
    }

    public void setTabNotes(double[] tabNotes) {
        this.tabNotes = tabNotes;
    }

    //Methodes
}
