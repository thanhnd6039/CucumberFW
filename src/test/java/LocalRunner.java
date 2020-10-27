import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/WebUI/Banking/Features/Login.feature",
        glue = {"WebUI.Banking.StepDefinitions"}
)
public class LocalRunner {
}
