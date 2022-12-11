package object_repo;

import org.junit.Assert;
import org.openqa.selenium.By;

public class pageForm {
    By buttonForm = By.xpath("//*[@content-desc='Forms']");

    public By getButtonForm() {
        return buttonForm;
    }

    By input_Form1 = By.xpath("//*[@content-desc='text-input']");

    public By getInput_Form1() {
        return input_Form1;
    }

    By output_Form1 = By.xpath("//*[@content-desc='input-text-result']");

    public By getOutput_Form1() {
        return output_Form1;
    }

    By switchButton = By.xpath("//*[@content-desc='switch']");

    public By getSwitchButton() {
        return switchButton;
    }

    By resultSwitch =  By.xpath("//*[@content-desc='switch-text']");

    public By getResultSwitch() {
        return resultSwitch;
    }
}
