package samokatTest;
import java.time.Duration;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import samokat.MainPage;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();



    @Test
    public void CheckingTheOrderUsingTheTopButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickButtonOrder();
        mainPage.fillInTheNameField();
        mainPage.fillInTheSurnameField();
        mainPage.fillInTheAddressField();
        mainPage.fillInMetroStationField();
        mainPage.fillInTelephoneField();
        mainPage.clickFurtherButton();
        mainPage.fillDateField();
        mainPage.fillRentalField();
        mainPage.clickColourScooter();
        mainPage.fillCommentCourierField();
        mainPage.clickButtonOrderSecond();
        mainPage.clickYesButton();
        mainPage.expectedTrue();

     }
    @Test
    public void CheckingTheOrderUsingTheDownButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickButtonOrderDown();
        mainPage.fillInTheNameField();
        mainPage.fillInTheSurnameField();
        mainPage.fillInTheAddressField();
        mainPage.fillInMetroStationField();
        mainPage.fillInTelephoneField();
        mainPage.clickFurtherButton();
        mainPage.fillDateField();
        mainPage.fillRentalField();
        mainPage.clickColourScooter();
        mainPage.fillCommentCourierField();
        mainPage.clickButtonOrderSecond();
        mainPage.clickYesButton();
        mainPage.expectedTrue();



    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
