package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage {

    public Dashboard (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//a[@href='/admin/tenants']")
    WebElement tenants;

    public void clickTenants()
    {
        tenants.click();
    }


}
