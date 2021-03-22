package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searcInputBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchIcon;

    @FindBy(css = "#nav-cart")
    public WebElement basket;

    @FindBy(css = "#nav-orders")
    public WebElement ordersAndReturn;


    /**
     * When you click amazon logo , refreshes the page
     */
    @FindBy(css = "#nav-logo-sprites")
    public WebElement amazonLogo;

    @FindBy(css = "#searchDropdownBox")
    public WebElement catagories;

    @FindBy(id = "//a[@id='nav-link-accountList']")
    public WebElement Account;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(xpath = "//span[contains(text(),'Çıkış Yap')]")
    public WebElement logoutButton;


}
