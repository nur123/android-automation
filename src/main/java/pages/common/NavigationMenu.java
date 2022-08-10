package pages.common;

import base.BasePageObject;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import static locators.common.NavigationMenuLocator.*;

public class NavigationMenu extends BasePageObject {

    public void clickHomeBtn(){
        click(BUTTON_HOME);
    }

    public void clickShopBtn(){
        click(BUTTON_SHOP);
    }

    public void clickMembershipBtn(){
        click(BUTTON_MEMBERSHIP);
    }

    public void clickProfileBtn(){
        click(BUTTON_PROFILE);
    }
}
