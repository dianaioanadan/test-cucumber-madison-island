package org.fasttrackit.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class ProductsAreSortedCorrectly extends TestBase {
    public double convertPrice(String priceString) {
        String[] newPriceString = priceString.split(" ");
        String intPriceString = newPriceString[0];
        String stringPriceString = newPriceString[1];
        intPriceString = intPriceString.replace(",", ".");
        Double priceValue = Double.parseDouble(intPriceString);
        return priceValue;
    }

    private void assertCorrectSortByPrice(Comparator comparator) {
        List<Double> prices = productsGrid.getActualProductPricesAsDouble();
        List<Double> sortedPriced = new ArrayList<>(prices);
        sortedPriced.sort(comparator);
        assertThat("Products are not sorted correctly.", prices, equalTo(sortedPriced));
    }

    private ProductGrid productsGrid = PageFactory.initElements(driver, ProductGrid.class);

    @Then("^All products are sorted by \"([^\"]*)\" in (.+) order$")
    public void allProductsAreSortedByInAccendingOrder(String sortCriteria, String sortDirection) {

        Comparator comparator;

        if (sortDirection.equalsIgnoreCase("ascending")) {
            comparator = Comparator.naturalOrder();
        } else {
            comparator = Comparator.reverseOrder();
        }

        if (sortCriteria.equalsIgnoreCase("Price")) {
            assertCorrectSortByPrice(comparator);
        }
        else{
            throw new PendingException("Assertion for sort by "+ sortCriteria + " not implemented.");
        }

        List<Double> prices = productsGrid.getActualProductPricesAsDouble();
        List<Double> sortedPriced = new ArrayList<>(prices);
        sortedPriced.sort(comparator);
        assertThat("Products are not sorted correctly.", prices, equalTo(sortedPriced));
    }
}
