package calc;

/*import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions.*;*/
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private int currentNumber = 0;
    private int result = 0;
    private String operation = "";

    @Given("I have entered the number {int} into the calculator")
    public void i_have_entered_the_number_into_the_calculator(int number) {
        currentNumber = number;
    }

    @When("I press the add button")
    public void i_press_the_add_button() {
        operation = "add";
    }

    @When("I press the subtract button")
    public void i_press_the_subtract_button() {
        operation = "subtract";
    }

    @When("I press the {string} button")
    public void i_press_the_operation_button(String op) {
        operation = op;
    }

    @And("I have entered another number {int} into the calculator")
    public void i_have_entered_another_number_into_the_calculator(int number) {
        if (operation.equals("add")) {
            result = currentNumber + number;
        } else if (operation.equals("subtract")) {
            result = currentNumber - number;
        }
    }

    @Then("the result displayed should be {int}")
    public void the_result_displayed_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    /* @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }
    */

    @Before
    public void setUp() {
    //COde to initiate the calculator goes here
    System.out.println("tarting the calculator");
    }

    @After
    public void tearDown() {
        // Code to shut down the calculator goes here
        System.out.println("Stopping the calculator");
    }
}
