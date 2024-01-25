package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/features",
        glue = "steps"
        //Glue es para pegar, es como que indica donde están las definiciones de estos features
)

public class RunnerTest {

}