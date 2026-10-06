package Hooks;

import LibraryFile.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import LibraryFile.utilityClass;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class HookClass extends DriverFactory
{
    @Before
    public void openBrowser() throws IOException {
      String browser= utilityClass.getPFdata("browserName");

      intializeBrowser(browser);
    }
    @After
    public void closeBrowser(Scenario sce ) throws IOException {
        if(sce.isFailed())
        {
            utilityClass.captureSS(sce);
        }
        DriverFactory.driver.quit();

    }
}
