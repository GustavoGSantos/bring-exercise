package support;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarouselHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public CarouselHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout de 10 segundos
    }

    public void clickUntilCarouselAnimationEnds(By carouselButton, By carouselList, By dateButton, int maxClicks) {
        WebElement carouselListElement = wait.until(ExpectedConditions.visibilityOfElementLocated(carouselList));
        WebElement carouselButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(carouselButton));

        for (int i = 0; i <= maxClicks; i++) {
            carouselButtonElement.click();
            waitForAnimationToEnd(carouselListElement);
        }

        driver.findElement(dateButton).click();
    }

    public void waitForAnimationToEnd(WebElement carouselList) {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(carouselList, "class", "ng-animating")));
    }
}