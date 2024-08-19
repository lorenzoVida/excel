package stepDefinition;

import com.google.common.io.Files;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class alertSeleniumStep {
    String app="https://omayo.blogspot.com/";
    WebDriver driver;
    @Given("enter de website alertas en ventanas")
    public void enter_de_website_alertas_en_ventanas() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(app);
    }
    @When("click in the principal button alerts")
    public void click_in_the_principal_button_alerts() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.id("alert1")).click();
    Alert alerta = driver.switchTo().alert();
    String mensaje= alerta.getText();
    System.out.println(mensaje);
    alerta.accept();
    Thread.sleep(2000);
    }
    @Then("show window alert and capture text")
    public void show_window_alert_and_capture_text() throws IOException {
        WebElement we = driver.findElement(By.id("multiselect1"));
        File f = we.getScreenshotAs(OutputType.FILE);
        Files.copy(f,new File("D:\\workSpaceEjemplo\\Clase5-main\\src\\main\\java\\screeShot\\screenPartial.jpg"));
    }

}
