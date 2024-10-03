package samokatTest;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import samokat.ModuleQuestions;

public class TestModuleQuestions {
    WebDriver driver = new ChromeDriver();
    @Test
    public void TheFirstDropDownList () {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickFirstAccordion();
        WebDriverWait firstDrop = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='accordion__panel-17']")));
    }

    @Test
    public void TheSecondDropDownList () {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickSecondAccordion();
        WebDriverWait firstDrop = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='accordion__panel-18']")));
    }

    @Test
    public void TheThirddDropDownList () {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        ModuleQuestions moduleQuestions = new ModuleQuestions(driver);
        moduleQuestions.clickThirdAccordion();
        WebDriverWait firstDrop = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='accordion__panel-19']")));
    }

}
