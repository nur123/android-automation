package steps.common;

import io.cucumber.java.en.Given;
import pages.common.NavigationMenu;

public class NavigationMenuSteps {

    private NavigationMenu navigationMenu = new NavigationMenu();

    @Given("user click profile button")
    public void userClickProfileButton() {
        navigationMenu.clickProfileBtn();
    }

    @Given("user click home button")
    public void userClickHomeButton() {
        navigationMenu.clickHomeBtn();
    }

    @Given("user click shop button")
    public void userClickShopButton() {
        navigationMenu.clickShopBtn();
    }

    @Given("user click membership button")
    public void userClickMembershipButton() {
        navigationMenu.clickMembershipBtn();
    }
}
