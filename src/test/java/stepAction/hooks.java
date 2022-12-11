package stepAction;

import config.Environtment;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks extends Environtment {
    @Before
    public void before() throws MalformedURLException {
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
    }
    @After
    public void after(){

        driver.quit();
    }
}
