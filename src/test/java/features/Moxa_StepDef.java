package features;

import Utils.AutomationConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InventoryPage;
import pages.LoginPage;

/**
 * Created by moxap on 15/03/2016.
 */
public class Moxa_StepDef {
    LoginPage loginPage = new LoginPage();// calling the object which we have created in main folder under LoginPage name for to use of that codes which we have written in that object page .
    InventoryPage inventoryPage = new InventoryPage();


    @Given("^User has already logged into CSB menu$")
    public void userHasAlreadyLoggedIntoCSBMenu() throws Throwable {
        loginPage.loginHBL(AutomationConstants.USERNAME, AutomationConstants.PASSWORD);// calling the method name which we have created in login page for this step .
        // it will be same for all steps we will be creating method for each step in object folder and we will call that method here under
        // created new method name . created object name ( which is same as in new object page)

    }

    @When("^he navigates it to \"([^\"]*)\" option$")
    public void heNavigatesItToOption(String link) throws Throwable {
        inventoryPage.selectMenu(link);

    }

    @And("^press on to \"([^\"]*)\" button$")
    public void pressOnToButton(String Stockquantity) throws Throwable {
        inventoryPage.StockQuantity();
    }

    @And("^choose \"([^\"]*)\" from the drop down menu$")
    public void chooseFromTheDropDownMenu(String state) throws Throwable {
        inventoryPage.State();
    }

    @And("^choose \"([^\"]*)\" from the drop down list$")
    public void chooseFromTheDropDownList(String StockPoint) throws Throwable {
        inventoryPage.StockPoint();
    }

    @And("^press on to \"([^\"]*)\" buttons$")
    public void pressOnToButtons(String Go) throws Throwable {
        inventoryPage.Go();
    }

    @Then("^admin should see a stock quantity successfully$")
    public void adminShouldSeeAStockQuantitySuccessfully() throws Throwable {
        inventoryPage.Stock1();
    }
    @And("^enter the Mandatory Field as Andra Pradesh$")
    public void enterTheMandatoryFieldAsAndraPradesh() throws Throwable {
        inventoryPage.Mandatory();
    }
    @When("^navigates it to \"([^\"]*)\" option$")
    public void navigatesItToOption(String Inventory1) throws Throwable {
        inventoryPage.Inventory1();
    }
    @Then("^Admin should get messege for to enter correct details$")
    public void adminShouldGetMessegeForToEnterCorrectDetails() throws Throwable {
        inventoryPage.DetailsHBL();
    }
    @And("^press on to Purchasing order button$")
    public void pressOnToPurchasingOrderButton() throws Throwable {
        inventoryPage.PurchasingOrder();
    }
    @When("^enter the Details$")
    public void enter_the_Details() throws Throwable {
        inventoryPage.InvalidDetails();
    }
    @When("^Press on  \"(.*?)\" button$")
    public void press_on_button(String AdvanceSearch) throws Throwable {
        inventoryPage.AdvanceSearch();
    }

    @When("^enter the Details as \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\"$")
    public void enter_the_Details_as(String SO_NO, String SO_Date, String Dealer_Code, String State, String Status) throws Throwable {
        inventoryPage.Details(SO_NO,SO_Date,Dealer_Code,State,Status);
    }
    @And("^admin should logout$")
    public void admin_should_logout() throws Throwable {
        inventoryPage.logout();
    }
    @Then("^Admin should be able to see Purchesing Order successfully$")
    public void admin_should_be_able_to_see_Purchesing_Order_successfully() throws Throwable {
        inventoryPage.Order1();
    }
    @Then("^a list of Purchsing Order list should be visible$")
    public void aListOfPurchsingOrderListShouldBeVisible() throws Throwable {
        inventoryPage.PurchasingOrder1();
    }

    @And("^Press on to \"([^\"]*)\" buttons$")
    public void pressOntoButtons(String Search) throws Throwable {
        inventoryPage.Search();
    }//corrected by sir

    @Then("^Admin should be able to see Purchesing Order successfully with SO No \"([^\"]*)\"$")
    public void admin_should_be_able_to_see_Purchesing_Order_successfully(String SONo) throws Throwable {
        inventoryPage.checkIfOrderDisplayed(SONo);
    }//corrected by sir

    @And("^enter the Mandatory Field as \"([^\"]*)\" , \"([^\"]*)\"$")
    public void enterTheMandatoryFieldAs(String state, String stock) throws Throwable {
      inventoryPage.selectStocksQuantity(state, stock);
    }//corrected by sir

    @Then("^Admin should see error messege: \"([^\"]*)\"$")
    public void adminShouldSeeErrorMessege(String arg0) throws Throwable {
        inventoryPage.checkErrorMessage();
    }//corrected by sir

    @Then("^he should see a Advance search button$")
    public void heShouldSeeAAdvanceSearchButton() throws Throwable {
        inventoryPage.AdvanceSearch();
    }
    @And("^Press on \"([^\"]*)\" button$")
    public void pressOnButton(String arg0) throws Throwable {
        inventoryPage.ViewButton();
    }
    @Then("^he should be able to varify the Order Detail page$")
    public void heShouldBeAbleToVarifyTheOrderDetailPage() throws Throwable {
        inventoryPage.OrderDetailHBL();
    }

}