package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftSection {

    public Button addNewProjectButton =new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox nameProjectTextBox = new TextBox(By.id("NewProjNameInput"));
    public Button addButton = new Button(By.id("NewProjNameButton"));


}
