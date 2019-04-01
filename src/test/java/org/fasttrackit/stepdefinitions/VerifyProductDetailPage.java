package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.AppConfig;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductPage;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class VerifyProductDetailPage extends TestBase {
    @Then("^Product detail page is open$")
    public void productDetailPageIsOpen() {
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        String URL = driver.getCurrentUrl();

        assertThat("Product page is not open.", URL, is(AppConfig.getSiteUrl() + "vip/a-tale-of-two-cities.html"));
        assertThat("Product page is not open.",productPage.getProductPageTitle().isDisplayed());
    }
}
