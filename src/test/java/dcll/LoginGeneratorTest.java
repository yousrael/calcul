package dcll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 15/04/2016.
 */
public class LoginGeneratorTest {
    LoginService loginService;
    LoginGenerator lg;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        lg = new LoginGenerator(loginService);
    }


    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {

        lg.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("PDUR1", lg.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertTrue(loginService.loginExists("PDUR1"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom1() throws Exception {

        lg.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("JROL1", lg.generateLoginForNomAndPrenom("Rolling", "Jean"));
        assertTrue(loginService.loginExists("JROL1"));

    }

    @Test
    public void testGenerateLoginForNomAndPrenom2() throws Exception {
        lg.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals("PDUR1", lg.generateLoginForNomAndPrenom("Dùrand", "Paul"));
        assertTrue(loginService.loginExists("PDUR1"));

    }

    @Test
    public void testGenerateLoginForNomAndPrenom3() throws Exception {
        lg.generateLoginForNomAndPrenom("Du", "Paul");
        assertEquals("PDU1", lg.generateLoginForNomAndPrenom("Du", "Paul"));
        assertTrue(loginService.loginExists("PDU1"));

    }

    @Test
    public void testGenerateLoginForNomAndPrenom4() throws Exception {
        lg.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("JRAL1", lg.generateLoginForNomAndPrenom("Ralling", "John"));
        assertTrue(loginService.loginExists("JRAL1"));

    }


}