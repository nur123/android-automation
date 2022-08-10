package steps.profile;

import io.cucumber.java.en.When;
import pages.profile.ProfilePage;

public class ProfilePageSteps {

    private ProfilePage profilePage = new ProfilePage();
    @When("user click Login or Register button")
    public void userClickLoginOrRegisterButton() {
        profilePage.clickLoginOrRegisterBtn();
    }
}
