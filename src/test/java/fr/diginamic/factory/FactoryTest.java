package fr.diginamic.factory;

import fr.diginamic.factory.entites.Additif;
import fr.diginamic.factory.entites.Allergene;
import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.entites.Ingredient;
import fr.diginamic.factory.entites.TypeElement;
import fr.diginamic.factory.entites.Unite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    private static final IElementFactory elementFactory = new ElementFactory();
    private static final double DELTA = 0.0000001;

    @Test
    public void testCreerIngredient() {

        Element farine = elementFactory.getInstance(TypeElement.INGREDIENT, "Farine", 200, Unite.MILLI_GRAMME);

        assertEquals(Ingredient.class, farine.getClass());
        assertEquals("Farine", farine.getNom());
        assertEquals(200, farine.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMME, farine.getUnite());
    }

    @Test
    public void testCreerAdditif() {

        Element aspartame = elementFactory.getInstance(TypeElement.ADDITIF, "Aspartame", 3, Unite.MICRO_GRAMME);

        assertEquals(Additif.class, aspartame.getClass());
        assertEquals("Aspartame", aspartame.getNom());
        assertEquals(3, aspartame.getValeur(), DELTA);
        assertEquals(Unite.MICRO_GRAMME, aspartame.getUnite());
    }

    @Test
    public void testCreerAllergene() {

        Element soja = elementFactory.getInstance(TypeElement.ALLERGENE, "Soja", 240, Unite.MILLI_GRAMME);

        assertEquals(Allergene.class, soja.getClass());
        assertEquals("Soja", soja.getNom());
        assertEquals(240, soja.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMME, soja.getUnite());
    }

}
