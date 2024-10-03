
package samokat;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MainPage {
    //адрес главной страницы
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //кнопка заказать вверху
    private  static final By ORDER_BUTTON = By.xpath("//button[@class='Button_Button__ra12g']");
    //кнопка заказать внизу
    private  static final By ORDER_BUTTON_DOWN = By.xpath("Button_Button__ra12g Button_Middle__1CSJM");
    //поля заказа :
             // Имя, фамилия, адрес, метро, телефон,
    private static final By NAME = By.xpath ("//input[@placeholder='* Имя']");
    private static final By SURNAME = By.xpath("//input[@placeholder='* Фамилия'] ");
    private static final By ADDRESS = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private static final By METRO_STATION = By.xpath("//div[@class='select-search__value']");
    private static final By VALUE_METRO = By.xpath("///li[@class='select-search__row'][2]");
    private static final By NUMBER_TELEPHONE = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // кнопка Далее
    private  static final By FURTHER_BUTTON = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //поля в след шаге заказа:
             // когда привети самока, срок аренды, цвет самоката, комментарий
    private static final By DELIVERY_DATE = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs react-datepicker-ignore-onclickoutside']");
    private static final By THE_RENTAL_PERIOD = By.xpath("//div[@class='Dropdown-placeholder is-selected']");
    private static final By COLOR_OF_THE_SCOOTER = By.xpath("//label[@for='black']");
    private static final By COMMENT_COURIER = By.xpath("//input[@placeholder='Комментарий для курьера']");
             // кнопка заказать
    private static final By ORDER_BUTTON_2 = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //всплывающее окно подтверждения заказа:
            // кнопка ДА
    private static final By BUTTON_YES = By.xpath("//button[text()='Да'and@class='Button_Button__ra12g Button_Middle__1CSJM']");
            // кнопка НЕТ
    private static final By BUTTON_NO = By.xpath("//button[text()='Нет'and@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']");

    //вопросы о важном:
        //кнопка сколько стоит
    private static final By PRICE_BUTTON = By.xpath("//div[@id='accordion__heading-0']");
       // выпадающий список
    private static final By DROP_TEXT = By.xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

private WebDriver driver;

 public MainPage(WebDriver driver){
 this.driver = driver;
 }

public void open(){
driver.get(PAGE_URL);
}
public void clickButtonOrder(){
     driver.findElement(ORDER_BUTTON).click();
}

    public void clickButtonOrderDown(){
        driver.findElement(ORDER_BUTTON).click();
    }
public void fillInTheNameField(){
     driver.findElement(NAME).sendKeys("Кирилл");
}
    public void fillInTheSurnameField(){
        driver.findElement(SURNAME).sendKeys("Ка");
    }
    public void fillInTheAddressField(){
        driver.findElement(ADDRESS).sendKeys("г. Москва ул. Чистова д.21");
    }
    public void fillInMetroStationField(){
          driver.findElement(METRO_STATION).click();
          WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).
                  until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select-search__select']")));
             driver.findElement(VALUE_METRO).click();
         }
    public void fillInTelephoneField(){
     driver.findElement(NUMBER_TELEPHONE).sendKeys("89262555555");
 }
    public void clickFurtherButton(){
     driver.findElement(FURTHER_BUTTON).click();
    }
    public void fillDateField(){
     driver.findElement(DELIVERY_DATE).sendKeys("31.07.2024");
    }
    public void fillRentalField(){
        driver.findElement(THE_RENTAL_PERIOD).click();
    }
    public void clickColourScooter(){
        driver.findElement(COLOR_OF_THE_SCOOTER).click();
    }
    public void fillCommentCourierField(){
        driver.findElement(COMMENT_COURIER).sendKeys("Привезти к подъезду");
    }
    public void clickButtonOrderSecond(){
     driver.findElement(ORDER_BUTTON_2).click();
    }
    public void clickYesButton(){
     driver.findElement(BUTTON_YES).click();
    }
    public void expectedTrue(){
//     WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(15))
//             .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='Заказ оформлен']")));
        new WebDriverWait(driver, Duration.ofSeconds(25))
                .until(ExpectedConditions.elementToBeClickable(By.className("Button_Button__ra12g Button_Middle__1CSJM")));

    }
}
