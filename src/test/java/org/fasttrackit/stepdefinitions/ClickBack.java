package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;

public class ClickBack extends TestBase {
    @And("^I click back$")
    public void iClickBack() {
        driver.navigate().back();
    }
}
