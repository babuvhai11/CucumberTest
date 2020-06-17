package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	public WebDriver driver;
	public PageObject(WebDriver d) {
		driver =  d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(xpath = "//input[@id='input-jdrjuysc8fa']")
	@CacheLookup
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-qeupk76iid']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='sign-in-button']")
	@CacheLookup
	WebElement LoginBtn;
			
	
	
	
	public void SetEmail(String email) {
		Email.sendKeys(email);
		
	}
	
	public void SetPassword(String password) {
		Password.sendKeys(password);
		
	}
	public void ClickLoginBtn() {
		LoginBtn.click();
		
	}


}
