package fr.diginamic.factory;

import fr.diginamic.entites.Element;
import fr.diginamic.entites.TypeElement;
import fr.diginamic.entites.Unite;

public interface IElementFactory {

    Element getInstance(TypeElement type, String nom, double valeur, Unite unite);

}
