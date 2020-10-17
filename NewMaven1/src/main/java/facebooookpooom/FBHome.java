package facebooookpooom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHome {
	@FindBy(xpath = "//li[@class='buofh1pr to382e16 o5zgeu5y jrc8bbd0 dawyy4b1 h676nmdw hw7htvoc'and position() = 3]")
	private WebElement videos;
	@FindBy(xpath = "//a[@class=\"oajrlxb2 g5ia77u1 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys d1544ag0 qt6c0cv9 tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh"
			+ " p8dawk7l bp9cbjyn e72ty7fz qlfml3jp inkptoze qmr60zad btwxx1t3 tv7at329 taijpn5t\"]")
	private WebElement Profile;
	@FindBy(xpath = "//i[@class=\"hu5pjgll lzf7d6o1 sp_D-6eZQK8GT3_1_5x sx_c79c99\"]")
	private WebElement MenuforLogout;
	@FindBy(xpath = "//*[contains(text(),'Log Out')]")
	private WebElement logout;
	WebDriver driver;

	public FBHome(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	public void setFBloginNotification() throws InterruptedException {
		Thread.sleep(3000);
		videos.click();
		Thread.sleep(3000);
	}

	public void setFBloginHome() throws InterruptedException {
		Thread.sleep(3000);
		Profile.click();
		Thread.sleep(3000);

	}

	public void setFBloginLogout() throws InterruptedException {
		MenuforLogout.click();
		Thread.sleep(3000);
		logout.click();
		Thread.sleep(3000);
	}
}
