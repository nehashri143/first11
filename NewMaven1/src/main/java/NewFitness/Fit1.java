package NewFitness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fit1 {
	
	@FindBy(xpath="//span[@class='MuiButton-label']")
	private WebElement GetaCoach;
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement Search;
	@FindBy(xpath="//img[@class='navbar-profile-pic']")
	private WebElement Logo;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	//Constructor
	
	public Fit1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void SetHomecntrHomepgGetaCoach(){ GetaCoach.click(); }
	 */
	public void SetHomecntrHomepgeSearch(){
		Search.sendKeys("Pamela Ganguly");
		}
	public void SetHomecntrHomepgeLogo(){
		Logo.click();
}
	public void SetHomecntrHomepgeLogout(){
		Logout.click();
	}
	
}


