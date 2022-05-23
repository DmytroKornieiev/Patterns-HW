package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarFragment extends AbstractFragment {

    @FindBy(css = ".home-icon-link")
    WebElement homeButton;
    @FindBy(css = ".icon-info")
    WebElement helpButton;
    @FindBy(css = ".icon-order-status")
    WebElement orderStatusButton;

    public NavigationBarFragment(WebElement root, WebDriver driver) {
        super(root, driver);
    }
//    private static final By ROOT = By.cssSelector(".user-nav-wrap ");
//
//    private static final By HOME_BUTTON = By.cssSelector(".home-icon-link");
//
//    public NavigationBarFragment() {
//        setRootElement((WebElement) ROOT);
//    }

}
