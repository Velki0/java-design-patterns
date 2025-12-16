package fr.diginamic.builder;

import fr.diginamic.entites.Additif;
import fr.diginamic.entites.Allergene;
import fr.diginamic.entites.Categorie;
import fr.diginamic.entites.Ingredient;
import fr.diginamic.entites.Marque;
import fr.diginamic.entites.Unite;

public class ProduitBuilder {

    private final Produit produit;

    public ProduitBuilder() {

        produit = new Produit();

    }

    public ProduitBuilder setNom(String nom) {
        produit.setNom(nom);
        return this;
    }
    public ProduitBuilder setGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }
    public ProduitBuilder setCategorie(String categorie) {
        produit.setCategorie(new Categorie(categorie));
        return this;
    }
    public ProduitBuilder setMarque(String marque) {
        produit.setMarque(new Marque(marque));
        return this;
    }
    public ProduitBuilder addIngredient(String nom, double valeur, Unite unite) {
        produit.getIngredients().add(new Ingredient(nom, valeur, unite));
        return this;
    }
    public ProduitBuilder addAllergene(String nom, double valeur, Unite unite) {
        produit.getAllergenes().add(new Allergene(nom, valeur, unite));
        return this;
    }
    public ProduitBuilder addAdditif(String nom, double valeur, Unite unite) {
        produit.getAdditifs().add(new Additif(nom, valeur, unite));
        return this;
    }

    public Produit build() {

        assert produit.getNom() != null;
        assert produit.getCategorie() != null;
        assert produit.getMarque() != null;
        assert !produit.getIngredients().isEmpty();
        return produit;

    }

}
