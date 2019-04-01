package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.RightMenu;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class RecentlyViewedProductsComponetIsDisplayed extends TestBase {
    @Then("^Recently Viewed Products Component is displayed$")
    public void recentlyViewedProductsComponentIsDisplayed() {
        RightMenu rightMenu = PageFactory.initElements(driver, RightMenu.class);

        assertThat("Recently viewed products is not displayed", rightMenu.getRecentlyViewedElement().isDisplayed());
    }
}
