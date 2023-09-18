package com.hectorware.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        //"pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-reports.html"
        ,
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"} ,

        features = "src/test/resources/features",
        glue = "com/hectorware/stepDefinitions" ,
        dryRun =false ,
        tags = "@WARE-851"

)
public class CukesRunner {


}
