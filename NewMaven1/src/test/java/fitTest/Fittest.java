package fitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NewFitness.Fit1;

import NewFitness.fit2;

public class Fittest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Javatesting\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fittr.com/login");
		
		//Object creation of class1
		
		fit2 login = new fit2(driver);
		

     login.SetPFclass1_HomecnteloginUn();
     login.SetPFclass1_HomecnteloginPw();
     login.SetPFclass1_HomecnteloginLogin();



		//Object creation of class2
		
		Fit1 home =new Fit1(driver);
		
		//home.SetHomecntrHomepgGetaCoach();
		home.SetHomecntrHomepgeSearch();
		home.SetHomecntrHomepgeLogo();
		home.SetHomecntrHomepgeLogout();
	}

}


