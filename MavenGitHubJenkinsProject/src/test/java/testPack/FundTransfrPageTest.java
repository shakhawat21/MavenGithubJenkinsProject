package testPack;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePack.BaseClass;
import pagesPack.FundTransfrPage;

public class FundTransfrPageTest extends BaseClass{
	
	FundTransfrPage ft;
	@BeforeMethod
	public void initializePage() {
		ft=PageFactory.initElements(driver,FundTransfrPage.class );
	}
	
	@Test(priority=0)
	public void ValidPayeeAndNoAmount() throws Exception {
		
		driver.get("https://bnscorporation.com/fund-transfer/");
		ft.SelectPayee("Jim");
		ft.EnterAmount(" ");
		ft.ClickTransfer();
		
		ft.verifyMessage("Please enter a valid amount");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=1)
	public void ValidPayeeAndInvalidAmount() throws Exception {
		
		ft.SelectPayee("Jim");
		ft.EnterAmount("6000");
		ft.ClickTransfer();
		ft.verifyMessage("Transfer failed!! account cannot be overdrawn");
		Thread.sleep(2000);
		
		ft.ClearAmountBox();
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void ValidPayeeAndValidAmount() throws Exception {
		ft.SelectPayee("Jim");
		ft.EnterAmount("1000");
		ft.ClickTransfer();

		
		ft.verifyMessage("$1000 transferred successfully to Jim!!");
		Thread.sleep(2000);
		
		ft.ClearAmountBox();
		
		ft.verifyBalance("4000.00");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=3)
	public void InValidPayeeAndValidAmount() throws Exception {
		ft.SelectPayee("John");
		ft.EnterAmount("2000");
		ft.ClickTransfer();
		Thread.sleep(2000);
		
		ft.verifyMessage("Transfer failed!! 'John' is not approved. Please contact your branch");
		Thread.sleep(2000);
		
		ft.ClearAmountBox();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void InValidPayeeAndInValidAmount() throws Exception {
		//FundTransfrPage ft=PageFactory.initElements(driver,FundTransfrPage.class );
		
		ft.SelectPayee("John");
		
		ft.EnterAmount("6000");
		ft.ClickTransfer();
		Thread.sleep(2000);
		
		ft.verifyMessage("Transfer failed!! 'John' is not approved. Please contact your branch");
		Thread.sleep(2000);
		
	}


}
