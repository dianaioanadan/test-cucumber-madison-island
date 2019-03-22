package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Given;
import org.fasttrackit.AppConfig;
import org.fasttrackit.TestBase;

public class HomePageSteps extends TestBase {
    @Given("^I open the home page$")
    public void iOpenTheHomePage() {
        driver.get(AppConfig.getSiteUrl());
    }
}
