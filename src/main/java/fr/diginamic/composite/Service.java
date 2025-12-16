package fr.diginamic.composite;

import java.util.HashSet;
import java.util.Set;

public class Service implements IElement {

    private final String nom;
    private final Set<IElement> elements = new HashSet<>();

    public Service(String nom) {

        this.nom = nom;

    }

    public String getNom() { return nom; }
    public Set<IElement> getElements() { return elements; }

    public void addElement(IElement element) { elements.add(element); }

    @Override
    public double calculerSalaire() {

        double totalSalaire = 0;
        for (IElement element : elements) {
            totalSalaire += element.calculerSalaire();
        }
        return totalSalaire;

    }

}
