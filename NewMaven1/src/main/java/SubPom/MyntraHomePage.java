package SubPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraHomePage {
	
	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	private WebElement entrItem;
	@FindBy(xpath = "//li[@data-count='33119']")
	private WebElement selectItem;
	@FindBy(xpath = "//img[@title='Libas Women Black & Golden Block Print Maxi Dress']")
	private WebElement seloneItem;
	@FindBy(xpath="//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	private WebElement Logo;

	public MyntraHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void search() throws InterruptedException {
		entrItem.sendKeys("dresses");
		selectItem.click();
		Thread.sleep(3000);
	}

	public void SeeAllInfo() throws InterruptedException {
		seloneItem.click();
		Thread.sleep(3000);
	}
	public void SwitchClickOnLogo() throws InterruptedException
	{
	System.out.println("switching on Main Window");
	Thread.sleep(3000);
	Logo.click();
	}
}
