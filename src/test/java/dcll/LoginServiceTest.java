package dcll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HP on 15/04/2016.
 */
public class LoginServiceTest {

    @Test
    public void testLoginExists() throws Exception {
        String[] logins = {"YELG"};

        LoginService lg = new LoginService(logins);
        assertTrue(lg.loginExists("YELG"));
    }

    @Test
    public void testAddLogin() throws Exception {
        String[] logins = {"YELG"};
        LoginService lg = new LoginService(logins);
        lg.addLogin("DUPS");
        ArrayList<String> l = new ArrayList<String>();
        l.add("YELG");
        l.add("DUPS");
        assertEquals(l, lg.findAllLogins());
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        String[] logins = {"YELG"};
        LoginService lg = new LoginService(logins);
        ArrayList<String> l = new ArrayList<String>();
        l.add("YELG");
        assertEquals(l, lg.findAllLoginsStartingWith("Y"));
        assertEquals(l, lg.findAllLoginsStartingWith("YE"));
    }

    @Test
    public void testFindAllLogins() throws Exception {
        String[] logins = {"YELG"};
        LoginService lg = new LoginService(logins);
        ArrayList<String> l = new ArrayList<String>();
        l.add("YELG");
        assertEquals(l, lg.findAllLogins());
    }
}