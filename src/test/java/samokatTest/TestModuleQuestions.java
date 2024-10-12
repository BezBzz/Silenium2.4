package samokatTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import samokat.ModuleQuestions;

import java.time.Duration;

public class TestModuleQuestions {
    WebDriver driver = new ChromeDriver();

    @Test
    public void TheFirstDropDownList() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickFirstAccordion();
        moduleQuestions.ExpectedResponseMenu();
    }

    @Test
    public void TheSecondDropDownList() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickSecondAccordion();
        moduleQuestions.responseMenu();
    }

    @Test
    public void TheThirdDropDownList() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickThirdAccordion();
        moduleQuestions.responseMenuSecond();
    }

}
