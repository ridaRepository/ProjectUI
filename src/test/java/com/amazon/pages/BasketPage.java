package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@id='deselect-all']")
    public WebElement deselectAll;

    @FindBy(xpath = "//p[@class='a-spacing-small']//span[@xpath=1]")
    public WebElement price;

    @FindBy(xpath = ".a-dropdown-prompt")
    public WebElement quantity;

    @FindBy(xpath = "//input[@data-feature-id='proceed-to-checkout-action']")
    public WebElement completeShoppingButton;

    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    public WebElement productName;




}
