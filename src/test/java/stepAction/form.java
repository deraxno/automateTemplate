package stepAction;

import config.Environtment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import object_repo.pageForm;

import java.net.MalformedURLException;


public class form extends Environtment {
    pageForm element =new pageForm();
    @Given("user in homepage")
    public void user_in_homepage() throws MalformedURLException, InterruptedException {
        System.out.println("Hello world!");
        driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc='Home-screen']")).isDisplayed();
        Thread.sleep(200);
    }
    @When("click form button")
    public void click_form_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions\
        driver.findElement(element.getButtonForm()).click();
        Thread.sleep(200);
    }
    @And("input text")
    public void input_text() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement inputfield = driver.findElement(element.getInput_Form1());
        inputfield.sendKeys("test aja sih");
        isian = inputfield.getText();
        Thread.sleep(200);
    }
    @And("check input text result")
    public void check_input_text_result() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        hasil = driver.findElement(element.getOutput_Form1()).getText();
        Assert.assertEquals(isian, hasil);
        System.out.println(isian +"="+ hasil);
        Thread.sleep(200);
    }
    @Then("input and output is match")
    public void input_and_output_is_match() {
        // Write code here that turns the phrase above into concrete actions
    }
    @And("switch toogle off")
    public void switch_toogle_off() {
        driver.findElement(element.getSwitchButton()).click();
    }
    @Then("toogle success off")
    public void toogle_success_off() {
        switchText = driver.findElement(element.getResultSwitch()).getText();
        Assert.assertTrue(switchText.contains("OFF"));
    }
}
