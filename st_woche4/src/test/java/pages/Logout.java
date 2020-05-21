package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Logout {

    private By usernameLocator = By.name("userName");
    private By passwordLocator = By.name("password");
    private By loginButtonLocator = By.name("login");
    private By logoffLocator = By.xpath("//a[@href='mercurysignoff.php']");
    private By signOnLocator = By.xpath("//a[@href='mercurysignon.php']");

    public Logout(){
        open("http://newtours.demoaut.com/mercurysignon.php");
    }


    public void with(String username,String password){

        $(usernameLocator).val(username);
        $(passwordLocator).val(password);
        $(loginButtonLocator).click();
        $(logoffLocator).click();
    }

    public void assertValidLogout(){
        $(signOnLocator).shouldBe(Condition.visible).waitUntil(Condition.visible,4000);
    }
}
