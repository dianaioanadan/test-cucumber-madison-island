package org.fasttrackit.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchedProductsAreDisplayed extends TestBase {
    @Then("^\"([^\"]*)\" products are displayed$")
    public void productsAreDisplayed(String keyword) {
        List<WebElement> productNameContainers = driver.findElements(By.cssSelector(".product-name >a"));

        for (WebElement containers : productNameContainers) {
            String productName = containers.getText();

            assertThat("Some of the products names, do not contain the search heyword", productName, containsString(keyword.toUpperCase()));
        }
    }
}

