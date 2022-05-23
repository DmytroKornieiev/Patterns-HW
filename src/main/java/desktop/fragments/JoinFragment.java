package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinFragment extends AbstractFragment {

    @FindBy(id = "ap_customer_name")
    WebElement nameField;
    @FindBy(id = "ap_email")
    WebElement emailField;
    @FindBy(id = "ap_password")
    WebElement passwordField;
    @FindBy(id = "continue")
    WebElement createAccountButton;

    public JoinFragment(WebElement root, WebDriver driver){
        super(root, driver);
    }
}
