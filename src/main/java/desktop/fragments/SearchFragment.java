package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFragment extends AbstractFragment {


    @FindBy(css = ".text-input")
    WebElement searchField;
    @FindBy(css = ".brand-link")
    WebElement homePage;
    @FindBy(css = ".header-search-btn")
    WebElement searchButton;

    public SearchFragment(WebElement root, WebDriver driver){
        super(root, driver);
    }
}
