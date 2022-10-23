package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTxtBox = new TextBox(By.id("element-0"));
    public TextBox passwordTxtBox = new TextBox(By.id("element-3"));
    public Button loginButton = new Button(By.xpath("//button [@class=\"nFxHGeI S7Jh9YX a8af2163 _3d1243b2 _3991076f f9408a0e _8c75067a\"]"));

}
