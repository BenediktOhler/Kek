package Tests;

import org.junit.Before;
import org.junit.Test;
import pages.Register;

public class RegisterTest {

    Register register;

    @Before
    public void setup(){
        register = new Register();
    }

    @Test
    public void validRegisterTest(){

        register.with("benedikt","testpasswort");
        register.assertValidRegister();
    }
}
