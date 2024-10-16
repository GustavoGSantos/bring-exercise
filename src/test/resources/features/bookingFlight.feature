Feature: Booking a flight

  Scenario: Booking a flight from Lisbon to Paris-Beauvais
    Given I am in the ryanair page
    When I select the departure airport is "Lisbon"
    And I select the destination is "Paris Beauvais"
    And I select the departure date
    And I select the return date
    And I add 2 adults
    And I add 1 children
    And I search for the flight
    And I change the departure date
    And I change the return date
    And I select the flights
    And I select the basic fare
    And I fill the first passenger name "Diogo" and surename "Bettencourt"
    And I fill the second passenger name "Sónia" and surename "Pereira"
    And I fill the third passenger name "Inês" and surename "Marçal"
    And I select the seats of first flight
    And I select the seats of second flight
    And I select the small bag
    And I follow to the payment page
    Then I expect to be in the payment page
