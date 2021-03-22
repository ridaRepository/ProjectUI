package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage ()  {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@id=“nav-link-accountList-nav-line-1”]")
    public WebElement signinHoverover;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement signoutHoverover;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
    public WebElement login;

    @FindBy(id = "ap_email")
    public WebElement emailOrPhoneTextBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//span[@id='auth-signin-button']")
    public WebElement loginButton;


    @FindBy(css = "#nav_prefetch_yourorders")
    public WebElement myOrders;

    @FindBy(xpath = "//h4[contains(text(),'Bir sorun oluştu')]")
    public WebElement warningMsg;





}
