package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

public class ClickOnProductName extends TestBase {
    @And("^I click on product name$")
    public void iClickOnProductName() {
        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);
        productGrid.getProductName().click();
    }
}
