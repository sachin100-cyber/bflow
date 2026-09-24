package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLogin extends BasePage {

	public AccountLogin (WebDriver driver) {
		
		super(driver);
	}
	
@FindBy(xpath="//input[@id='email']")
WebElement txtmail;
@FindBy(xpath="//input[@name='password']")
WebElement txtpswd;
@FindBy(xpath="//button[noramlize-space()='Sign In']")
WebElement btnsignin;
@FindBy(xpath="//span[@title='milestone2@yopmail.com']")
WebElement txtmsg;

public void setMail (String mail) {
	txtmail.sendKeys(mail);
}

public void setPswd(String pswd) {
	txtpswd.sendKeys(pswd);
}

public void clickSubmit()
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	    wait.until(ExpectedConditions.refreshed(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[normalize-space()='Sign In']")))).click();

	    
}
	
public String getConfirmationMsg()
{
	 WebDriverWait wait =
             new WebDriverWait(driver, Duration.ofSeconds(10));

     WebElement message = wait.until(
             ExpectedConditions.visibilityOfElementLocated(
                     By.xpath("//span[@title='milestone2@yopmail.com']")
             )
     );

     return message.getText();
 }
}
