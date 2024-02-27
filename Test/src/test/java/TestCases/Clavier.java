package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Clavier {

	public static void main(String[] args) {
		        // chemin du chrome 
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				//ouvrir chrome
				WebDriver navig = new ChromeDriver();
				//Implicity Wait
				navig.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//maximaze Window
				navig.manage().window().maximize();
				//Ouvrir Url 
				navig.get("https://demoqa.com/text-box");
				//Déclaration 
				WebElement Full_Name;
				WebElement Email ; 
				WebElement Current_Adress;
				WebElement Peremenat_Adress;
				WebElement Submit;
				WebElement affichage_obtenu;
				
				//Identification
				Full_Name = navig.findElement(By.id("userName"));
				Email = navig.findElement(By.id("userEmail"));
				Current_Adress = navig.findElement(By.id("currentAddress"));
				Peremenat_Adress = navig.findElement(By.id("permanentAddress"));
				Submit = navig.findElement(By.id("submit"));
				// Actions
				Full_Name.sendKeys("Maroua");
				Email.sendKeys("SellamiSellami@sellami.com");
				Current_Adress.sendKeys("3050 avenue paris 1005 tunis ");
				Actions action = new Actions(navig);
				action.keyDown(Current_Adress,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
				action.keyDown(Peremenat_Adress,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				action.click(Submit).perform();
				// Véerification
				 String resultat_attendu = ("tunis");
				 String resultat_obtenu;
				 affichage_obtenu = navig.findElement(By.xpath("//p[@id='permanentAddress']"));
				 resultat_obtenu = affichage_obtenu.getText();
				 //String resultat_obtenu ; 
				 Assert.assertTrue(resultat_obtenu.contains(resultat_attendu));
				 System.out.println("test ok");
				 
				 
				 
				 
				 
				 
				 
				 
				
				
				
				
				
				
				

	}

}
