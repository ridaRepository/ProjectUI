package com.amazon.step_definitions;

import com.amazon.pages.BasketPage;
import com.amazon.pages.DecisionPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BasketStepDefs {
   DecisionPage decisionPage= new DecisionPage();
   BasketPage basketPage= new BasketPage();

    @Then("user should able to click basket icon")
    public void user_should_able_to_click_basket_icon() {
      decisionPage.goToBasketButton.click();
      Assert.assertEquals("Amazon.com.tr Alışveriş Sepeti",Driver.get().getTitle());
    }

    @Then("user should see same product")
    public void user_should_see_same_product() {
        String itemName =basketPage.productName.getText();
        String itemPrice = basketPage.price.getText();
        String itemQuantity = basketPage.quantity.getText();

        Assert.assertEquals(ProductDetailStepDefs.itemNamePDP,itemName);
        Assert.assertEquals(ProductDetailStepDefs.itemPricePDP,itemPrice);
        Assert.assertEquals(ProductDetailStepDefs.itemQuantityPDP,itemQuantity);
    }


}
