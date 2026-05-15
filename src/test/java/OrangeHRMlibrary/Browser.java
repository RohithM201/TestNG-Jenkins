package OrangeHRMlibrary;

import Library.UI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static OrangeHRMlibrary.UI.link1;

public class Browser extends CommonFunctions  implements UI {



    public Browser(WebDriver driver) {
        super(driver);
    }

    public Browser() {
    }


    public void browserdriver (String browserType)

   {
       switch(browserType) {
           case "chrome":
               ChromeOptions options = new ChromeOptions();
               options.setAcceptInsecureCerts(true);
               driver = new ChromeDriver(options);
               break;
           case "edge":
               driver = new EdgeDriver();
               break;
           case "firefox":
               driver = new FirefoxDriver();
               break;

           default:
               System.out.println("Invalid browser");
    }

       driver.get(link1);
}}


