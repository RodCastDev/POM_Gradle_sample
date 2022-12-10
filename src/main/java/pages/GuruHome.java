package pages;
import actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import  static org.junit.Assert.assertEquals;

public class GuruHome extends PageObject {
    //String titlezzz = "//*[text()='%s']";
    By title2;

    public void validateTitle(String strTitle){
        title2 = By.cssSelector(".heading3 td");
        assertEquals("El valor esperado: " + strTitle + ", es diferente a: "
                + Action.getElementText(getDriver(), title2),
                strTitle, Action.getElementText(getDriver(), title2));
    }

    public void validate_UserName_Logged(String userName){
        By userNameLoged = By.cssSelector(".usertext.mr-1");
        assertEquals("Texto no esperado",userName,Action.getElementText(getDriver(),userNameLoged));
    }

}

