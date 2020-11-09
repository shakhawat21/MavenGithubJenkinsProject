package testPack;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import pagesPack.MCPage;


public class MCPageTest extends BaseClass {
	MCPage mcp;
	
	@BeforeMethod
	public void initializePHPPage() {
		mcp =PageFactory.initElements(driver, MCPage.class);
		driver.get("https://account.microcenter.com/Registration.aspx");
	}
	
	@Test(dataProvider="mcdata")
	public void McregistrationForm(String FName,String LName,String Email, String PWord,String ConPword) {
		
		mcp.enterFname(FName);
		mcp.enterLname(LName);
		mcp.enterEmail(Email);
		mcp.enterPword(PWord);
		mcp.enterRePword(ConPword);
		mcp.CheckBox();
		mcp.CreateProfile();
		
		
	}
	
	
	@DataProvider(name="mcdata")
	
	public Object[][] getData(){
		return new Object[][] {
			{"Ahsan","Pramanik","ahsan@gmail.com","1Ge1kr84", "1Ge1kr84",},
			{"Babul","Hossain","babul@gmail.com","9283kr84", "9283kr84",},
			{"David","Poul","paul@gmail.com","j839kr84", "j839kr84",},
			{"Enam","Khan","khan@gmail.com","03k9kr84", "03k9kr84",},
			{"Frank","Colin","colin@gmail.com","p9d8kr84", "p9d8kr84",},
			{"Grag","Luwes","grag@gmail.com","029okr84", "029okr84",},
			
			
		};
	}
	
	

}
