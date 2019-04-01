package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

public class ClickWishListButton extends TestBase {
    @When("^I click on wishlist button$")
    public void iClickOnWishlistButton() {

        String productName = "Geometric Candle Holders";

        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);
        productGrid.getAddToWishListtButton(productName, driver).click();
    }
}
