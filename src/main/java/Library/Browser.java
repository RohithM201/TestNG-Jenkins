package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser extends Commonfunctions implements UI {
    public Browser ()
    {
        super(null);
    }

    public Browser(WebDriver driver) {
        super(driver);
    }

    public void browserDriver (String browserType)

    {

        switch (browserType)
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("invalid browser");
        }

        driver.get(link);





    }
    public static void main(String[] args) {

    }

}

