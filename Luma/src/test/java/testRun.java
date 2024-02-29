import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"src/test/java/stepDefinition"},
        features = "classpath:features",
        plugin = {"pretty",
                "json:target/cucumber-reports-api/Cucumber.json",
                "junit:target/cucumber-reports-api/Cucumber.xml",
                "html:target/cucumber-reports-api/report.html"})
public class testRun {

}







