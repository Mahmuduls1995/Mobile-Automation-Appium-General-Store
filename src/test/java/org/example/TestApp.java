package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class TestApp {

    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        BaseOptions options = new BaseOptions()
                .amend("platformName", "android")
                .amend("appium:automationName", "uiautomator2")
                .amend("appium:deviceName", "Pixel")
                .amend("appium:udid", "emulator-5554")
                .amend("appium:appPackage", "com.androidsample.generalstore")
                .amend("appium:AppActivity", "com.androidsample.generalstore.MainActivity");

        URL remoteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteUrl, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void sampleTest() {

        WebElement el16 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
        el16.click();
        WebElement el17 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Anguilla\")"));
        el17.click();
        WebElement el18 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        el18.sendKeys("Mahmudul");
        WebElement el19 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioMale"));
        el19.click();
        WebElement el20 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
        el20.click();
        WebElement el21 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(1)"));
        el21.click();
        WebElement el22 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(0)"));
        el22.click();

        WebElement el23 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(1)"));
        el23.click();
        WebElement location = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"PG 3\"))"));
        location.click();
        WebElement el24 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(2)"));
        el24.click();
        WebElement el25 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
        el25.click();
        WebElement el26 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.FrameLayout\").instance(3)"));
        el26.click();
        WebElement el27 = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
        el27.click();
        WebElement el28 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
        el28.click();
        WebElement el29 = driver.findElement(AppiumBy.className("android.widget.FrameLayout"));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
