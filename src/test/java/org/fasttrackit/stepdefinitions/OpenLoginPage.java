package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.AppConfig;
import org.fasttrackit.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OpenLoginPage extends TestBase {
    @Then("^Login page is open$")
    public void loginPageIsOpen() {
        String URL = driver.getCurrentUrl();

        assertThat("Product page is not open.", URL, is(AppConfig.getSiteUrl() + "customer/account/login/"));
    }
}
