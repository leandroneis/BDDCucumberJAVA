package br.com.neis.BDDCucumber.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //Serve para definir o caminho onde estão os arquivos .feature
        glue = "br.com.neis.BDDCucumber.steps", //Serve para definir o caminho onde estão os arquivos de Step Definitions
        plugin = "pretty",
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
)
public class RunnerTest {
}

