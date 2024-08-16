package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.excel.readExcelFile;
import utils.excel.writeExcelFile;

import java.io.IOException;

public class excelStep {

    String app="https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html";
    WebDriver driver;
    writeExcelFile writeFile;
    readExcelFile readFile;

    @Given("enter the principal website")
    public void enter_the_principal_website() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(app);
    }
    @When("escribir informacion en la web")
    public void escribir_informacion_en_la_web() throws IOException {
        writeFile = new writeExcelFile();
        readFile = new readExcelFile();

        String filepath = "C:\\Users\\LENOVO\\Documents\\testExcel.xlsx";
        String searchText = readFile.getCellValue(filepath,"Sheet1",0,0);
        String user = "#usr";
        driver.findElement(By.cssSelector(user)).sendKeys(searchText);

        String texto = driver.findElement(By.id("ShoePortalTitle")).getText();
        System.out.println(texto);

        readFile.readExcel(filepath,"Sheet1");
        writeFile.writeCellValue(filepath,"Sheet1", 0,1,texto);

    }
}
