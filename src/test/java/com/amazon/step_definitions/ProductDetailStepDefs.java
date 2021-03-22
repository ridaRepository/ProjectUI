package com.amazon.step_definitions;

import com.amazon.pages.DecisionPage;
import com.amazon.pages.ProductDetailPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailStepDefs {
    ProductDetailPage pdp = new ProductDetailPage();

    static String itemNamePDP;
    static String itemPricePDP;
    static String itemQuantityPDP;

    @Then("user should be able to on the pdp")
    public void user_should_be_able_to_on_the_pdp() {

        String actualResult= Driver.get().getTitle();
        String expectedResult=SearchStepDefs.itemNamePLP;
        Assert.assertEquals(expectedResult,actualResult);

         itemNamePDP = pdp.itemName.getText();
         itemPricePDP = pdp.itemPrice.getText();
    }

    @Then("user should be able to add product on your basket")
    public void user_should_be_able_to_add_product_on_your_basket() {

        Select dropdown = new Select(new ProductDetailPage().quantityDropdown);
        dropdown.selectByValue("1");
        itemQuantityPDP = dropdown.getFirstSelectedOption().getAttribute("value");
        pdp.addToChartButton.click();
        DecisionPage decisionPage= new DecisionPage();
        String actualResult = decisionPage.statusInfoText.getText();
        Assert.assertEquals("Sepete Eklendi",actualResult);

    }
}
