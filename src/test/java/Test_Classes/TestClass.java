/**
 * Author Omperkash
 * Date 23-11-2021
 */

/* Comments
 * Here in Test class all the test cases are written , in this class we verify and validate the individual components in the source code of feature of an Application(Software)
 * Here We use different set of test data to test the functionality.
 *  */


package Test_Classes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Funtions_Implementation;

import static org.junit.Assert.*;

public class TestClass {

    @Given("start setup")
    public void setup()                      // here in setup function we write logic for prerequsite for test For example if we need to execute driver
    {
        System.out.println("Setup is running before the test ");
    }

    @And("Print Line")
    public void function_execute() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

    }


    @When("Multiplier function takes integer array as parameter and filters then send back all multipliers")
    public void verify_Multiplier()  //  This function test the valid and unvalid multipiers of 4 ,6 and both
    {

        int numArray[] = {23, 36, 56, 78, 100, 34, 10, 87, 45, 88, 4, 6, 12, 24, 28};

        Integer temp[] = Funtions_Implementation.filter_Mutlipliers_Numbers(numArray);

        Integer mult[] = new Integer[]{36, 56, 78, 100, 88, 4, 6, 12, 24, 28};
        Integer notMult[] = new Integer[]{3, 57, 78, 100, 88, 4, 6, 12, 24, 28};

        assertArrayEquals(mult, temp);            // comparing actual and expected results

        assertTrue(!notMult.equals(temp));    // here negative testing took place

    }

    @When("Palindrome String function takes string as parameter and send back result")
    public void verify_Palindrome_String() {                         // This  function test the valid and  unvalid Palidrome Strings

        assertTrue(Funtions_Implementation.check_Palindrome_String("1234321"));  // comparing actual and expected results
        assertTrue(Funtions_Implementation.check_Palindrome_String("mom"));         // comparing actual and expected results
        assertFalse(Funtions_Implementation.check_Palindrome_String("moum"));  // here negative testing took place

    }

    @Then("teardown execute")
    public void teardown() {
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        // When whole testing took place then we execute this function for example if we need to close driver then we write logic to close driver here
    }

}
