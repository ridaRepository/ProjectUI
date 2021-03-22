package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    public ProductDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToChartButton;

    @FindBy(css = "#priceblock_ourprice")
    public WebElement itemPrice;

    @FindBy(xpath = "//input[@id='buy-now-button']")
    public WebElement buyNowButton;

    @FindBy(css = "#quantity")
    public WebElement quantityDropdown;

    @FindBy(css ="#productTitle")
    public WebElement itemName;








}
