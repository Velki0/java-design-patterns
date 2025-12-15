package fr.diginamic.factory;

import fr.diginamic.factory.entites.Additif;
import fr.diginamic.factory.entites.Allergene;
import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.entites.Ingredient;
import fr.diginamic.factory.entites.TypeElement;
import fr.diginamic.factory.entites.Unite;

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
