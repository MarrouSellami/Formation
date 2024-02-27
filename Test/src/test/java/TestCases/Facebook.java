package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// chemin du chrome 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver navig = new ChromeDriver();
		//Implicity Wait
		navig.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximaze Window
		navig.manage().window().maximize();
		//Ouvrir Url 
		navig.get("https://www.facebook.com/?locale=fr_FR");
		//Déclaration
		WebElement bouton1 ; 
		bouton1 = navig.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Actions action = new Actions(navig);
		action.click(bouton1).perform();
		// identification
		WebElement prenom ;
		WebElement nom ;
		WebElement mail;
		WebElement num;
		WebElement conf;
		WebElement pass;
		WebElement naissanceJ;
		WebElement naissanceM;
		WebElement naissanceA;
		WebElement Genre;
		WebElement inscrip;
		
		
		prenom=navig.findElement(By.xpath("//input[@name='firstname']"));
		nom=navig.findElement(By.xpath("//input[@name='lastname']"));
		mail=navig.findElement(By.xpath("//input[@name='reg_email__']"));
	num=navig.findElement(By.xpath("//input[@name='reg_passwd__']"));
      conf=navig.findElement(By.name("reg_email_confirmation__"));
		pass=navig.findElement(By.xpath("//input[@name='reg_passwd__']"));
		naissanceJ=navig.findElement(By.xpath("//select[@title='Jour']"));
		naissanceM=navig.findElement(By.xpath("//select[@title='Mois']"));
		naissanceA=navig.findElement(By.xpath("//select[@title='Année']"));
		Genre=navig.findElement(By.xpath("//input[@value='1']"));
		inscrip=navig.findElement(By.xpath("//button[@name='websubmit']"));
		
	    prenom.sendKeys("maroua");
	    nom.sendKeys("Sellami");
	    mail.sendKeys("SellamiSellami2020@gmail.com");
	 num.sendKeys("21622215");
	conf.sendKeys("SellamiSellami2020@gmail.com");
	    pass.sendKeys("Admin1996");
	    Select liste = new Select(naissanceJ);
	    liste.selectByVisibleText("30");
	    Select liste1 = new Select(naissanceM);
	    liste1.selectByValue("4");
	    Select liste2 = new Select(naissanceA);
	    liste2.selectByVisibleText("1996");
	    action.click(Genre).perform();
	    action.click(inscrip).perform();
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	
		
		
		
		
		
		
		
		

	}

}
