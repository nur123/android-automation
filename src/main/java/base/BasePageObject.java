package base;

import drivers.AndroidDriverInit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class BasePageObject {

  public AndroidDriver getDriver() {
    return AndroidDriverInit.driver;
  }

  public WebElement find(By locator) {
    return getDriver().findElement(locator);
  }

  public List<WebElement> findAll(By locator) {
    return getDriver().findElements(locator);
  }

//  public AndroidElement find(String valueKey) {
//    FlutterFinder find = new FlutterFinder(getDriver());
//    find.text("");
//    return null;
//  }

  public void click(By locator) {
    find(locator).click();
  }

  public void type(By locator, CharSequence... text) {
    WebElement element = find(locator);
    element.clear();
    element.sendKeys(text);
  }

  public String getText(By locator) {
    return find(locator).getText();
  }
  public void swipe(By locator, int offset) {
    Rectangle rect = find(locator).getRect();
    int xCenter = rect.getX() + (rect.getWidth() / 2);
    int yCenter = rect.getY() + (rect.getHeight() / 2);
    TouchAction actions = new TouchAction(getDriver());
    actions.press(PointOption.point(xCenter, yCenter))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
            .moveTo(PointOption.point(xCenter, yCenter + offset))
            .release().perform();
  }
  public void waitAbit(int seconds){
    try {
      Thread.sleep(Duration.ofSeconds(seconds).toMillis());
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  public boolean isDisplayed(By locator){
    return find(locator).isDisplayed();
  }

}
