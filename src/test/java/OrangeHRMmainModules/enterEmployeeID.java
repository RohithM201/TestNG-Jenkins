package OrangeHRMmainModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class enterEmployeeID extends addEmployee{



        public enterEmployeeID(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
   public void empty ()
   {
       setWaitKeys(EmployeeID,"4571");


    }

}

