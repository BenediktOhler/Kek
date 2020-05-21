package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Register {
    private By firstnameLocator = By.name("firstName");
    private By lastnameLocator = By.name("lastName");
    private By phoneLocator = By.name("phone");
    private By emailLocator = By.id("userName"); // E-Mail Feld
    private By address1Locator = By.name("address1");
    private By address2Locator = By.name("address2");
    private By cityLocator = By.name("city");
    private By stateLocator = By.name("state");
    private By postalcodeLocator = By.name("postalCode");
    private By countryLocator = By.name("country");
    private By usernameLocator = By.id("email"); // Username Feld
    private By passwordLocator = By.name("password");
    private By confirmPasswordLocator = By.name("confirmPassword");
    private By buttonLocator = By.name("register");




    public Register(){
        open("http://newtours.demoaut.com/mercuryregister.php");
    }

    public void with(String username, String password){
        $(firstnameLocator).val("Benedikt");
        $(lastnameLocator).val("Ohler");
        $(phoneLocator).val("12345678");
        $(emailLocator).val("testmail@gmx.de");
        $(address1Locator).val("Langeoogerstraße");
        $(address2Locator).val("2");
        $(cityLocator).val("Wiesbaden");
        $(stateLocator).val("Hessen");
        $(postalcodeLocator).val("65199");
        $(countryLocator).selectOption("GERMANY");
        $(usernameLocator).val(username);
        $(passwordLocator).val(password);
        $(confirmPasswordLocator).val(password);
        $(buttonLocator).click();
    }

    public void assertValidRegister(){
        // startsWith nötig, da hinter dem account_success immer noch eine random-ID drangehängt wird
        Assert.assertTrue(url().startsWith("http://newtours.demoaut.com/create_account_success.php"));
    }
}
