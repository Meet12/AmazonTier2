package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pandy\\eclipse-workspace\\SeleniumAmazon\\src\\test\\java\\amazonsignup", glue= {"stepdef"})

public class testrunner {

}
