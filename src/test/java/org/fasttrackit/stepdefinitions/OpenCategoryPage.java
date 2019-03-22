package org.fasttrackit.stepdefinitions;

import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.NavBar;
import org.openqa.selenium.support.PageFactory;

public class OpenCategoryPage extends TestBase{

    private NavBar navBar = PageFactory.initElements(driver, NavBar.class);

    @When("^Open category page$")
    public void openCategoryPage() {

        navBar.getVipPage().click();

    }
}
