package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("^user is on login page$")
    public  void user_is_on_login_page() {

        System.out.println("Inside Step - user is on page");
    }

    @When("^user enters username and password$")
    public  void user_enters_username_and_password() {

        System.out.println("Inside Step - user enters username and password");


    }
    @And("^clicks on login buttons$")
    public void click_on_login_buttons() {


        System.out.println("Inside Step - clicks on login buttons");

    }

    @Then("^user is navigation to the home page$")
    public void user_is_navigation_to_the_home_page() {

        System.out.println("Inside Step - user is navigation to the home page");

    }













    }








