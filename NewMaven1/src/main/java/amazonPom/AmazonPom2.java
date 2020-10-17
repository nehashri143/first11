package amazonPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPom2 {
	// declaration
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement EnterEmail;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ClickConti;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement pswd;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement login;
	
	WebDriver driver;
	

	public AmazonPom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SetAmazonLoginpageUn() {
		EnterEmail.sendKeys("nehapatil.patil30@gmail.com");
	}

	public void SetAmazonLoginpageCont() {
		ClickConti.click();
	}

	public void SetAmazonLoginpagePw() {
		pswd.sendKeys("Nehashri@143");
	}

	public void SetAmazonLoginpageLogin() {
		login.click();
	}
	
	
	
	
}
