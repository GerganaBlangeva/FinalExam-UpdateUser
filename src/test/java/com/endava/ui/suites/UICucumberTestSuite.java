package com.endava.ui.suites;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features/ui/",
        glue = "com.endava.ui.stepdefinitions"
)
public class UICucumberTestSuite {}
