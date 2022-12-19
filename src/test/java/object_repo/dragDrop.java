package object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
public class dragDrop {
    By dragButton = By.xpath("//*[@content-desc='Drag']");

    public By getDragButton() {
        return dragButton;
    }

    By picHead = By.xpath("//*[@content-desc='drop-c1']");

    public By getPicHead() {
        return picHead;
    }

    By picHead2 = By.xpath("//*[contains(@content-desc,'c1')]");

    public By getPicHead2() {
        return picHead2;
    }

    By searchHead = By.xpath("//*[@content-desc='drag-c1']");

    public By getSearchHead() {
        return searchHead;
    }
}
