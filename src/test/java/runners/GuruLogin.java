package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "src/java/stepdefinitions/stepdefinitions",
        features = "src/test/resources/features/guru_login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GuruLogin {
}
