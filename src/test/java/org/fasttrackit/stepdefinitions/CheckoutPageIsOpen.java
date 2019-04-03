package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.Checkout;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutPageIsOpen extends TestBase {
    @Then("^Checkout page is open$")
    public void checkoutPageIsOpen() {

        String productName = "Geometric Candle Holders";


        String msg = driver.findElement(By.className("success-msg")).getText();

        assertThat("Success message is not displayed", msg, CoreMatchers.is(productName + " was added to your shopping cart."));

        Checkout checkout = PageFactory.initElements(driver, Checkout.class);
        assertThat("Product is not on cart page", checkout.productNameAddedToCart(productName, driver).isDisplayed());
    }
}
