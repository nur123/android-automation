package locators.common;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface NavigationMenuLocator {

    By BUTTON_HOME = AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Home')]");
    By BUTTON_SHOP = AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Shop')]");
    By BUTTON_MEMBERSHIP = AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Membership')]");
    By BUTTON_PROFILE = AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Profile')]");
}
