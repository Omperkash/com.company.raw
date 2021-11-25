/** Author Omperkash
 * Date 23-11-2021  */


/* Comments
        * Test runner is the library or tool that picks up code directory that contains tests and then executes them all  and writes the test results to the console
        * It is very important because if there are hundreds of features then without test runner we have to execute them all one by one, which takes lot of time.
        * Here We also Generate report in three different formats which  html,Json and xml ,which we can find in target folder
        */
package step_definitions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;


    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/features",glue={"step_definitions", "Test_Classes"},monochrome = true,
            plugin = {"pretty","html:target/HtmlReports/report.html","json:target/JsonReports/report.json",
                    "junit:target/JunitReports/junitxml_report.xml",})

    public class TestRunner {


    }

