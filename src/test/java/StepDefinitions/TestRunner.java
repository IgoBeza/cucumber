package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"StepDefinitions"},
monochrome = true,
        //quando no diretorio JSONReports em .json
        //plugin = {"pretty","json:target/JSONReports/report.json"}

        plugin = {"pretty","junit:target/JUnitReports/report.xml",
        "json:target/JSONReports/report.json",
         "html:target/HtmlReports.hml"},
        tags="@smoketest"

)
public class TestRunner {



}
