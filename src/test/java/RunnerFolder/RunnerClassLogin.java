package RunnerFolder;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="C:\\Users\\kapil\\IdeaProjects\\Oct_3_Framework\\src\\test\\java\\FeatureFolder\\Ex6_loginwithDataTable.feature",
        glue={"StepsFolder","Hooks"},
        //tags= "@sanity or @smoke"
        publish=true,
        plugin={"pretty","html:C:\\Users\\kapil\\IdeaProjects\\Oct_3_Framework\\target\\CucumberReport\\loginReport.html"}
)
public class RunnerClassLogin extends AbstractTestNGCucumberTests
{
}
