package fr.diginamic.factory;

import fr.diginamic.entites.Additif;
import fr.diginamic.entites.Allergene;
import fr.diginamic.entites.Element;
import fr.diginamic.entites.Ingredient;
import fr.diginamic.entites.TypeElement;
import fr.diginamic.entites.Unite;

public class ElementFactory implements IElementFactory {

    public Element getInstance(TypeElement type, String nom, double valeur, Unite unite) {

        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
        }
        return null;

    }

}
