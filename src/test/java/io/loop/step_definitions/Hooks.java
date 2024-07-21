package io.loop.step_definitions;

import io.cucumber.java.Scenario;
import io.loop.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver();
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte [] screenshot = ((TakesScreenshot)Driver.getDriver().get();)
        }
    }
}
