package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInFragment extends AbstractFragment {

    @FindBy(id = "signInSubmit")
    WebElement signInButton;
    @FindBy(css = ".moa-single-claim-input-field-container")
    WebElement emailField;
    @FindBy(id = "auth-show-password-checkbox")
    WebElement showPasswordCheckbox;

    public SignInFragment(WebElement root, WebDriver driver){
        super(root, driver);
    }
}
