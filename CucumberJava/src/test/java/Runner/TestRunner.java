package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Local_GIT\\CucumberJava\\src\\main\\java\\feature\\GoogleSearch.feature",glue= {"StepsDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/reports.html","json:target/JSONReports/report.json","junit:target/XMLReports/report.xml"}
//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = {"pretty","json:target/XMLReports/report.xml"},
//tags="@SmokeTest"
)
public class TestRunner {

}
