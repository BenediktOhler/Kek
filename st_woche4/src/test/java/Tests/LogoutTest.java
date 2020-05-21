package Tests;

import org.junit.Before;
import org.junit.Test;
import pages.Logout;

public class LogoutTest {

    Logout logout;

    @Before
    public void setup(){
        logout = new Logout();
    }

    @Test
    public void validLogoutTest(){
        logout.with("benedikt","testpasswort");
        logout.assertValidLogout();
    }

}
