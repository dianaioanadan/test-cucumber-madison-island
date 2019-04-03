package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.FilterBy;
import org.openqa.selenium.support.PageFactory;

public class ClickFilterByPrice extends TestBase {
    @And("^I click on filter by price option$")
    public void iClickOnFilterByPriceOption() {
        FilterBy filterBy = PageFactory.initElements(driver, FilterBy.class);
        filterBy.getPrice().click();
    }
}
