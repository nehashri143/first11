package NewFitness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fit2{

	

	//declaration & Initialization
	

	@FindBy(xpath="//*[@id='adornment-username']")
	private WebElement Un;
	@FindBy(xpath="//*//input[@name='password']")
	private WebElement Pw;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	//Constructor
	public fit2(WebDriver driver){
		
		PageFactory.initElements(driver, this);		
	}
	
	public void SetPFclass1_HomecnteloginUn(){
		Un.sendKeys("dhanshree.verma16@gmail.com");
	}
	public void SetPFclass1_HomecnteloginPw(){
		Pw.sendKeys("Dhanshree@27");
		}

	public void SetPFclass1_HomecnteloginLogin(){
		Login.click();
}
}
	
