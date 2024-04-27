package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VijayBala\\eclipse-workspace\\Framework\\Feature",glue = {"Main"},
        		monochrome =false, tags="@T2")
/*
 * a. html:target/cucumber-reports/report.html
b.json:target/cucumber-reports/report.json
c. junit:targe/cucumber-reports/report.xml

plugin = {"html:target/cucumber-reports/report.html"}
 */

//plugin={"pretty","html:target/CucumberReport.html"}

public class runner {

}
