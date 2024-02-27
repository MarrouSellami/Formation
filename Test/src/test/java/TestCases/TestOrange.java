package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrange {

	public static void main(String[] args) throws InterruptedException {
		// chemin du chrome driver 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
       // ouvrir chrome
		WebDriver driver =new ChromeDriver();
		// maximaze windows 
		driver.manage().window().maximize();
		// ouvrir URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// sleep 10s
		Thread.sleep(15000);
		
		//Déclaration
		WebElement user;
		WebElement pass;
		WebElement BT_log;
		// Identification
		user = driver.findElement(By.name("username"));
		pass = driver.findElement(By.name("password"));
		BT_log = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//Action
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		BT_log.click();
		// sleep 10s
		Thread.sleep(5000);
//Resultat 
String resultat_attendu ="IxMrITQVFmNabeel mvdkJcUmKOShanaz";
		
String resultat_obtenu;
WebElement profil;
profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
resultat_obtenu =profil.getText();
Assert.assertEquals(resultat_attendu, resultat_obtenu);
System.out.println("test ok");

	}

}
