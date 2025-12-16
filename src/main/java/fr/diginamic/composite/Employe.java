package fr.diginamic.composite;

public class Employe implements IElement {

    private final String nom;
    private final String prenom;
    private double salaire;

    public Employe(String nom, String prenom, double salaire) {

        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;

    }

    public String getNom() { return nom; }
    public String getPrenom() {  return prenom; }

    public void setSalaire(double salaire) { this.salaire = salaire; }

    @Override
    public double calculerSalaire() { return salaire; }

}
