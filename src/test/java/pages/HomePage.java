package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By acceptCookieButton = By.cssSelector("#cookie-popup-with-overlay button:nth-child(3)");
    private By departureField = By.id("input-button__departure");
    private By departureAirportButton = By.cssSelector("[data-id='LIS']");
    private By destinationField = By.id("input-button__destination");
    private By destinationAirportButton = By.cssSelector("[data-id='BVA']");
    private By departDatePicker = By.cssSelector("[data-id='2024-11-06']");
    private By monthSelectButton = By.cssSelector(
            "month-toggle > div > div.m-toggle__scrollable > div > div:nth-child(4) > div.m-toggle__month");
    private By returnDatePicker = By.cssSelector("[data-id='2025-01-30']");
    private By passengersField = By.cssSelector("[uniqueid='passengers']");
    private By addAdultPassengerButton = By
            .cssSelector("ry-passengers-picker > ry-counter:nth-child(3) > div.counter > div:last-child");
    private By addChildPassengerButton = By
            .cssSelector("ry-passengers-picker > ry-counter:nth-child(5) > div.counter > div:last-child");
    private By searchFlightButton = By
            .cssSelector("div.flight-search-widget__start-search.ng-tns-c4176492846-4.ng-star-inserted > button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAcceptCookie() {
        driver.findElement(acceptCookieButton).click();
    }

    public void setDepartureLocation(String departure) {
        driver.findElement(departureField).click();
        WebElement departureAirportElement = wait
                .until(ExpectedConditions.visibilityOfElementLocated(departureAirportButton));

        departureAirportElement.click();
    }

    public void setDestination(String destination) {
        driver.findElement(destinationField).sendKeys(destination);
        WebElement destinationAirpotElement = wait
                .until(ExpectedConditions.visibilityOfElementLocated(destinationAirportButton));

        destinationAirpotElement.click();
    }

    public void setDepartDate() {
        WebElement departDatePickerElement = wait
                .until(ExpectedConditions.visibilityOfElementLocated(departDatePicker));
        departDatePickerElement.click();
    }

    public void setReturnDate() {
        WebElement monthSelectButtonElement = wait
                .until(ExpectedConditions.visibilityOfElementLocated(monthSelectButton));
        monthSelectButtonElement.click();
        WebElement returnDatePickerElement = wait
                .until(ExpectedConditions.visibilityOfElementLocated(returnDatePicker));
        returnDatePickerElement.click();
    }

    public void addAdults(int adult) {
        driver.findElement(passengersField).click();
        for (int i = 1; i < adult; i++) {
            driver.findElement(addAdultPassengerButton).click();
        }
    }

    public void addChildrens(int children) {
        for (int i = 0; i < children; i++) {
            driver.findElement(addChildPassengerButton).click();
        }
    }

    public void searchFlight() {
        driver.findElement(searchFlightButton).click();
    }
}