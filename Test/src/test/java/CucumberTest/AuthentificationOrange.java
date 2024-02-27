package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AuthentificationOrange {
	WebDriver driver ; 

@Given("ouvrir le navigateur chrome")
public void ouvrir_le_navigateur_chrome() {
    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Given("ouvrir Url")
public void ouvrir_url() {
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
}

@When("saisir le login")
public void saisir_le_login() {
    WebElement user;
    user = driver.findElement(By.name("username"));
    user.sendKeys("Admin");
    
}

@When("saisir le mot de passe")
public void saisir_le_mot_de_passe() {
    WebElement pass ;
    pass = driver.findElement(By.name("password"));
    pass.sendKeys("admin123");
}

@When("cliquer sur le bouton login")
public void cliquer_sur_le_bouton_login() {
    WebElement BT_login ;
   BT_login = driver.findElement(By.xpath("//button[normalize-space()='Ingresar']"));
   BT_login.click();
}


@Then("la page d acceuil s ouvrir")
public void la_page_d_acceuil_s_ouvrir() {
	String resultat_obtenu ; 
	String resultat_attendu = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" ;
	resultat_obtenu = driver.getCurrentUrl();
	Assert.assertEquals(resultat_obtenu, resultat_attendu);
	
    
}

@Then("vérifier le nom de profil")
public void vérifier_le_nom_de_profil() {
	String resultat_obtenu ;
	String resultat_attendu = "733&*($T^ )@#%";


	resultat_obtenu = driver.findElement(By.xpath("//p[normalize-space()='733&*($T^ )@#%']")).getText();
	Assert.assertEquals(resultat_obtenu, resultat_attendu);
    
}



}
