package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DecisionPage extends BasePage {

    public DecisionPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    public WebElement goToBasketButton;

    @FindBy(xpath = "//span[@id='hlb-ptc-btn']")
    public WebElement completeShoppingButton;

    @FindBy(css = "#huc-v2-confirm-text-container")
    public WebElement statusInfoText;



}
