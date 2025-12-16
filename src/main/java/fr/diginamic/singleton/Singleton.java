package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private final ResourceBundle configuration;

    private Singleton() {

        configuration = ResourceBundle.getBundle("configuration") ;

    }

    public static Singleton getInstance() { return instance; }

    public String getConfiguration(String clef) { return configuration.getString(clef); }

}
