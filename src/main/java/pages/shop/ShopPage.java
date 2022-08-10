package pages.shop;

import base.BasePageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

import static locators.shop.ShopPageLocator.*;

public class ShopPage extends BasePageObject {

    public void clickAddToCartBtn() {
        swipe(CONTAINER_ELEMENT, -900);
        waitAbit(1);
        click(BUTTON_ADD_TO_CART);
    }

    public void selectVariant(int number) {
        waitAbit(1);
        swipe(CONTAINER_ELEMENT, -900);
        waitAbit(1);
        List<WebElement> variants = findAll(BUTTON_VARIANTS);
        variants.get(number - 1).click();

    }

    public void clickButtonAddToCartOnPopUp() {
        click(BUTTON_ADD_TO_CART_POP_UP);
    }

    public boolean checkPopUpSuccessAddItemAppear() {
        try {
            return isDisplayed(LABEL_POP_UP_SUCCESS_ADD_TO_CART);
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
}
