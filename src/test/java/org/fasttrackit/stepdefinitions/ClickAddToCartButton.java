package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

public class ClickAddToCartButton extends TestBase {
    @And("^I click Add to Cart button$")
    public void iClickAddToCartButton() {
        String productName = "Geometric Candle Holders";

        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);
        productGrid.getAddToCartButton(productName, driver).click();
    }
}
