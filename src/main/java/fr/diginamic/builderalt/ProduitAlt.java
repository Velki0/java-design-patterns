package fr.diginamic.builderalt;

import fr.diginamic.entites.Additif;
import fr.diginamic.entites.Allergene;
import fr.diginamic.entites.Categorie;
import fr.diginamic.entites.Ingredient;
import fr.diginamic.entites.Marque;
import fr.diginamic.entites.Unite;

import java.util.HashSet;
import java.util.Set;

public class ProduitAlt {

    private final String nom;
    private final String grade;
    private final Categorie categorie;
    private final Marque marque;
    private final Set<Ingredient> ingredients = new HashSet<>();
    private final Set<Allergene> allergenes = new HashSet<>();
    private final Set<Additif> additifs = new HashSet<>();

    private ProduitAlt(ProduitBuilderAlt builder) {

        assert builder.nom != null;
        assert builder.categorie != null;
        assert builder.marque!= null;
        assert !builder.ingredients.isEmpty();

        this.nom = builder.nom;
        this.grade = builder.grade;
        this.categorie = builder.categorie;
        this.marque = builder.marque;
        this.ingredients.addAll(builder.ingredients);
        this.allergenes.addAll(builder.allergenes);
        this.additifs.addAll(builder.additifs);

    }

    public String getNom() { return nom; }
    public String getGrade() { return grade; }
    public Categorie getCategorie() { return categorie; }
    public Marque getMarque() { return marque; }
    public Set<Ingredient> getIngredients() { return ingredients; }
    public Set<Allergene> getAllergenes() { return allergenes; }
    public Set<Additif> getAdditifs() { return additifs; }

    public static ProduitBuilderAlt builder() { return new ProduitBuilderAlt(); }

    public static class ProduitBuilderAlt {

        private String nom;
        private String grade;
        private Categorie categorie;
        private Marque marque;
        private final Set<Ingredient> ingredients = new HashSet<>();
        private final Set<Allergene> allergenes = new HashSet<>();
        private final Set<Additif> additifs = new HashSet<>();

        public ProduitBuilderAlt() {}

        public ProduitBuilderAlt nom(String nom) {
            this.nom = nom;
            return this;
        }
        public ProduitBuilderAlt grade(String grade) {
            this.grade = grade;
            return this;
        }
        public ProduitBuilderAlt categorie(String categorie) {
            this.categorie = new Categorie(categorie);
            return this;
        }
        public ProduitBuilderAlt marque(String marque) {
            this.marque = new Marque(marque);
            return this;
        }
        public ProduitBuilderAlt ingredient(String nom, double valeur, Unite unite) {
            this.ingredients.add(new Ingredient(nom, valeur, unite));
            return this;
        }
        public ProduitBuilderAlt allergene(String nom, double valeur, Unite unite) {
                this.allergenes.add(new Allergene(nom, valeur, unite));
            return this;
        }
        public ProduitBuilderAlt additif(String nom, double valeur, Unite unite) {
            this.additifs.add(new Additif(nom, valeur, unite));
            return this;
        }

        public ProduitAlt build() {
            return new ProduitAlt(this);
        }

    }

}
