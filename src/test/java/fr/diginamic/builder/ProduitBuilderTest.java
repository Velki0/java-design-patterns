package fr.diginamic.builder;

import fr.diginamic.entites.Unite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProduitBuilderTest {

    @Test
    public void testProduitBuilder() {

        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.setNom("Miel Pops")
                      .setGrade("B-")
                      .setCategorie("Céréales")
                      .setMarque("Kellogs")
                      .addIngredient("Riz", 50, Unite.MILLI_GRAMME)
                      .addIngredient("Miel", 10, Unite.MILLI_GRAMME)
                      .addAllergene("Soja", 5, Unite.MILLI_GRAMME)
                      .addAdditif("E502", 3, Unite.MICRO_GRAMME);

        Produit produit = produitBuilder.build();

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

        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.setNom("Kit Kat")
                      .setCategorie("Barre chocolatée")
                      .setMarque("Nestlé")
                      .addIngredient("Riz", 50, Unite.MILLI_GRAMME);

        Produit produit = produitBuilder.build();

        assertEquals("Kit Kat", produit.getNom());
        assertEquals("Barre chocolatée", produit.getCategorie().getNom());
        assertEquals("Nestlé", produit.getMarque().getNom());
        assertEquals(1, produit.getIngredients().size());

    }

    @Test
    public void testProduitNull() {

        ProduitBuilder produitBuilder = new ProduitBuilder();
        produitBuilder.setNom("Kit Kat")
                      .setCategorie("Oui")
                      .setMarque("Truc");

        // Test qui ne doit pas passer.
        Produit produit = produitBuilder.build();

    }

}
