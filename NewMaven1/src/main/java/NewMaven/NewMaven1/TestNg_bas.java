package NewMaven.NewMaven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_bas {
	
		

		@Test (priority = -101)
		public void CloseBrowser() {
			
			System.out.println("Closing Google Chrome browser");
		}

		@Test (priority = 0)
		public void OpenBrowser() {
			
			System.out.println("Launching Google Chrome browser"); 
		}

		@Test (priority = 15)
		public void AccountTest(){
			System.out.println("Some tests for Customer Account");
		}
		@Test  
		public void WebStudentLogin()  
		{  
		System.out.println("Student login through web");  
		}  
		@Test  
		public void MobileStudentLogin()  
		{  
		System.out.println("Student login through mobile");  
		}  
		@Test(dependsOnMethods= {"WebStudentLogin"})  
		public void APIStudentLogin()  
		{  
		System.out.println("Student login through API");  
		}  
	}


