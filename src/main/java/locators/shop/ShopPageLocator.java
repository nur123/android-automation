package locators.shop;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface ShopPageLocator {
    String LOCATOR_BUTTON_ADD_TO_CART = "//android.view.View[contains(@content-desc, 'Happy Go Lash Mascara')]";
    By BUTTON_ADD_TO_CART = AppiumBy.xpath("//android.widget.Button[@content-desc='Add To Cart']");
    By CONTAINER_ELEMENT = AppiumBy.xpath("//android.widget.ScrollView");
    By BUTTON_VARIANTS = AppiumBy.xpath("//android.view.View[@content-desc='Select Colour']/following-sibling::android.view.View");
    By BUTTON_ADD_TO_CART_POP_UP = AppiumBy.xpath("//android.widget.Button[@content-desc='Add To Cart']");
    By LABEL_POP_UP_SUCCESS_ADD_TO_CART = AppiumBy.xpath("//android.view.View[contains(@content-desc,'added to cart')]");
}
