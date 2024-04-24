package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/CucumberReport.html"},
        		features = "C:\\Users\\VijayBala\\eclipse-workspace\\Framework\\Feature",glue = {"Main"},
        		monochrome =true)
/*
 * a. html:target/cucumber-reports/report.html
b.json:target/cucumber-reports/report.json
c. junit:targe/cucumber-reports/report.xml

plugin = {"html:target/cucumber-reports/report.html"}
 */
<<<<<<< HEAD
       // Just checking the 
=======
       // Just checking the branchs
>>>>>>> 8c448436ef5d4b905a9fb73b9287fb4ce2eb2cd0
public class runner {

}
