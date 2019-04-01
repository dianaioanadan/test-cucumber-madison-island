package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class VerifyCategoryPage extends TestBase {
    @Then("^Category page is open$")
    public void categoryPageIsOpen() {

        String URL = driver.getCurrentUrl();

        assertThat("User is not on the right page", URL, is("https://fasttrackit.org/selenium-test/vip.html"));
    }
}
