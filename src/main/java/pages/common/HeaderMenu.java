package pages.common;

import base.BasePageObject;

import static locators.common.HeaderMenuLocator.INPUT_SEARCH;

public class HeaderMenu extends BasePageObject {

    public void inputSearch(String keyword) {
        type(INPUT_SEARCH, keyword);
    }
}
