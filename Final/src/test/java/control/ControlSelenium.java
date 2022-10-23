package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.SingletonSession;


public class ControlSelenium {
    protected WebElement control;
    protected By locator;

    public ControlSelenium(By locator){
        this.locator=locator;
    }

    protected void findControl(){
        this.control= SingletonSession.getInstance().getBrowser().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }


    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return this.control.getText();
    }

}
