package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExampleFragment extends AbstractFragment {

    public ExampleFragment(WebElement rootElement, WebDriver driver) {
        super(rootElement, driver);
    }

    public ExampleFragment(WebDriver driver) {
        super(driver);
    }
}
