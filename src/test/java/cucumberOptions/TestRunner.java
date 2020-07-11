package cucumberOptions;


//feature file
//stepdefination file

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/", // path for features package
        monochrome = true , // removes all unnessecary # , times etc
        dryRun = false , //if true checks all the scenarios are mapped with step definition file
        glue = "stepDefinations" , // path for stepDefinations package
        tags = "@Regression" , // grouping based on tags
        plugin = {"pretty" , // to look good report format
                "html:target/Destination/index.html" , // to generate report in html
                "json:target/Destination/report.json", // to generate report in json
                "junit:target/Destination/cakes.xml"}) // to generate report in xml

public class TestRunner {

}
