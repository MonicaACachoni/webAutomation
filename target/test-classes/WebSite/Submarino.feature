@Test
Feature: Select a product at Submarino
  User should be able to acess submarino page

  Scenario Outline: 1 - "SEARCH” a product
    Given the user "<user>" is logged in to Submarino Site
    When product "<product>" are searched
    Then product in shown as available

    Examples:
    | user    | product      | 
    | Pedro   | Harry Potter |
    | Joao    | Star Wars    |