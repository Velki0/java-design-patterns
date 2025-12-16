package fr.diginamic.builderalt;

import fr.diginamic.entites.Unite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProduitBuilderAltTest {

    @Test
    public void testProduitBuilder() {

        ProduitAlt produit = ProduitAlt.builder()
                                       .nom("Miel Pops")
                                       .grade("B-")
                                       .categorie("Céréales")
                                       .marque("Kellogs")
                                       .ingredient("Riz", 50, Unite.MILLI_GRAMME)
                                       .ingredient("Miel", 10, Unite.MILLI_GRAMME)
                                       .allergene("Soja", 5, Unite.MILLI_GRAMME)
                                       .additif("E502", 3, Unite.MICRO_GRAMME)
                                       .build();

        assertEquals("Miel Pops", produit.getNom());
        assertEquals("B-", produit.getGrade());
        assertEquals("Céréales", produit.getCategorie().getNom());
        assertEquals("Kellogs", produit.getMarque().getNom());
        assertEquals(2, produit.getIngredients().size());
        assertEquals(1, produit.getAllergenes().size());
        assertEquals(1, produit.getAdditifs().size());

    }

    @Test
    public void testProduitBuilderWithoutSomeInfos() {

        ProduitAlt produit = ProduitAlt.builder()
                                       .nom("Kit Kat")
                                       .categorie("Barre chocolatée")
                                       .marque("Nestlé")
                                       .ingredient("Riz", 50, Unite.MILLI_GRAMME)
                                       .build();

        assertEquals("Kit Kat", produit.getNom());
        assertEquals("Barre chocolatée", produit.getCategorie().getNom());
        assertEquals("Nestlé", produit.getMarque().getNom());
        assertEquals(1, produit.getIngredients().size());

    }

    @Test
    public void testProduitNull() {

        // Test qui ne doit pas passer.
        ProduitAlt produit = ProduitAlt.builder()
                                       .nom("Kit Kat")
                                       .categorie("Oui")
                                       .marque("Truc")
                                       .build();

    }

}
