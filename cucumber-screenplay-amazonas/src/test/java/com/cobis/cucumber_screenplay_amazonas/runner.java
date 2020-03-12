package com.cobis.cucumber_screenplay_amazonas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", plugin = {"pretty"},
tags ={"@humo"},
glue = { "definition" })
public class runner {
}