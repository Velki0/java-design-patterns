package fr.diginamic.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTest {

    private static final double DELTA = 0.00001;

    @Test
    public void testComposite() {

        Service dsin = new Service("DSIN");
        Service bigData = new Service("Big Data");
        Service javaDev = new Service("Java Dev");

        dsin.addElement(new Employe("Cécile", "RASPEY", 10000));
        dsin.addElement(new Employe("Bilel", "BECHKAR", 8000));
        bigData.addElement(new Employe("Jean-Bernard", "RANMEY", 7500));
        bigData.addElement(new Employe("Jane", "DOE", 3500));
        javaDev.addElement(new Employe("Kevin", "GUINEAU", 7500));
        javaDev.addElement(new Employe("Paul", "MARTIN", 3500));

        dsin.addElement(bigData);
        dsin.addElement(javaDev);

        assertEquals("DSIN", dsin.getNom());
        assertEquals("Big Data", bigData.getNom());
        assertEquals("Java Dev", javaDev.getNom());
        assertEquals(4, dsin.getElements().size());
        assertEquals(2, bigData.getElements().size());
        assertEquals(2, javaDev.getElements().size());
        assertEquals(40000, dsin.calculerSalaire(), DELTA);
        assertEquals(11000, bigData.calculerSalaire(), DELTA);
        assertEquals(11000, javaDev.calculerSalaire(), DELTA);

    }

}
