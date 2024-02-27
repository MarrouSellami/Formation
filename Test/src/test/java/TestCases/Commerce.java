package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Commerce {
	
	
	WebDriver driver ;

@Given("Ouvrir Navigateur {string}")
public void ouvrir_navigateur(String string) {
	 System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(string);
}

@When("cliquer sur le bouton Sign up \\/ login")
public void cliquer_sur_le_bouton_sign_up_login() {
    WebElement BT ;
    BT = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    Actions action = new Actions(driver);
	action.click(BT).perform();
}

@When("Saisir Name {string}")
public void saisir_name(String string) {
   WebElement Name ;
   Name = driver.findElement(By.name("name"));
   Name.sendKeys(string);
}

@When("saisir Email  {string}")
public void saisir_email(String string) {
	 WebElement Email ; 
	 Email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
	 Email.sendKeys(string);
}

@When("cliquer sur le boutton signup")
public void cliquer_sur_le_boutton_signup() {
    WebElement signup ; 
    signup = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
    Actions action = new Actions(driver);
	action.click(signup).perform();
}


@Then("vérifier l affichage du page créer d un compte")
public void vérifier_l_affichage_du_page_créer_d_un_compte() {
    String resultat_attendu ;
    String resultat_obtenu;
    resultat_attendu =("https://automationexercise.com/signup");
    resultat_obtenu =driver.getCurrentUrl();
    Assert.assertEquals(resultat_attendu, resultat_obtenu);
    

}

@When("saiir le title {string}")
public void saiir_le_title(String string) {
    WebElement Title ; 
    Title = driver.findElement(By.id("id_gender2"));
    Title.click();
    
}


@When("saisir Pass {string}")
public void saisir_pass(String string) {
    WebElement Pass ;
    Pass = driver.findElement(By.id("password"));
    Pass.sendKeys(string);
}
 
@When("saisir DateD {string}")
public void saisir_date_d(String string) {
    WebElement DateD ;
    DateD = driver.findElement(By.name("days"));
    Select liste = new Select(DateD);
    liste.selectByValue(string);
}

@When("saisir DateM {string}")
public void saisir_date_m(String string) {
	WebElement DateM ;
    DateM = driver.findElement(By.name("months"));
    Select liste = new Select(DateM);
    liste.selectByValue(string);
}
@When("saisir DateA {string}")
public void saisir_date_A(String string) {
	WebElement DateA ;
    DateA = driver.findElement(By.name("years"));
    Select liste = new Select(DateA);
    liste.selectByValue(string);
}
@When("saisir FisrtN {string}")
public void saisir_fisrt_n(String string) {
	 WebElement FirstN ;
	 FirstN = driver.findElement(By.name("first_name"));
	 FirstN.sendKeys(string);
}

@When("saisir LastN {string}")
public void saisir_last_n(String string) {
	 WebElement LastN ;
	 LastN = driver.findElement(By.name("last_name"));
	 LastN.sendKeys(string); 
}

@When("saisir Adress {string}")
public void saisir_adress(String string) {
	 WebElement Adress ;
	 Adress = driver.findElement(By.name("address1"));
	 Adress.sendKeys(string);  
}

@When("saisir Country {string}")
public void saisir_country(String string) {
	WebElement Country ;
	 Country = driver.findElement(By.name("country"));
	 Select liste = new Select(Country);
	    liste.selectByValue(string);
}

@When("saisir State {string}")
public void saisir_state(String string) {
	WebElement State ;
	 State = driver.findElement(By.id("state"));
	 State.sendKeys(string); 
}

@When("saisir  City {string}")
public void saisir_city(String string) {
	WebElement City ;
	 City = driver.findElement(By.id("city"));
	 City.sendKeys(string); 
}

@When("saisir Zipcode {string}")
public void saisir_zipcode(String string) {
	WebElement Zipcode;
	 Zipcode = driver.findElement(By.id("zipcode"));
	 Zipcode.sendKeys(string); 
}

@When("saisir Mobile {string}")
public void saisir_mobile(String string) {
	WebElement Mobile;
	 Mobile = driver.findElement(By.id("mobile_number"));
	 Mobile.sendKeys(string); 
}

@When("cliquer sur le bouton se connecter")
public void cliquer_sur_le_bouton_se_connecter() {
    WebElement BT ;
    BT = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
    BT.click();
}

@Then("compte crée")
public void compte_crée() {
    
}



}
