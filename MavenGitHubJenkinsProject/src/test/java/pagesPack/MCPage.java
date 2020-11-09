package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MCPage {
	
	
	
	
	@FindBy(how=How.NAME, using="ctl00$ContentLeftSide$txtFirstName")
	WebElement FirstName;
	public void enterFname(String fname) {
		FirstName.sendKeys(fname);
	}
	
	@FindBy(name="ctl00$ContentLeftSide$txtLastName")
	WebElement LastName;
	public void enterLname(String lname) {
		LastName.sendKeys(lname);
	}
	
	@FindBy(id="ctl00_ContentLeftSide_txtEmailAddress")
	WebElement EmailId;
	public void enterEmail(String email) {
		EmailId.sendKeys(email);
	}
	

	
	@FindBy(xpath="//*[@id=\"ctl00_ContentLeftSide_txtPassword\"]")
	WebElement PassWord;
	public void enterPword(String pword) {
		PassWord.sendKeys(pword);
	}
	
	@FindBy(id="ctl00_ContentLeftSide_txtConfirmPassword")
	WebElement RePassWord;
	public void enterRePword(String repword) {
		RePassWord.sendKeys(repword);
	}
	
	
	
	@FindBy(id="ctl00_ContentLeftSide_ckbAcceptTerms")
	WebElement Check;
	public void CheckBox() {
		Check.click();	}
	
	
	
	@FindBy(id="ctl00_ContentLeftSide_btnRegisterAccount")
	WebElement CreatePro;
	public void CreateProfile() {
		CreatePro.click();
	}
	


}
