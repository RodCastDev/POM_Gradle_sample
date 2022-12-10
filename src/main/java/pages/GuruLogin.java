package pages;
import actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://academy.sophossolutions.com/login/index.php")
public class GuruLogin  extends PageObject {

    By userName = By.name("username");
    By password = By.name("password");
    By btnLogin = By.name("btnlogin");

    public void navegateTo(String url){
        Action.navegateToUrl(getDriver(),url);
    }

    public void login(String strUserName, String strPassword){
        Action.sendData(getDriver(),userName, strUserName);
        Action.sendData(getDriver(),password, strPassword);
        Action.clickElement(getDriver(), btnLogin);
    }
}

