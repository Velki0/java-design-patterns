package fr.diginamic.builder;

import fr.diginamic.entites.Additif;
import fr.diginamic.entites.Allergene;
import fr.diginamic.entites.Categorie;
import fr.diginamic.entites.Ingredient;
import fr.diginamic.entites.Marque;

import java.util.HashSet;
import java.util.Set;

public class Produit {

    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private final Set<Ingredient> ingredients = new HashSet<>();
    private final Set<Allergene> allergenes = new HashSet<>();
    private final Set<Additif> additifs = new HashSet<>();

    protected Produit () {}

    public String getNom() { return nom; }
    public String getGrade() { return grade; }
    public Categorie getCategorie() { return categorie; }
    public Marque getMarque() { return marque; }
    public Set<Ingredient> getIngredients() { return ingredients; }
    public Set<Allergene> getAllergenes() { return allergenes; }
    public Set<Additif> getAdditifs() { return additifs; }

    protected void setNom(String nom) { this.nom = nom; }
    protected void setGrade(String grade) { this.grade = grade; }
    protected void setCategorie(Categorie categorie) { this.categorie = categorie; }
    protected void setMarque(Marque marque) { this.marque = marque; }

}
