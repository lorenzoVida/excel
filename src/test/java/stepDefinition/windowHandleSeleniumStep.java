package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class windowHandleSeleniumStep {
    String app="https://rahulshettyacademy.com/AutomationPractice/";
    WebDriver driver;
    @Given("enter the window handle website")
    public void enter_the_window_handle_website() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(app);
    }
    @When("click en window handle button")
    public void click_en_window_handle_button() {
    driver.findElement(By.id("openwindow")).click();
    driver.findElement(By.id("name")).sendKeys("Yessenia");

    }
    @Then("navigate in the new Window")
    public void navigate_in_the_new_window() {
        Set<String> window = driver.getWindowHandles();
        Iterator<String> IT= window.iterator();
        String PrincipalWindow =(String) IT.next();
        String SecundarioWindow =(String) IT.next();
        driver.switchTo().window(SecundarioWindow);
        driver.findElement(By.xpath("(//a[normalize-space()='Courses'])[1]")).click();



    }
    @Then("return principal window")
    public void return_principal_window() {

    }
}
