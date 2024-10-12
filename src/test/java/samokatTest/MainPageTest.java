package samokatTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import samokat.MainPage;

import java.time.Duration;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();


    @Test
    public void CheckingTheOrderUsingTheTopButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickButtonOrder();
        mainPage.userForm("Кирилл", "Ка", "г. Москва ул. Чистова д.21", "89262555555");
//        mainPage.fillInTheNameField("Кирилл");
//        mainPage.fillInTheSurnameField("Ка");
//        mainPage.fillInTheAddressField("г. Москва ул. Чистова д.21");
        mainPage.fillInMetroStationField();
//        mainPage.fillInTelephoneField("89262555555");
        mainPage.clickFurtherButton();
        mainPage.fillDateField("31.07.2024");
        mainPage.fillRentalField();
        mainPage.clickColourScooter();
        mainPage.fillCommentCourierField("Привезти к подъезду");
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
        mainPage.userForm("Кирилл", "Ка", "г. Москва ул. Чистова д.21", "89262555555");
//        mainPage.fillInTheNameField("Кирилл");
//        mainPage.fillInTheSurnameField("Ка");
//        mainPage.fillInTheAddressField("г. Москва ул. Чистова д.21");
        mainPage.fillInMetroStationField();
//        mainPage.fillInTelephoneField("89262555555");
        mainPage.clickFurtherButton();
        mainPage.fillDateField("31.07.2024");
        mainPage.fillRentalField();
        mainPage.clickColourScooter();
        mainPage.fillCommentCourierField("Привезти к подъезду");
        mainPage.clickButtonOrderSecond();
        mainPage.clickYesButton();
        mainPage.expectedTrue();



    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
