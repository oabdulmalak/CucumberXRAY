package coffeshop.features;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sale {
	private Integer stock; 

	@Given("^the stock of my coffee doses is (\\d+)$")
	public void the_stock_of_my_coffee_doses_is(int initstock) throws Throwable {
		stock=initstock;
	//	System.out.println("initstock="+stock);
	}

	@When("^(\\d+) coffee is selected$")
	public void coffee_is_selected(int quantitytobuy) throws Throwable {
		stock=stock-quantitytobuy;
	//	System.out.println("New stock="+stock);
	}


	@Then("^must be distributed is (.*)")
	public void must_be_distributed_is(boolean truefalse) throws Throwable {
		if ((stock>0)==truefalse) {
			assertThat(1, is(1));
		}
		else {
			assertThat(1, is(2));
		}
		
		//System.out.println("Final stock="+stock+" boolean calculé="+(stock>0));
	}


}
