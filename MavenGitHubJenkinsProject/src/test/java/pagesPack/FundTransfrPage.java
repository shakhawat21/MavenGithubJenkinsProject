package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FundTransfrPage {
	
	
	
	@FindBy(how=How.NAME, using="payee")
	WebElement payeename;
	public void SelectPayee(String pyee) {
		Select payeeSelect=new Select(payeename);
		payeeSelect.selectByVisibleText(pyee);	
	}

	
	@FindBy(how=How.ID, using="amount")
	WebElement myamount;
	public void EnterAmount(String amnt) {
		myamount.sendKeys(amnt);
	}
	
	@FindBy(id="transfer")
	WebElement transferBTN;
	public void ClickTransfer() {
		transferBTN.click();
	}
	
	@FindBy(id="amount")
	WebElement ClearAmount;
	public void ClearAmountBox() {
		ClearAmount.clear();
	}
	@FindBy(id="message")
	WebElement getMessage;
	public void verifyMessage(String expectedMessage) {
		String actualMessage=getMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	@FindBy(id="balance")
	WebElement remainingBalance;
	public void verifyBalance(String expectedBalance) {
		String actualBalance=remainingBalance.getAttribute("value");
		Assert.assertEquals(actualBalance, expectedBalance);
		
	}
	
	
	
}
