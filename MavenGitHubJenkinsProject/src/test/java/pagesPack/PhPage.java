package pagesPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PhPage {
	
	
	@FindBy (name="title")
	WebElement Titlle;
	public void selectTitle(String titlee) {
		Select SelectTitle=new Select(Titlle);
		SelectTitle.selectByVisibleText(titlee);
	}
	
	
	@FindBy(how=How.NAME, using="firstname")
	WebElement FirstName;
	public void enterFname(String fname) {
		FirstName.sendKeys(fname);
	}
	
	@FindBy(name="lastname")
	WebElement LastName;
	public void enterLname(String lname) {
		LastName.sendKeys(lname);
	}
	
	@FindBy(xpath="//*[@id=\"regform\"]/section[2]/div/div[4]/input")
	WebElement StreetAddress;
	public void enterAddress(String address) {
		StreetAddress.sendKeys(address);
	}
	
	@FindBy(name="apt")
	WebElement AptNumber;
	public void enterApertment(String aptNo) {
		AptNumber.sendKeys(aptNo);
	}
	
	@FindBy(name="city")
	WebElement CityName;
	public void enterCity(String citi) {
		CityName.sendKeys(citi);
	}
	
	@FindBy(name="state")
	WebElement StateName;
	public void selectState(String stateName) {
		Select StateSelect=new Select(StateName);
		StateSelect.selectByVisibleText(stateName);
	}
	
	@FindBy(name="zip")
	WebElement ZipCode;
	public void enterZip(String zipC) {
		ZipCode.sendKeys(zipC);
	}
	
	@FindBy(name="month")
	WebElement monthName;
	
	public void SelectMonth(String mon) {
		Select monnthSelect=new Select(monthName);
		monnthSelect.selectByVisibleText(mon);
	}
	
	
	@FindBy(name="day")
	WebElement daySelect;
	public void selectDay(String day) {
		Select deySelect=new Select(daySelect);
		deySelect.selectByVisibleText(day);
	}
	
	@FindBy(name="year")
	WebElement yearSelect;
	public void selectYear(String year) {
		Select yerSelect =new Select(yearSelect);
		yerSelect.selectByVisibleText(year);
	}
	
	@FindBy(name="email")
	WebElement emaail;
	public void enterEmail(String Emal) {
		emaail.sendKeys(Emal);
	}
	
	@FindBy(name="confirm-email")
	WebElement reEmail;
	public void confirmEmail(String ConEmail) {
		reEmail.sendKeys(ConEmail);
	}
	
	
	
	@FindBy(id="remember")
	WebElement UnCheckRemember;
	public void UnclickRemember() {
		UnCheckRemember.click();
	}
	
	@FindBy(id="optin1_new")
	WebElement UnCheckSubcribe;
	public void UnclickSubscribe() {
		UnCheckSubcribe.click();
	}
	

	
	
	
	@FindBy(id="sub_btn")
	WebElement CheckSubmitBTN;
	public void clickSubmit() {
		CheckSubmitBTN.click();
	}
	

}
