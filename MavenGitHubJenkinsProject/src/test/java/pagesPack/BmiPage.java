package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class BmiPage {


	
//	public static final String Thread = null;
	@FindBy(how=How.ID, using="heightCMS")
	WebElement UserHeight;
	public void EnterHeight(String height) {
		UserHeight.sendKeys(height);
		
	}
	
	@FindBy(id="weightKg")
	WebElement UserWeight;
	public void EnterWeight(String weight) {
		UserWeight.sendKeys(weight);
		
	}
	
	@FindBy(id="Calculate")
	WebElement CalculateBmi;
	public void ClickCalculateBMI() {
		CalculateBmi.click();
	}
	
	@FindBy(id="heightCMS")
	WebElement ClearHeight;
	public void ClearHeightBox() {
		ClearHeight.clear();
	}
	
	@FindBy(id="weightKg")
	WebElement ClearWeight;
	public void ClearWeightBox() {
		ClearWeight.clear();
	}
	
	@FindBy(id="error")
	WebElement getBmiMessage;
	public void verifyMessage(String expectedMessage) {
		String actualMessage=getBmiMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@FindBy(id="bmi")
	WebElement getBmiValue;
	public void verifyBMIValue(String expectedMessage) {
		String actualMessage=getBmiValue.getAttribute("value");
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@FindBy(id="bmi_category")
	WebElement getbmi_category;
	public void verifyBMICategory(String expectedMessage) {
		String actualMessage=getbmi_category.getAttribute("value");
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	
	
	
	
	
	
}
