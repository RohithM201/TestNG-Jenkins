package mainModules;

import Library.Commonfunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addLogin extends Commonfunctions {

    public addLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);// 👈 VERY important
    }
    @FindBy(xpath = "//a[@href='/']")
    WebElement Home;

    @FindBy(xpath ="//a[@id='product-3']")
    WebElement product3;

    @FindBy(id = "add")
    WebElement addtoCart;

    @FindBy(xpath ="//a[@id='product-2']")
    WebElement product2;


    @FindBy(id="product-select-option-0")
    WebElement dropdown1;

    @FindBy(id="product-select-option-1")
    WebElement dropdown2;

    @FindBy(id = "product-1")
    WebElement product1;






    public void cart() throws InterruptedException {
        clickonElement(product3);
        clickonElement(addtoCart);
        Thread.sleep(3000);
        clickonElement(Home);
        Thread.sleep(3000);
        clickonElement(product2);

        Thread.sleep(3000);
        selectDropdown(dropdown1);
        dropDown(dropdown1, 1);
        selectDropdown(dropdown2);
        dropDown(dropdown2, 1);
        addtoCart(addtoCart);
        Thread.sleep(3000);
        clickonElement(Home);
        Thread.sleep(3000);
        clickonElement(product1);
        addtoCart(addtoCart);
        Thread.sleep(3000);
        clickonElement(Home);




        // make sure this exists
    }
}