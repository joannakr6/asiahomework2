package pl.coderslab.order;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/Cucumbers/Features/create-new-order.feature")

public class TestRunner {
}
