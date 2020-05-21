import org.junit.Before;
import org.junit.Test;

public class LoginTest {

    Login login;

    @Before
    public void setUp(){
        login = new Login();
    }

    @Test
    public void validLoginTest(){
        login.with("tomsmith","SuperSecretPassword!");
        login.assertValidLogin();
    }

}
