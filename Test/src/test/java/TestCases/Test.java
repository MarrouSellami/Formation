package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//chemin chrome driver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver ();
		//Agrandir Fenetre 
		driver.manage().window().maximize();
		// ouvrir URL 
		//driver.get("https://www.google.fr/");
		driver.navigate().to("https://www.google.fr/");
		
		driver.close();
		
	}
}
