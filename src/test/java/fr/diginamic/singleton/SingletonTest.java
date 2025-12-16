package fr.diginamic.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void singletonUrlTest(){

        Singleton singleton = Singleton.getInstance();
        String url = singleton.getConfiguration("db.url");

        assertEquals("jdbc:mysql://localhost:3306/mabase", url);

    }

    @Test
    public void singletonUserTest(){

        Singleton singleton = Singleton.getInstance();
        String user = singleton.getConfiguration("db.user");

        assertEquals("root", user);

    }

    @Test
    public void singletonPassTest(){

        Singleton singleton = Singleton.getInstance();
        String pass = singleton.getConfiguration("db.password");

        assertEquals("1234", pass);

    }

}
