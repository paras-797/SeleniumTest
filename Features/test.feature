Feature: Testing Google Search page		


Scenario: Verificaton of string search


Given Open the "http://google.co.in" in chrome


When Users enters "selenium" in search box and selects suggestion no. 1


Then user should see result page