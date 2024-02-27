package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		//Chemin de chrome 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver navig = new ChromeDriver();
		//maximaze windows
		navig.manage().window().maximize();
		//ouvrir URL
		navig.get("https://demoqa.com/menu");
		//sleep 
		Thread.sleep(10000);
		//déclaration
		WebElement Main2;
		WebElement Main3;
		
		//Identification
		Main2 = navig.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
		Main3 = navig.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[2]/ul/li[3]/a"));
		//Action
		Actions action = new Actions(navig);
		action.moveToElement(Main2).perform();
		action.moveToElement(Main3).perform();
		//Résultat
		//String resultat_attendu ; 
		//String resultat_obtenu
		
		

	}

}
