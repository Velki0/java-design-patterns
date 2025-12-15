package fr.diginamic.factory;

import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.entites.TypeElement;
import fr.diginamic.factory.entites.Unite;

public interface IElementFactory {

    Element getInstance(TypeElement type, String nom, double valeur, Unite unite);

}
