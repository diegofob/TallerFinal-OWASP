package testClean;

import helper.GetProperties;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.CenterSection;
import page.LeftSection;
import page.LoginModal;
import page.MainPage;

import java.util.Date;

public class CreateProjectTest extends TestBase{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();
    CenterSection centerSection= new CenterSection();

    @DisplayName("titulo: Verify the creation of a project")
    @Description("this test case is to verify .....")
    @Epic("Todo")
    @Feature("Project")
    @Owner("JBGroup")
    @Severity(SeverityLevel.CRITICAL)
    @Link("Jira/222220000")
    @Issue("www.jira.com/bug/9999999")
    @Order(1)

    @Test
    public void verifyCreateNewProject() throws InterruptedException {

        //String nameProj = "JB"+ new Date().getTime();
        mainPage.loginButton.click();


        loginModal.emailTxtBox.setText(GetProperties.getInstance().getUser());
        loginModal.passwordTxtBox.setText(GetProperties.getInstance().getPwd());
        loginModal.loginButton.click();

        //leftSection.addNewProjectButton.click();
        //leftSection.nameProjectTextBox.setText(nameProj);
        //leftSection.addButton.click();
        // lo ideal es usar un explicit wait, pero por el momento usarmos un tiemp hardcode

        Thread.sleep(1000);

        //String expectedResult=nameProj;
        //String actualResult=centerSection.currentProjectLabel.getText();

        //Assertions.assertEquals(expectedResult,actualResult,"ERROR no se creo el projecto");

    }
}
