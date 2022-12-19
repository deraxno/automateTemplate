package stepAction;
import config.Environtment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import object_repo.dragDrop;
import org.openqa.selenium.interactions.Actions;

public class drag extends Environtment {
    dragDrop element = new dragDrop();
    @When("click Drag button")
    public void click_drag_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(element.getDragButton()).click();
        Thread.sleep(200);
    }
    @Then("Drag head to picture and drop it")
    public void drag_head_to_picture_and_drop_it() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then");
        WebElement from = driver.findElement(element.getSearchHead());
        System.out.println("ketemu head");
        WebElement to = driver.findElement(element.getPicHead2());
        System.out.println("ketemu pic");
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
        Thread.sleep(1000);
    }
}
