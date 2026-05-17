package mainModules;

import Library.Commonfunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends Commonfunctions {

    public Cart (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);


    }
    @FindBy(xpath = "//a[@href='#']")
    WebElement cart;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement checkOut;



    public void actions() throws InterruptedException {
        clickonElement(cart);
        Thread.sleep(3000);
        clickonElement(checkOut);
        Thread.sleep(3000);




    }


}

