package com.hectorware.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-reports.html"
        ,
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"} ,

        features = "src/test/resources/features",
        glue = "com/hectorware/stepDefinitions" ,
        dryRun =false ,
        tags = "" //when you push the code to please leave this part empty

)
public class CukesRunner {


}
