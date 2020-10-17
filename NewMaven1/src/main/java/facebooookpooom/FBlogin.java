package facebooookpooom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement UN;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PW;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Login;
	
	public FBlogin(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}

	public void setFBloginUN() {
		UN.sendKeys("nehapatil.patil30@hotmail.com");
	}

	public void setFBloginPW() {
		PW.sendKeys("Nehashri@143");
	}

	public void setFBloginLogin() {
		Login.click();
	}
}
