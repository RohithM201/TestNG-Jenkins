package OrangeHRMmainModules;

import OrangeHRMlibrary.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addEmployee extends Browser {

    public addEmployee (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/descendant::a[2]")
    WebElement PIM;

    @FindBy(xpath = "//div[@class='orangehrm-header-container']/child::button")
    WebElement Add;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement LastName;

    @FindBy(xpath = "//label[text()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input")
    WebElement EmployeeID;

    public addEmployee() {
    }

    public void employeeComs () throws InterruptedException {
        setWaitClick(PIM);
        setWaitClick(Add);
        setWaitKeys(FirstName,"Jane");
        setWaitKeys(LastName,"Doe");


        EmployeeID.click();

        act.keyDown(Keys.COMMAND)
                .sendKeys("a")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.BACK_SPACE)
                .perform();

        EmployeeID.sendKeys("123");


//        EmployeeID.sendKeys(Keys.DELETE);
//        System.out.println("I am here now");
//        Thread.sleep(3000);
//        EmployeeID.isDisplayed();
//        EmployeeID.click();
//        keyPress(EmployeeID);
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.attributeToBe(EmployeeID,"value",""));




    }
 }
