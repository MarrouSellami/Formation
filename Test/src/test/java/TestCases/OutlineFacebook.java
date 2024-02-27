package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutlineFacebook<If> {
 WebDriver driver ; 
@Given("Ouvrir URL {string}")
public void ouvrir_url(String string) {
	 System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(string);
}

@When("cliquer sur le bouton creér un compte")
public void cliquer_sur_le_bouton_creér_un_compte() {
	WebElement  bouton1 ; 
	bouton1 = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	bouton1.click();
}

@When("saisir le prénom {string}")
public void saisir_le_prénom(String string) {
    WebElement Prénom ;
    Prénom = driver.findElement(By.xpath("//input[@name='firstname']"));
    Prénom.sendKeys(string);
}

@When("saisir le nom {string}")
public void saisir_le_nom(String string) {
	WebElement Nom ;
    Nom = driver.findElement(By.xpath("//input[@name='lastname']"));
    Nom.sendKeys(string);
}

@When("saisir Email {string}")
public void saisir_email(String string) {
	WebElement Email ;
    Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
    Email.sendKeys(string);
}


@When("confirmer Email {string}")
public void confirmer_email(String string) {
	WebElement Email ;
    Email = driver.findElement(By.name("reg_email_confirmation__"));
    Email.sendKeys(string);
}

@When("saisir le mot de passe {string}")
public void saisir_le_mot_de_passe(String string) {
	WebElement mot_de_passe ;
	mot_de_passe = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	mot_de_passe.sendKeys(string);
}

@When("choisir le Jour {string}")
public void choisir_le_jour(String string) {
	WebElement Jour ;
	Jour = driver.findElement(By.xpath("//select[@title='Jour']"));
	Select liste = new Select(Jour);
    liste.selectByVisibleText(string);
}

@When("choisir le mois {string}")
public void choisir_le_mois(String string) {
	WebElement Mois ;
	Mois = driver.findElement(By.xpath("//select[@title='Mois']"));
	Select liste = new Select(Mois);
    liste.selectByValue(string);
}

@When("choisir l année {string}")
public void choisir_l_année(String string) {
	WebElement Annee ;
	Annee = driver.findElement(By.xpath("//select[@title='Année']"));
	Select liste = new Select(Annee);
    liste.selectByVisibleText(string);
}

@When("choisir le Genre {string}")
public void choisir_le_genre(String string) {
	WebElement F ; 
	WebElement H ; 
	F = driver.findElement(By.xpath("//input[@value='1']"));
	H = driver.findElement(By.xpath("//input[@value='2']"));
	if (string.equals("Femme")) { 
	Actions action = new Actions(driver) ; 
	action.click(F).perform();
	}
	else {
	Actions action = new Actions(driver) ; 
	action.click(H).perform();
	}
}

@When("cliquer sur le bouton s inscrire")
public void cliquer_sur_le_bouton_s_inscrire() {
	WebElement  bouton2 ; 
	bouton2 = driver.findElement(By.xpath("//button[@name='websubmit']"));
	Actions action = new Actions(driver);
	action.click(bouton2).perform();
}

@Then("vérifier la création du compte")
public void vérifier_la_création_du_compte() {
    String resultat_attendu ;
    String resultat_obtenu ;
    resultat_attendu  = "https://www.facebook.com/recover/code/?em[0]=s*****0%40gmail.com&rm=send_email&hash=AUbTbldI7ZFkPxld8bo&locale=fr_FR";
    resultat_obtenu = driver.getCurrentUrl();
    Assert.assertEquals(resultat_obtenu,resultat_attendu);
    
}



}
