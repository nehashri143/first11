package SubPom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {
	@FindBy(xpath = "//div[@class='size-buttons-buttonContainer'][1]")
	private WebElement sizeofdress;
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	private WebElement addtobag;
	
	public DressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectSize() throws InterruptedException
	{	
		sizeofdress.click();
		Thread.sleep(3000);
	}
	public void addtobagnew() throws InterruptedException
	{
		addtobag.click();
		Thread.sleep(3000);
	}

}


