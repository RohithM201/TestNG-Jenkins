package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Commonfunctions {
    protected WebDriver driver;
    protected WebDriverWait wait;

        public  Commonfunctions (WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        }

        public void dropDown(WebElement f, int i) {
            Select a = new Select(f);
            a.getOptions().get(i).click();
        }



           public void clickonElement(WebElement a)
        {   wait.until(ExpectedConditions.elementToBeClickable(a));
                a.click();

        }
        public void selectDropdown (WebElement b)
        {
            wait.until(ExpectedConditions.elementToBeClickable(b));
                   b.click();

    }
        public void navigate()
        {
            driver.navigate().back();

        }

    public void addtoCart (WebElement c)
    {
        wait.until(ExpectedConditions.elementToBeClickable(c));
                c.click();
    }

    public void closeBrowser ()
    {
               driver.quit();
    }




}

