import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.By;

public class Login {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButton = By.cssSelector("button");
    private By validLoginLocator = By.cssSelector(".flash.success");

    public Login(){
        open("http://the-internet.herokuapp.com/login");
    }

    public void with(String username,String password){
        $(usernameLocator).val(username);
        $(passwordLocator).val(password);
        $(loginButton).click();
    }

    public void assertValidLogin(){
        $(validLoginLocator).shouldBe(Condition.visible).waitUntil(Condition.visible,4000);
    }

}
