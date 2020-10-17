package amazonPom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPom1 {

		@FindBy(xpath="//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")
		private WebElement Mobiles;
		
		@FindBy(xpath="//img[@class='a-dynamic-image gwd-bmc-image']")
				private WebElement product;
		@FindBy(xpath="//img[@alt='OnePlus 8 (Glacial Green 6GB RAM+128GB Storage)']")
		private WebElement Oneplus;
		
		@FindBy(xpath="//input[@title='Add to Shopping Cart']")
		private WebElement addtocart;
		
		@FindBy(xpath="//span[text()='Sign Out']")
		private WebElement logout;

		
		
		
		  public AmazonPom1(WebDriver Driver) {
			  PageFactory.initElements(Driver, this);
		  }
		 

		// Usage

		public void AmazonHomepageMobiles() {

			Mobiles.click();
		}
		
		public void selectProduct()
		{
			product.click();
			 
			 
		}
		public void SelectMobileInfo()
		{
			Oneplus.click();
		}
		
		public void addtocart()
		{
			addtocart.click();
		}
		
		
}


