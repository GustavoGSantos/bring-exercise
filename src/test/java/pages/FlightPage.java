package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import support.CarouselHelper;

public class FlightPage {
        private WebDriver driver;
        private WebDriverWait wait;
        private CarouselHelper carouselHelper;

        private By loadingSpinnerFlightFrom = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div:nth-child(1) > journey-container > journey > flight-list > ry-spinner > div");
        private By departureNextCarouselButton = By
                        .cssSelector("carousel > div > button.carousel-next.ng-tns-c556924221-12 > carousel-arrow");
        private By carouselFromFlightList = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div:nth-child(1) > journey-container > journey > div > div.ng-tns-c200133925-5.ng-trigger.ng-trigger-flightCardAnimate.header__carousel > div > carousel-container > carousel > div > ul");
        private By carouselReturnFlightList = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div.inbound.ng-tns-c588612884-4.inbound--unconfirmed > journey-container > journey > div > div.ng-tns-c200133925-9.ng-trigger.ng-trigger-flightCardAnimate.header__carousel > div > carousel-container > carousel > div > ul");
        private By departureDateButton = By
                        .cssSelector("carousel-container > carousel > div > ul > li:nth-child(3) > carousel-item > button");
        private By returnDateButton = By.cssSelector(
                        "div.ng-tns-c200133925-9.ng-trigger.ng-trigger-flightCardAnimate.header__carousel > div > carousel-container > carousel > div > ul > li:nth-child(5) > carousel-item > button");
        private By fromFlightSelectButton = By
                        .cssSelector("flight-card-new > div > div flight-card-summary > div > button");
        private By loadingSpinnerFlightReturn = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div.inbound.ng-tns-c588612884-4.inbound--unconfirmed > journey-container > journey > flight-list > ry-spinner > div");
        private By returnFlightSelectButton = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > flights-summary-container > flights-summary > div > div.inbound.ng-tns-c588612884-4.inbound--unconfirmed > journey-container > journey > flight-list > ry-spinner > div > flight-card-new.flight.flight-card.ng-tns-c997856176-23.ng-trigger.ng-trigger-flightCardAnimate.ng-tns-c3904981419-10.ng-star-inserted.flight-card--hover-enabled > div > div > div.flight-card__summary.ng-tns-c997856176-23.ng-star-inserted > flight-card-summary > div.flight-card-summary__footer.ng-tns-c2841652257-25 > button");
        private By selectBasicFareButton = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > fare-selector-container > fare-selector > div > fare-table-new-layout-container > fare-table-new-layout > table > thead > tr > th:nth-child(2) > div");
        private By confirmFareButton = By.cssSelector("#ry-modal-portal fare-table-upgrade-footer > button");
        private By loginLaterButton = By.cssSelector("ry-login-touchpoint > div > button");
        private By firstPassengerTitleButton = By.cssSelector(
                        "form > pax-passenger-container:nth-child(1) #title-0-error-message > div.dropdown.body-l-lg.body-l-sm > button");
        private By mrTitleButton = By.cssSelector(
                        "form > pax-passenger-container:nth-child(1) #title-0-error-message > div.dropdown.body-l-lg.body-l-sm.dropdown--opened > div > div > ry-dropdown-item:nth-child(1) > button");
        private By firstPassengerNameField = By.cssSelector("#form\\.passengers\\.ADT-0\\.name");
        private By firstPassengerLastNameField = By.cssSelector("#form\\.passengers\\.ADT-0\\.surname");
        private By secondPassengerTitleButton = By.cssSelector(
                        "form > pax-passenger-container:nth-child(2) #title-0-error-message > div.dropdown.body-l-lg.body-l-sm > button");
        private By mrsTitleButton = By.cssSelector(
                        "form > pax-passenger-container:nth-child(2) #title-0-error-message > div.dropdown.body-l-lg.body-l-sm.dropdown--opened > div > div > ry-dropdown-item:nth-child(2) > button");
        private By secondPassengerNameField = By.cssSelector("#form\\.passengers\\.ADT-1\\.name");
        private By secondPassengerLastNameField = By.cssSelector("#form\\.passengers\\.ADT-1\\.surname");
        private By childPassengerNameField = By.cssSelector("#form\\.passengers\\.CHD-0\\.name");
        private By childPassengerLastNameField = By.cssSelector("#form\\.passengers\\.CHD-0\\.surname");
        private By continueButton = By.cssSelector(
                        "body > app-root > flights-root > div > div > div > div > flights-lazy-content > ng-component > div > continue-flow-container > continue-flow > div > div > span > button");
        private By familySeatingButton = By.cssSelector("#ry-modal-portal > div > ng-component > ry-dialog > div.dialog.dialog--desktop > div.seats-modal__content > div.seats-modal__buttons > button");
        private By firstFlightSeatFromButton = By.id("seat-08D");
        private By secondFlightSeatFromButton = By.id("seat-08E");
        private By thirdFlightSeatFromButton = By.id("seat-08F");
        private By nextFlightButton = By.cssSelector(
                        "#main-content > div.app-component__content > ng-component > seats-container-v2 > main > div > div > div > div > div > div > div:nth-child(3) > div > passenger-carousel > div > button");
        private By firstFlightSeatReturnButton = By.id("seat-08D");
        private By secondFlightSeatReturnButton = By.id("seat-08E");
        private By thirdFlightSeatReturnButton = By.id("seat-08F");
        private By continueSeatButton = By.cssSelector(
                        "#main-content > div.app-component__content > ng-component > seats-container-v2 > main > div > div > div > div > div > div > div:nth-child(3) > div > passenger-carousel > div > button");
        private By noFastTrackButton = By.cssSelector(
                        "body > seats-root > div > personalization-takeovers > ry-message-renderer:nth-child(2) > ng-component > ry-enhanced-takeover-beta-desktop > div > div.enhanced-takeover-beta__product > div.enhanced-takeover-beta__product-actions > div.enhanced-takeover-beta__product-actions-item.ng-star-inserted > button");

