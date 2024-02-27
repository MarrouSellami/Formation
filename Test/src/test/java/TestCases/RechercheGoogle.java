package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RechercheGoogle {
	WebDriver driver ; 

@Given("Ouvrir navigateur chrome")
public void ouvrir_navigateur_chrome() {
   System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Given("ouvrir URL {string}")
public void ouvrir_url(String string) {
  driver.get(string);
}

@When("saisir le mot rechercher {string}")
public void saisir_le_mot_rechercher(String string) {
    WebElement rechercher ;
    rechercher = driver.findElement(By.name("q"));
    rechercher.sendKeys(string);
    
}

@When("cliquer sur entrer")
public void cliquer_sur_entrer() {
	 WebElement rechercher ;
	    rechercher = driver.findElement(By.name("q"));
	    rechercher.sendKeys(Keys.ENTER);
}

@Then("vérifier si le texte affiché contient le mot {string}")
public void vérifier_si_le_texte_affiché_contient_le_mot(String string) {
     WebElement resultat;
     resultat = driver.findElement(By.id("result-stats"));
     String resultat_attendu = string ; 
     String resultat_obtenu ;
     resultat_obtenu = resultat.getText();
     Assert.assertTrue(resultat_obtenu.contains(resultat_attendu));
     
}



}
