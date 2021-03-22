package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage extends BasePage{

    public ResultPage() {
        PageFactory.initElements(Driver.get(),"this");
    }



    @FindBy(css = ".a-size-base-plus.a-color-base.a-text-normal")
    public List<WebElement> resultsObject;

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[50]/span[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")
    public WebElement nextResultPageButton;

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[50]/span[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement previousResultPageButton;










}
