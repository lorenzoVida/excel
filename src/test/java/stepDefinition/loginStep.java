package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStep {
    WebDriver driver;
    @Given("cuando me encuentro en la web principal")
    public void cuando_me_encuentro_en_la_web_principal() {
       driver= new ChromeDriver();
       driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");

    }
    @When("ingreso mis credenciales correctas")
    public void ingreso_mis_credenciales_correctas() {
    driver.findElement(By.cssSelector("input#usr")).sendKeys("Yessenia");
    driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Admin");
    driver.findElement(By.xpath("//form[@id='second_form']/input[@value='Login']")).click();

    }
    @Then("me muestra el Dasboard principal")
    public void me_muestra_el_dasboard_principal() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//body/div[3]/div/div[1]/button[@type='button']")).click();


    }

    @When("ingreso mis credenciales incorrectas")
    public void ingreso_mis_credenciales_incorrectas() {
        driver.findElement(By.cssSelector("input#usr")).sendKeys("Yessenia");
        driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("");
        driver.findElement(By.xpath("//form[@id='second_form']/input[@value='Login']")).click();

    }
    @Then("me muestra mensaje de error")
    public void me_muestra_mensaje_de_error() {

    }




}
