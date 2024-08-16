package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uploadFileStep {
    String app="https://nervgh.github.io/pages/angular-file-upload/examples/simple/";
    WebDriver driver;
    @Given("enter the window")
    public void enter_the_window() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(app);
    }
    @When("click en Seleccionar archivo")
    public void click_en_seleccionar_archivo() {
        //driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).sendKeys("C:\\Users\\Yessenia\\Downloads\\GIT1.docx");

    }
    @Then("seleccionar archivo en la new Window")
    public void seleccionar_archivo_en_la_new_window() {


    }
    @Then("cargar archivo")
    public void cargar_archivo() {


    }
}
