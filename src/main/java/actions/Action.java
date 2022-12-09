package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {

    public static void navegateToUrl(WebDriver myBrowser, String url){
        myBrowser.navigate().to(url);
    }
    public static void sendData(WebDriver myBrowser, By target, String strData){
        if (myBrowser.findElements(target).size()>0){
            myBrowser.findElement(target).sendKeys(strData);
        }
    }
    public static void clickElement(WebDriver myBrowser, By target ) {
        if (myBrowser.findElements(target).size() > 0) {
            myBrowser.findElement(target).click();
        }
    }
    public static String getElementText(WebDriver myBrowser, By target){
        if (myBrowser.findElements(target).size() > 0){
            return myBrowser.findElement(target).getText();
        }else{
            System.out.println("Missing element: " + target.toString());
            return null;
        }
    }
}
