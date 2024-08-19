package stepDefinition;

import com.google.common.io.Files;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;


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
    public void click_en_seleccionar_archivo() throws IOException {
        //driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).sendKeys("C:\\Users\\LENOVO\\Documents\\new.txt");
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // import com.google.common.io.Files;
        Files.copy(f,new File("D:\\workSpaceEjemplo\\Clase5-main\\src\\main\\java\\screeShot\\screen1.jpg"));

        //partial screenshot

    }
    @Then("seleccionar archivo en la new Window")
    public void seleccionar_archivo_en_la_new_window() {


    }
    @Then("cargar archivo")
    public void cargar_archivo() {


    }
}