        private By oneSmallBagButton = By.cssSelector("bags-cabin-bag-section ry-radio-button > label");
        private By bagContinueButton = By.cssSelector(
                        "#main-content > div > section.booking-content__section.booking-content__section--continue-flow > bags-continue-flow-container > bags-continue-flow > button");
        private By noTravelProtectionButton = By.cssSelector(
                        "#main-content > div > main > div > personalization-takeovers > ry-message-renderer:nth-child(4) > ng-component > ry-enhanced-takeover-desktop > div > div.enhanced-takeover__product > button.enhanced-takeover__product-dismiss-cta.ry-button--anchor-blue.ry-button--anchor.ng-star-inserted");
        private By fastTrackContinueButton = By
                        .cssSelector("#main-content > div > main > div > airport-and-flight-container > button");
        private By rentCarPageMessage = By
                        .cssSelector("#main-content > div > main > div > ng-component > extras-header-2 > div > h3");

        public FlightPage(WebDriver driver) {
                this.driver = driver;
                this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                this.carouselHelper = new CarouselHelper(driver);
        }

        public void changeDepartureDate() {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinnerFlightFrom));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingSpinnerFlightReturn));
                CarouselHelper carouselHelper = new CarouselHelper(driver);

                carouselHelper.clickUntilCarouselAnimationEnds(departureNextCarouselButton, carouselFromFlightList,
                                departureDateButton, 6);
        }

        public void changeReturnDate() {
                WebElement carouselReturnElement = driver.findElement(carouselReturnFlightList);
                carouselHelper.waitForAnimationToEnd(carouselReturnElement);
                driver.findElement(returnDateButton).click();
        }

        public void selectFlights() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(fromFlightSelectButton));
                driver.findElement(fromFlightSelectButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(returnFlightSelectButton));
                driver.findElement(returnFlightSelectButton).click();
        }

        public void selectBasicFare() {
                WebElement selectBasicFareElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(selectBasicFareButton));
                selectBasicFareElement.click();
                WebElement confirmFareElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(confirmFareButton));
                confirmFareElement.click();
                WebElement loginLaterElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(loginLaterButton));
                loginLaterElement.click();
        }

        public void fillFirstPassengerInformation(String name, String surename) {
                WebElement firstPassengerTitleElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(firstPassengerTitleButton));
                firstPassengerTitleElement.click();
                WebElement mrTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mrTitleButton));
                mrTitleElement.click();
                driver.findElement(firstPassengerNameField).sendKeys(name);
                driver.findElement(firstPassengerLastNameField).sendKeys(surename);
        }

        public void fillSecondPassengerInformation(String name, String surename) {
                WebElement secondPassengerTitleElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(secondPassengerTitleButton));
                secondPassengerTitleElement.click();
                WebElement mrstitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mrsTitleButton));
                mrstitleElement.click();
                driver.findElement(secondPassengerNameField).sendKeys(name);
                driver.findElement(secondPassengerLastNameField).sendKeys(surename);
        }

        public void fillThirdPassengerInformation(String name, String surename) {
                driver.findElement(childPassengerNameField).sendKeys(name);
                driver.findElement(childPassengerLastNameField).sendKeys(surename);
                driver.findElement(continueButton).click();
        }

        public void selectTheFirstFlightSeat() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(familySeatingButton));
                driver.findElement(familySeatingButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstFlightSeatFromButton));
                driver.findElement(firstFlightSeatFromButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(secondFlightSeatFromButton));
                driver.findElement(secondFlightSeatFromButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(thirdFlightSeatFromButton));
                driver.findElement(thirdFlightSeatFromButton).click();
                driver.findElement(nextFlightButton).click();
        }

        public void selectThesecondFlightSeat() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstFlightSeatReturnButton));
                driver.findElement(firstFlightSeatReturnButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(secondFlightSeatReturnButton));
                driver.findElement(secondFlightSeatReturnButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(thirdFlightSeatReturnButton));
                driver.findElement(thirdFlightSeatReturnButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(continueSeatButton));
                driver.findElement(continueSeatButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(noFastTrackButton));
                driver.findElement(noFastTrackButton).click();
        }

        public void selectSmallBag() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(oneSmallBagButton));
                driver.findElement(oneSmallBagButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(bagContinueButton));
                driver.findElement(bagContinueButton).click();
        }

        public void continueToPayment() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(noTravelProtectionButton));
                driver.findElement(noTravelProtectionButton).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(fastTrackContinueButton));
                driver.findElement(fastTrackContinueButton).click();
        }

        public void validateRentCarPage() {
                WebElement rentCarPageMessageElement = wait
                                .until(ExpectedConditions.visibilityOfElementLocated(rentCarPageMessage));
                String actualMessage = rentCarPageMessageElement.getText();
                assertEquals("Make sure you've got all your transport sorted", actualMessage);
        }
}
