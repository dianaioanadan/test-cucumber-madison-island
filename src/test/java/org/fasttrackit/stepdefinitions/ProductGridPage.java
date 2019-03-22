package org.fasttrackit.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductGrid;
import org.openqa.selenium.support.PageFactory;

public class ProductGridPage extends TestBase {

    private ProductGrid productsGrid = PageFactory.initElements(driver, ProductGrid.class);

    @And("^I sort products by \"([^\"]*)\" in (.+) order$")
    public void iSortProductsByInAscendingOrder(String sortCriteria, String sortDirection) {
        productsGrid.getSortBySelectList().selectByVisibleText(sortCriteria);

        String sortDirectionButtonClass = productsGrid.getSortDirectionButton().getAttribute("class");

        if (
                (sortDirectionButtonClass.contains("--asc")&&sortDirection.equals("descending"))
                        ||
                        (sortDirectionButtonClass.contains("--desc")&&sortDirection.equals("ascending"))
        ){
            productsGrid.getSortDirectionButton().click();
        }
    }
}
