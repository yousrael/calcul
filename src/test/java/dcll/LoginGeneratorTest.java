package dcll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 15/04/2016.
 */
public class LoginGeneratorTest {

    LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
    LoginGenerator lg=new LoginGenerator(loginService);

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        lg.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR1",lg.generateLoginForNomAndPrenom("Durand","Paul"));

    }

    @Test
    public void testGenerateLoginForNomAndPrenom1() throws Exception {
        lg.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",lg.generateLoginForNomAndPrenom("Rolling","Jean"));


    }

    @Test
    public void testGenerateLoginForNomAndPrenom2() throws Exception {
        lg.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals("PDUR1",lg.generateLoginForNomAndPrenom("Dùrand","Paul"));


    }

}