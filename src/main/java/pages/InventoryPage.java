package pages;

import Utils.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by moxap on 21/03/2016.
 */

public class InventoryPage extends BasePage {

    public void InventoryHBL() {
        driver.findElement(By.id("Inventory")).click();
    }
    public void StockQuantity() {
        driver.findElement(By.id("InventoryList")).click();
    }
    public void State() {
        driver.findElement(By.id("StateId")).sendKeys("Andra Pradesh");
    }
    public void StockPoint() {
        driver.findElement(By.id("Stocks")).sendKeys("Guntur");
    }
    public void Go() {
        driver.findElement(By.id("GoButton")).click();
    }
    public void Stock1() {
        Assert.assertEquals("adminShouldSeeAStockQuantitySuccessfully", "adminShouldSeeAStockQuantitySuccessfully");
    }
    public void Inventory1() {
        driver.findElement(By.id("Inventory")).click();
    }
    public void PurchasingOrder() {
        driver.findElement(By.id("InventoryList1")).click();
    }
    public void AdvanceSearch() {
        driver.findElement(By.xpath("//div[@id='advboxM']/div/div")).click();
    }
    public void Mandatory() {driver.findElement(By.id("StateId")).sendKeys("Andra Pradesh");}
    public void Details(String SO_NO,String SO_Date,String Dealer_Code,String State, String Status) {
        driver.findElement(By.id("PoNumber")).sendKeys(SO_NO);
        driver.findElement(By.id("PoDate")).sendKeys(SO_Date);
        driver.findElement(By.id("DealerCode")).sendKeys(Dealer_Code);
        driver.findElement(By.id("State")).sendKeys(State);
        driver.findElement(By.id("poStatus")).sendKeys(Status);
    }
    public void InvalidDetails(){
        driver.findElement(By.id("PoNumber")).sendKeys("&&&&");
        driver.findElement(By.id("PoDate")).sendKeys("02-02-2016");
        driver.findElement(By.id("DealerCode")).sendKeys("677878");
        driver.findElement(By.id("State")).sendKeys("Bihar");
        driver.findElement(By.id("poStatus")).sendKeys("Pending");
    }
    public void PurchasingOrder1() {
        Assert.assertEquals("aListOfPurchsingOrderListShouldBeVisible", "aListOfPurchsingOrderListShouldBeVisible");
    }

    public void DetailsHBL() {
        Assert.assertEquals("adminShouldGetMessegeForToEnterCorrectDetails","adminShouldGetMessegeForToEnterCorrectDetails");}

    public void Order1() {
        Assert.assertEquals("AdminshouldbeabletoseePurchesingOrdersuccessfully", "AdminshouldbeabletoseePurchesingOrdersuccessfully");
    }
    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }
    public void ViewButton(){
        driver.findElement(By.cssSelector("img[title=\"View\"]")).click();}
    public void OrderDetailHBL() {
        Assert.assertEquals("heshouldbeabletovarifytheOrderDetailpage", "heshouldbeabletovarifytheOrderDetailpage");
    }
    public void Search() {
        driver.findElement(By.id("btnSaveClick")).click();
        CommonUtils.sleep(3);

    }//corrected by sir
    public void selectStocksQuantity(String state, String stock){
        if(!state.trim().equalsIgnoreCase(""))
        CommonUtils.selectFromDropDown(By.id("StateId"),state);
        if(!stock.trim().equalsIgnoreCase(""))
            CommonUtils.selectFromDropDown(By.id("Stocks"),stock);
    }//corrected by sir
    public void checkErrorMessage(){
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Please enter Mandatory Fields"));
    }//corrected by sir

    public void checkIfOrderDisplayed(String soNo) {
        Assert.assertTrue(driver.findElement(By.id("PurchaseOrderGrid")).getText().contains(soNo));
    }//corrected by sir

    public void selectMenu(String link) {
        driver.findElement(By.linkText(link.trim())).click();
        CommonUtils.sleep(2);
    }//corrected by sir



}

