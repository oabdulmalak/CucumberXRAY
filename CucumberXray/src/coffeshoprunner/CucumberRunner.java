package coffeshoprunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" ,
"json:./coffeshop.json"}) 
				 
/*
@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json:target/" }, // format du rapport d'exécution
		features = {"src/cucumber/"} // où st les features
		)
		*/
public class CucumberRunner {

}
