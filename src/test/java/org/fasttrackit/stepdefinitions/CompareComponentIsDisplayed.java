package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.RightMenu;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class CompareComponentIsDisplayed extends TestBase {
    @Then("^Compare component is displayed on page$")
    public void compareComponentIsDisplayedOnPage() {

        RightMenu rightMenu = PageFactory.initElements(driver, RightMenu.class);

        assertThat("Compare component is not displayed", rightMenu.getCompareComponent().isDisplayed());
    }
}
