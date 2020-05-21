package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookFlight {

    private By usernameLocator = By.name("userName");
    private By passwordLocator = By.name("password");
    private By loginLocator = By.name("login");
    private By fromPortLocator = By.name("fromPort");
    private By fromDayLocator = By.name("fromDay");
    private By toDayLocator = By.name("toDay");
    private By continueLocator = By.name("findFlights");
    private By continueReservationLocator = By.name("reserveFlights");
    private By buyFlightsLocator = By.name("buyFlights");
    private By printLocator = By.cssSelector("img[src='/images/printit.gif']");


    public BookFlight(){
        open("http://newtours.demoaut.com/mercuryreservation.php");
    }

    public void with(String username,String password){

        $(usernameLocator).val(username);
        $(passwordLocator).val(password);
        $(loginLocator).click();
        $(fromPortLocator).selectOption("Frankfurt");
        $(fromDayLocator).selectOption("20");
        $(toDayLocator).selectOption("27");
        $(continueLocator).click();
        $(continueReservationLocator).click();
        $(buyFlightsLocator).click();
    }
    public void assertValidBookFlight(){
        $(printLocator).shouldBe(Condition.visible).waitUntil(Condition.visible,4000);
    }


}
