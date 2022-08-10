package steps.shop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.shop.ShopPage;

public class ShopPageSteps {

    private ShopPage shopPage = new ShopPage();
    @When("user add to cart item {string}")
    public void userAddToCartItem(String itemName) {
        shopPage.clickAddToCartBtn();
    }

    @And("user select {int}st color")
    public void userSelectStColor(int number) {
        shopPage.selectVariant(number);
    }

    @And("user click button add to cart on pop up")
    public void userClickButtonAddToCartOnPopUp() {
        shopPage.clickButtonAddToCartOnPopUp();
    }

    @Then("user see item added into cart")
    public void userSeeItemAddedIntoCart() {
        //assertions using JUnit
        Assertions.assertTrue(shopPage.checkPopUpSuccessAddItemAppear());
    }
}
