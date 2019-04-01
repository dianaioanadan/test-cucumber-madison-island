package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.RightMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClickAddToCompareButton extends TestBase {
    @And("^I click Add to Compare button$")
    public void iClickAddToCompareButton() {

        RightMenu rightMenu = PageFactory.initElements(driver, RightMenu.class);

        String productName1 = "Geometric Candle Holders";
        rightMenu.productNameAddedToCompare(productName1, driver).click();
        String msg1 = driver.findElement(By.xpath("//li[@class='success-msg']")).getText();
        assertThat("Product wasn't added to compare", msg1, is("The product " + productName1 + " has been added to comparison list."));


        String productName2 = "Modern Murray Ceramic Vase";
        rightMenu.productNameAddedToCompare(productName2, driver).click();
        String msg2 = driver.findElement(By.xpath("//li[@class='success-msg']")).getText();
        assertThat("Product wasn't added to compare", msg2, is("The product " + productName2 + " has been added to comparison list."));

    }
}
