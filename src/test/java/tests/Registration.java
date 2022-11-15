package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration extends TestBase {
    WebDriver wd;
    @BeforeMethod
    public void init(){

    }
    @Test
    public void registration(){
        openregistrationFofm();
        //url
        //click registration
        //fill registration form
        //submit

    }



    @AfterMethod
    public void tearDown(){

    }
}
