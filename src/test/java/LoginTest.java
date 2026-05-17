import Library.Browser;
import mainModules.Cart;
import mainModules.addLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends Browser  {

   @BeforeMethod
    public void getBrowser () {
       browserDriver(browser);

   }


   public void validateItems() {

       List<WebElement> items = driver.findElements(By.cssSelector(".cart-item"));
       //debugging any hidden elements
//       for (WebElement item : items) {
//           System.out.println(item.getText());
//           System.out.println("Displayed: " + item.isDisplayed());

           long visibleItems = items.stream()
                   .filter(WebElement::isDisplayed)
                   .count();
           Assert.assertEquals(visibleItems, 3);

       }




    @Test
       public void addCartTest() throws InterruptedException {
           addLogin page = new addLogin(driver);
           page.cart();
           Cart t = new Cart(driver);
           t.actions();
//           validateItems();
           closeBrowser();




       }






    }



