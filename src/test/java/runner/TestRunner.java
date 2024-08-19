package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src/test/java/feature",
//glue = "stepDefinition")
//Solo para ejecutar mi feature
//@CucumberOptions(features="src/test/java/feature/alert.feature",
//@CucumberOptions(features="src/test/java/feature/windowHandleSelenium.feature",
@CucumberOptions(features="src/test/java/feature/windowHandleSelenium.feature",
        glue = "stepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests {

}
