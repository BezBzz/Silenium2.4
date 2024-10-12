package samokat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPage {
    //адрес главной страницы
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //кнопка заказать вверху
    private static final By ORDER_BUTTON = By.xpath("//button[@class='Button_Button__ra12g']");
    //кнопка заказать внизу
    //  private static final By ORDER_BUTTON_DOWN = By.xpath("Button_Button__ra12g Button_Middle__1CSJM");
    //поля заказа :
    // Имя, фамилия, адрес, метро, телефон,
    private static final By NAME = By.xpath("//input[@placeholder='* Имя']");
    private static final By SURNAME = By.xpath("//input[@placeholder='* Фамилия'] ");
    private static final By ADDRESS = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private static final By METRO_STATION = By.xpath("//div[@class='select-search__value']");
    private static final By VALUE_METRO = By.xpath("///li[@class='select-search__row'][2]");
    private static final By NUMBER_TELEPHONE = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // кнопка Далее
    private static final By FURTHER_BUTTON = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //поля в след шаге заказа:
    // когда привезти самокат, срок аренды, цвет самоката, комментарий
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
    //  private static final By BUTTON_NO = By.xpath("//button[text()='Нет'and@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']");

    //вопросы о важном:
    //кнопка сколько стоит
    //  private static final By PRICE_BUTTON = By.xpath("//div[@id='accordion__heading-0']");
    // выпадающий список
    //  private static final By DROP_TEXT = By.xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(PAGE_URL);
    }

    public void clickButtonOrder() {
        driver.findElement(ORDER_BUTTON).click();
    }

    public void clickButtonOrderDown() {
        driver.findElement(ORDER_BUTTON).click();
    }

    public void fillInTheNameField(String name) {
        driver.findElement(NAME).sendKeys(name);
    }

    public void fillInTheSurnameField(String Surname) {
        driver.findElement(SURNAME).sendKeys(Surname);
    }

    public void fillInTheAddressField(String address) {
        driver.findElement(ADDRESS).sendKeys(address);
    }

    public void userForm(String name, String surname, String address, String telephone) {
        fillInTheNameField(name);
        fillInTheSurnameField(surname);
        fillInTheAddressField(address);
        fillInTelephoneField(telephone);

    }

    public void fillInMetroStationField() {
        driver.findElement(METRO_STATION).click();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select-search__select']")));
        driver.findElement(VALUE_METRO).click();
    }

    public void fillInTelephoneField(String telephone) {
        driver.findElement(NUMBER_TELEPHONE).sendKeys(telephone);
    }

    public void clickFurtherButton() {
        driver.findElement(FURTHER_BUTTON).click();
    }

    public void fillDateField(String date) {
        driver.findElement(DELIVERY_DATE).sendKeys(date);
    }

    public void fillRentalField() {
        driver.findElement(THE_RENTAL_PERIOD).click();
    }

    public void clickColourScooter() {
        driver.findElement(COLOR_OF_THE_SCOOTER).click();
    }

    public void fillCommentCourierField(String comment) {
        driver.findElement(COMMENT_COURIER).sendKeys(comment);
    }

    public void clickButtonOrderSecond() {
        driver.findElement(ORDER_BUTTON_2).click();
    }

    public void clickYesButton() {
        driver.findElement(BUTTON_YES).click();
    }

    public void expectedTrue() {
//     WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(15))
//             .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='Заказ оформлен']")));
        new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.className("Button_Button__ra12g Button_Middle__1CSJM")));

    }
}
