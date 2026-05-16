import OrangeHRMmainModules.addEmployee;
import OrangeHRMmainModules.addLogin;
import OrangeHRMmainModules.enterEmployeeID;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest extends addEmployee  {


    @BeforeMethod
    public void getBrowser()
    {
        browserdriver(browser);
    }


    public void verifyEquals(WebElement actual, Integer expected)
    {
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void loginTest() throws InterruptedException {

        addLogin t = new addLogin(driver);
        addEmployee u = new addEmployee(driver);
        enterEmployeeID i = new enterEmployeeID(driver);

        t.loginComs();
        u.employeeComs();
//        verifyEquals(EmployeeID,null);
        Thread.sleep(5000);
        quit();
//        i.empty();
//        verifyEquals(EmployeeID,4571);




    }

}

