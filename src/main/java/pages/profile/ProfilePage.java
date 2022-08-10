package pages.profile;

import base.BasePageObject;

import static locators.profile.ProfilePageLocator.BUTTON_LOGIN_REGISTER;

public class ProfilePage extends BasePageObject {

    public void clickLoginOrRegisterBtn() {
        click(BUTTON_LOGIN_REGISTER);
    }
}
