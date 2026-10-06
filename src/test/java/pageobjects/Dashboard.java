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

    @FindBy(xpath="//button[normalize-space()='Create Tenant']")
    WebElement createtenant;

    @FindBy(xpath="//label[contains(text(),'Name')]")
    WebElement tenantname;

    @FindBy(xpath="//label[contains(text(),'Unique URL / Slug')]")
    WebElement tenantslug;

    @FindBy(xpath="//label[contains(text(),'Email')]")
    WebElement tenantemail;

    @FindBy(xpath="//label[contains(text(),'Initial admin password')]")
    WebElement tenantpswd;

    // Subscription plan dropdown
    @FindBy(xpath="//div[@aria-required='true' and @aria-haspopup='listbox']")
    WebElement plandrpdwn;

    // selecting value from subscription plan
    @FindBy(xpath="//li[contains(text(),'Agency Plan')]")
    WebElement value;

    @FindBy(xpath="//span[contains(text(),'Allow doulas to send invitations')]")
    WebElement chkbox;

    @FindBy(xpath="//button[normalize-space()='Create']")
    WebElement createbtn;

    @FindBy(xpath="//button[normalize-space()='Logout']")
    WebElement clicklogout;

    public void clickTenants()
    {
        tenants.click();
    }

    public void Createtenat()
    {
        createtenant.click();
    }

    public void TenantName(String name)
    {
        tenantname.sendKeys(name);
    }

    public void TenantSlug(String name)
    {
        tenantslug.sendKeys(name);
    }

    public void TenantMail(String mail)
    {
        tenantemail.sendKeys(mail);
    }

    public void TenantPswd(String pswd)
    {
        tenantpswd.sendKeys(pswd);
    }

    public void PlanDrpdwn()
    {
        plandrpdwn.click();
    }

    public void SelectPlan()
    {
        value.click();
    }

    public void ClickChkBox()
    {
        chkbox.click();
    }

    public void ClickCreate()
    {
        createbtn.click();
    }

    public void ClickLogout()
    {
        clicklogout.click();
    }
}
