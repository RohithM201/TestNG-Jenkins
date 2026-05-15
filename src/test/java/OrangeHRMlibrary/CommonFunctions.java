package OrangeHRMlibrary;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static OrangeHRMlibrary.UI.password;
import static OrangeHRMlibrary.UI.username;

public class CommonFunctions {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions act;




    public CommonFunctions(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.act = new Actions(driver);

    }

    public CommonFunctions() {
    }


    public void keyPress(WebElement A)
    {
        A.sendKeys(Keys.CONTROL, "a");
        A.sendKeys(Keys.DELETE);
//        a.clear();

//        act.keyDown(Keys.COMMAND).build().perform();
//        act.keyDown(Keys.DELETE).build().perform();


    }

    public void setWaitClick(WebElement a)
    {
        wait.until(ExpectedConditions.elementToBeClickable(a)).click();
    }

    public void setWaitKeys(WebElement a, String b)
    {
        wait.until(ExpectedConditions.elementToBeClickable(a)).sendKeys(b);
    }



    public void switchAlert()
    {
        driver.switchTo().alert().accept();
    }



    public  void enterUsername(WebElement a)
    {
        a.sendKeys(username);

    }
    public  void enterPassword(WebElement b)
    {
        b.sendKeys(password);
    }

    public void quit ()
    {
        driver.quit();
    }





    }


