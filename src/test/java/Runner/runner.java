package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/CucumberReport.html"},
        		features = "C:\\Users\\Vijay\\eclipse-workspace\\CucumberProject\\Feature",glue = {"Main"},
        		monochrome =true)
/*
 * a. html:target/cucumber-reports/report.html
b.json:target/cucumber-reports/report.json
c. junit:targe/cucumber-reports/report.xml

plugin = {"html:target/cucumber-reports/report.html"}
 */

public class runner {

}
