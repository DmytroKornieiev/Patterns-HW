package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.JoinFragment;
import desktop.fragments.NavigationBarFragment;
import desktop.fragments.SearchFragment;
import desktop.fragments.SignInFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public static final String LOGIN_PAGE_URL = "https://www.bookdepository.com/account/login/to/account";

    @FindBy(css = ".login-page")
    WebElement root;
    @FindBy(id = "signin-embedded-layout")
    WebElement rootSignInFragment;
    @FindBy(css = ".mp_reg_fix")
    WebElement rootJoinFragment;
    @FindBy(css = ".primary-wrap")
    WebElement rootSearchFragment;
    @FindBy(css = ".user-nav-wrap ")
    WebElement rootNavigationBarFragment;


    public SignInFragment signInFragment;
    public JoinFragment joinFragment;
    public SearchFragment searchFragment;
    public NavigationBarFragment navigationBarFragment;

    public LoginPage(WebDriver driver){
        super(driver);
        setPageUrl(LOGIN_PAGE_URL);
        this.signInFragment = new SignInFragment(rootSignInFragment, driver);
        this.joinFragment = new JoinFragment(rootJoinFragment, driver);
        this.searchFragment = new SearchFragment(rootSearchFragment, driver);
        this.navigationBarFragment = new NavigationBarFragment(rootNavigationBarFragment, driver);
    }
}
