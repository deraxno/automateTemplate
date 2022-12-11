package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;

public class Main {
    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // System.out.println("Hello world!");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Astud");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        //capabilities.setCapability("app", "C:/Users/IMBA PC/Downloads/Android-NativeDemoApp-0.4.0.apk");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@content-desc='switch']")).click();
        String switchText = driver.findElement(By.xpath("//*[@content-desc='switch-text']")).getText();
        Assert.assertTrue(switchText.contains("OFF"));
        System.out.println("oke");
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(textContains(\"Buttons\"))"));
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@content-desc='Dropdown']")).click();
        driver.findElement(By.xpath("//*[contains(@text,'Appium')]")).click();
        driver.findElement(By.xpath("//*[@content-desc='button-Active']")).click();
    }
}