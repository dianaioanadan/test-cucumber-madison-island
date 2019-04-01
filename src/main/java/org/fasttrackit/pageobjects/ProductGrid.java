package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductGrid {

    public WebElement getAddToCartButton(String productName, WebDriver driver){
        return   driver.findElement(By.xpath("//div[@class='product-info' and .//a[text()= '"+productName+"']]//button[@title='Add to Cart']"));
    }

    public WebElement getAddToWishListtButton(String productName, WebDriver driver){
        return   driver.findElement(By.xpath("//div[@class='product-info' and .//a[text()= '"+productName+"']]//a[@class='link-wishlist']"));
    }

    @FindBy(css = ".sort-by select")
    private  WebElement sortBySelectList;

    public Select getSortBySelectList() {
        return new Select(sortBySelectList);
    }

    @FindBy(className = "sort-by-switcher")
    private  WebElement sortDirectionButton;

    public WebElement getSortDirectionButton() {
        return sortDirectionButton;
    }

    //web element pentru testul fara cucumber
    @FindBy(xpath = "//div[@class='sort-by']//select[@title='Sort By']//option[@value='https://fasttrackit.org/selenium-test/vip.html?dir=asc&order=price']")
    private WebElement sortByPrice;

    public WebElement getSortByPrice() {
        return sortByPrice;
    }

    @FindBy(id = "product-collection-image-448")
    private WebElement productImage;

    public WebElement getProductImage() {
        return productImage;
    }

    @FindBy(xpath = "//li[@class='item last']//h2//a[@title='A Tale of Two Cities']")
    private  WebElement productName;

    public WebElement getProductName() {
        return productName;
    }


    @FindBy(xpath = "//div[@class='sort-by']//select[@title='Sort By']//option[@value='https://fasttrackit.org/selenium-test/sale.html?dir=asc&order=price']")
    private WebElement sortByPriceSalePage;

    public WebElement getSortByPriceSalePage() {
        return sortByPriceSalePage;
    }

    @FindBy(id = "product-price-384")
    private  WebElement fistElementPriceSalePage;

    public WebElement getFistElementPriceSalePage() {
        return fistElementPriceSalePage;
    }

    @FindBy(id = "product-price-403")
    private WebElement secondElementPriceSalePage;

    public WebElement getSecondElementPriceSalePage() {
        return secondElementPriceSalePage;
    }

    @FindBy(id = "product-price-423")
    private WebElement thirdElementPriceSalePage;

    public WebElement getThirdElementPriceSalePage() {
        return thirdElementPriceSalePage;
    }

    @FindBy(id = "product-collection-image-423")
    private WebElement productImageSalePage;

    public WebElement getProductImageSalePage() {
        return productImageSalePage;
    }

    @FindBy(xpath = "//li[@class='item last']//h2//a[@title='Racer Back Maxi Dress']")
    private  WebElement productNameSalePge;

    public WebElement getProductNameSalePge() {
        return productNameSalePge;
    }

    @FindBy(xpath = "//span[@class='price' and ./parent::*[not(contains(@class, 'old-price'))]]")
    private List<WebElement> actualProductPriceContainers;


    public List<WebElement> getActualProductContainers() {
        return actualProductPriceContainers;
    }

    public List<Double> getActualProductPricesAsDouble() {
        List<Double> convertedPrices = new ArrayList<>();
        for (WebElement priceContainer : actualProductPriceContainers) {
            String priceAsText = priceContainer.getText();

            //Matching: any character except(^) dash, at least one character(+), followed by any character(.), at least 1 occurrence(+)
            //Extracting first part, before dash
            Pattern pattern = Pattern.compile("([^ ]+).+");
            Matcher matcher = pattern.matcher(priceAsText);

            if (matcher.find()){
                String priceTextWithoutCurrency = matcher.group(1);
                priceTextWithoutCurrency = priceTextWithoutCurrency.replace(",",".");

                double convertedPrice = Double.parseDouble(priceTextWithoutCurrency);

                convertedPrices.add(convertedPrice);
            }

        }
        return  convertedPrices;
    }

}
