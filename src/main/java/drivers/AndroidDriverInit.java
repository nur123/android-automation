package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

  public static AndroidDriver driver;

  public static void initialize(){
    //desired capabilities
    UiAutomator2Options caps = new UiAutomator2Options();
    caps.setNewCommandTimeout(Duration.ofSeconds(120))
            .autoGrantPermissions()
            .setUdid("emulator-5554")
            .setDeviceName("device")
            .setPlatformName("Android")
            .setApp("/Users/muhammadnur/Downloads/bodyshop.apk");

    //url appium
    String url = "http://localhost:4723";
    //inisialisasi appium
    try {
      driver = new AndroidDriver(new URL(url), caps);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    //implict wait
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

  }

  public static void quit(){
    //quit
    driver.quit();
  }

}
