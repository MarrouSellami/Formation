package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// chemin du navigateur
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir navigateur 
		WebDriver navigateur = new ChromeDriver();
		//Maximaze Window
		navigateur.manage().window().maximize();
		// ouvrir Url
		navigateur.get("https://demoqa.com/buttons");
		//sleep 5s 
		Thread.sleep (10000);
		//Déclaration
		WebElement BT ; 
		//Identification
	BT = navigateur.findElement(By.id("doubleClickBtn"));
	// Action
	Actions action = new Actions (navigateur);
	action.doubleClick(BT).perform();
	//Resultat
	String resultat_attendu = "You have done a double click";
	String resultat_obtenu;
	WebElement message = navigateur.findElement(By.id("doubleClickMessage"));
	resultat_obtenu = message.getText();
	Assert.assertEquals(resultat_obtenu, resultat_attendu);
	System.out.println("test ok");
	//Close
	//navigateur.close();
	
	
		
		
		
		
		


	}

	private static Exception sleep(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
