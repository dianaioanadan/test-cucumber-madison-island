package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProductsAreFIlterCorrectly extends TestBase {
    @Then("^All products are filter by price$")
    public void allProductsAreFilterByPrice() {

        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);

        List<Double> prices = productGrid.getActualProductPricesAsDouble();


        Boolean expectedResult = true;
        int i;

        for(i=0;i<prices.size();i++){
            if ((0>prices.get(i))&(prices.get(i)>100)){
                expectedResult = false;
            }
        }


        assertThat("Filter by price is not working.", expectedResult, is(true));
    }
}
