package com.amazon.step_definitions;

import com.amazon.pages.MainPage;
import com.amazon.pages.ResultPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class SearchStepDefs {

    MainPage mainPage= new MainPage();
    int counter;
    String globalitem;
    static String itemNamePLP;


    @And("user should able to write {string} on the searching area")
    public void user_should_able_to_write_on_the_searching_area(String item) {
        globalitem=item;
        mainPage.searcInputBox.sendKeys(item);
    }

    @And("user should able to click search icon")
    public void user_should_able_to_click_search_icon() {
        mainPage.searchIcon.click();
    }

    @Then("user should able to see result page")
    public void user_should_able_to_see_result_page() {
        String expectedResult="Amazon.com : "+ globalitem;
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.titleIs("Amazon.com : "+globalitem));
        String actualResult= Driver.get().getTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * I only assert first page , u can easily handled with created loop check all pages
     */
    @And("user should able to see related product")
    public void user_should_able_to_see_related_product() {
        ResultPage resultPage = new ResultPage();
        BrowserUtils.waitForPageToLoad(5);
        List<WebElement> resultsObjectElements = resultPage.resultsObject;
        List<String> elementsText = BrowserUtils.getElementsText(resultsObjectElements);
        for (String control : elementsText) {
            if (control.toLowerCase().contains(globalitem.toLowerCase())){ counter++;  }
        }
        Assert.assertEquals(resultsObjectElements.size(),counter);
    }

    @And("user should able to click random item")
    public void user_should_able_to_click_random_item() {

        ResultPage resultPage = new ResultPage();
        Random rd = new Random();
        int random = rd.nextInt(resultPage.resultsObject.size());
        itemNamePLP=resultPage.resultsObject.get(random).getText();
        resultPage.resultsObject.get(random).click();




    }

}
