package samokat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModuleQuestions {
    private WebDriver driver;

    public ModuleQuestions(WebDriver driver) {
        this.driver = driver;
    }

    //адрес главной страницы
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //Первый аккордеон
    public static final By FIRST_ACCORDION = By.xpath("//div[@id='accordion__heading-16']");
    //второй аккордено
    public static final By SECOND_ACCORDION = By.xpath("//div[@id='accordion__heading-17']");
    //третий аккордеон
    public static final By THIRD_ACCORDION = By.xpath("//div[@id='accordion__heading-18']");

    public void open() {
        driver.get(PAGE_URL);
    }

    public void clickFirstAccordion() {
        driver.findElement(FIRST_ACCORDION).click();
    }

    public void clickSecondAccordion() {
        driver.findElement(SECOND_ACCORDION).click();
    }

    public void clickThirdAccordion() {
        driver.findElement(THIRD_ACCORDION).click();
    }

    public void ExpectedResponseMenu() {
//     WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(15))
//             .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='Заказ оформлен']")));
        new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.className("Button_Button__ra12g Button_Middle__1CSJM")));

    }

    public void responseMenu() {
        WebDriverWait firstDrop = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='accordion__panel-18']")));
    }

    public void responseMenuSecond(){
        WebDriverWait firstDrop = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='accordion__panel-19']")));
    }
}
