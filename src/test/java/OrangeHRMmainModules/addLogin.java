package OrangeHRMmainModules;

import OrangeHRMlibrary.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addLogin extends Browser {


    public addLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;


    public void loginComs()
    {
        setWaitClick(username);
        setWaitClick(password);
    enterPassword(password);
    enterUsername(username);
    submit.click();
    //switchAlert();

    }

}

