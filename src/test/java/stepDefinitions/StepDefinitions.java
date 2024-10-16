package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import support.Config;
import pages.*;


public class StepDefinitions {
    WebDriver driver = Config.getDriver();
    HomePage homePage = new HomePage(driver);
    FlightPage flightPage = new FlightPage(driver);

    @Given("I am in the ryanair page")
    public void i_am_in_the_ryanair_page() {
        driver.get(Config.getHomePageUrl());
        homePage.clickAcceptCookie();
    }

    @When("I select the departure airport is {string}")
    public void i_select_the_departure_airport_is(String string) {
        homePage.setDepartureLocation(string);
    }

    @When("I select the destination is {string}")
    public void i_select_the_destination_is(String string) {
        homePage.setDestination(string);
    }

    @When("I select the departure date")
    public void i_select_the_departure_date() {
        homePage.setDepartDate();
    }

    @When("I select the return date")
    public void i_select_the_return_date() {
        homePage.setReturnDate();
    }

    @When("I add {int} adults")
    public void i_add_adults(Integer adult) {
        homePage.addAdults(adult);
    }

    @When("I add {int} children")
    public void i_add_children(Integer child) {
        homePage.addChildrens(child);
    }

    @When("I search for the flight")
    public void i_search_for_the_flight() {
        homePage.searchFlight();
    }

    @When("I change the departure date")
    public void i_change_the_departure_date() {
        flightPage.changeDepartureDate();
    }

    @When("I change the return date")
    public void i_change_the_return_date() {
        flightPage.changeReturnDate();
    }

    @When("I select the flights")
    public void i_select_the_flights() {
        flightPage.selectFlights();
    }

    @When("I select the basic fare")
    public void i_select_the_basic_fare() {
        flightPage.selectBasicFare();
    }

    @When("I fill the first passenger name {string} and surename {string}")
    public void i_fill_the_first_passenger_name_and_surename(String name, String surname) {
        flightPage.fillFirstPassengerInformation(name, surname);
    }

    @When("I fill the second passenger name {string} and surename {string}")
    public void i_fill_the_second_passenger_name_and_surename(String name, String surname) {
        flightPage.fillSecondPassengerInformation(name, surname);
    }

    @When("I fill the third passenger name {string} and surename {string}")
    public void i_fill_the_third_passenger_name_and_surename(String name, String surname) {
        flightPage.fillThirdPassengerInformation(name, surname);
    }

    @When("I select the seats of first flight")
    public void i_select_the_seats_of_first_flight() {
        flightPage.selectTheFirstFlightSeat();
    }

    @When("I select the seats of second flight")
    public void i_select_the_seats_of_second_flight() {
        flightPage.selectThesecondFlightSeat();
    }

    @When("I select the small bag")
    public void i_select_the_small_bag() {
        flightPage.selectSmallBag();
    }

    @When("I follow to the payment page")
    public void i_follow_to_the_payment_page() {
        flightPage.continueToPayment();
    }

    @Then("I expect to be in the payment page")
    public void i_expect_to_be_in_the_payment_page() {
        flightPage.validateRentCarPage();
    }
}
