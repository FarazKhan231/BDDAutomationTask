package com.Test.Faraz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" }, features = "classpath:features", glue = {
		"classpath:com.Test.Faraz" }, tags = "@Faraz")
public class RunCucumberTest {
}