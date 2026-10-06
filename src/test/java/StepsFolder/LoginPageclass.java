package StepsFolder;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginPageclass {
    @Given("user on login page")
    public void user_on_login_page() {
        System.out.println("user on login page");
    }

    @When("user enter valid username")
    public void user_enter_valid_username() {
System.out.println("user enter valid username");
    }

    @When("user enter valid password")
    public void user_enter_valid_password() {
        System.out.println("user enter valid password");
    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
    }
@Then("user redirect on home page")
    public void user_redirect_on_home_page()
{
    System.out.println("user redirect on home page");
}
    @When("user enter username {string}")
    public void user_enter_username(String string) {
        System.out.println("username : "+string);
    }

    @When("user enter password {string}")
    public void user_enter_password(String string) {
        System.out.println("password :"+string);
    }

    @When("user enter pin {int}")
    public void user_enter_pin(Integer int1) {
        System.out.println("pin: "+int1);
    }

    @Then("home page visible with logo {string} text")
    public void home_page_visible_with_logo_text(String string) {
        System.out.println("LogoText :"+ string);
    }
    @When("user enter invalid password")
    public void user_enter_invalid_credential() {
        System.out.println("user enter invalid password");
    }

    @Then("login failed msg visible")
    public void login_failed_msg_visible() {
        System.out.println("login failed");
    }
  //  @When("user enter username as "<userName>")
  @Given("user on account opening page")
  public void user_on_account_opening_page()
  {System.out.println("user on account opening page");}

    @When("user enter following details")
    public void user_enter_following_details(DataTable dataTable)
    {
      List<Map<String ,String>> data=dataTable.asMaps();
        System.out.println(data.get(0).get("FN"));
        System.out.println(data.get(0).get("LN"));
        System.out.println(data.get(0).get("Email"));
        System.out.println(data.get(0).get("MobNo"));

        System.out.println(data.get(1).get("FN"));
        System.out.println(data.get(1).get("LN"));
        System.out.println(data.get(1).get("Email"));
        System.out.println(data.get(1).get("MobNo"));

        System.out.println(data.get(2).get("FN"));
        System.out.println(data.get(2).get("LN"));
        System.out.println(data.get(2).get("Email"));
        System.out.println(data.get(2).get("MobNo"));
    }

    @When("click on submit button")
    public void click_on_submit_button() {

    }

    @Then("account open successfully")
    public void account_open_successfully() {

    }
}