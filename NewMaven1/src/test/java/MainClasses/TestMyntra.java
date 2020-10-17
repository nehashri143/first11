package MainClasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SubPom.DressesPage;
import SubPom.MyntraHomePage;

public class TestMyntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Javatesting\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// create object
		MyntraHomePage m = new MyntraHomePage(driver);
		m.search();
		m.SeeAllInfo();
		System.out.println("opening selected dress");

		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id" + parentId);
		// getting all window Id
		Set<String> ChildWindows = driver.getWindowHandles();
		System.out.println("Page title before Switching : " + driver.getTitle());

		// iterate the values in the set
		for (String guid : ChildWindows) {
			
			System.out.println("switching");
			// switch to the guid
			driver.switchTo().window(guid); // break the loop
			System.out.println("Handling child window");

		}
		
		DressesPage d = new DressesPage(driver);
		d.SelectSize();
		d.addtobagnew();
		driver.close();
		
		driver.switchTo().window(parentId);
		m.SwitchClickOnLogo();

	}

}
