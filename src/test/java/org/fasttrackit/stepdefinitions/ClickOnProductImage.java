package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

public class ClickOnProductImage extends TestBase {
    @And("^I click on product image$")
    public void iClickOnProductImage() {

        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);
        productGrid.getProductImage().click();
    }
}
