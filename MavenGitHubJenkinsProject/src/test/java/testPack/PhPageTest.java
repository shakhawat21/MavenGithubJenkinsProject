package testPack;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import pagesPack.PhPage;


public class PhPageTest extends BaseClass{
	PhPage ph;
	@BeforeMethod
	public void initializePHPPage() {
		ph =PageFactory.initElements(driver, PhPage.class);
		driver.get("https://accounts.pch.com/register");
	}
	
	@Test(dataProvider="pchdata")
	public void registrationForm(String ttl,String FName,String LName,String Address, String Apt,String City,
			String State,String Zipcode,String MN,String DY,String YR,String Eml,String ConEml) throws InterruptedException {
		
		ph.selectTitle(ttl);
		ph.enterFname(FName);
		ph.enterLname(LName);
		ph.enterAddress(Address);
		ph.enterApertment(Apt);
		ph.enterCity(City);
		ph.selectState(State);
		ph.enterZip(Zipcode);
		
		Thread.sleep(2000);
		
		ph.SelectMonth(MN);
		ph.selectDay(DY);
		ph.selectYear(YR);
		ph.enterEmail(Eml);
		ph.confirmEmail(ConEml);
		ph.UnclickRemember();
		ph.UnclickSubscribe();
		ph.clickSubmit();
		
		
	}
	
	
	
	@DataProvider(name="pchdata")
	public Object[][] getData(){
		return new Object[][] {
			{"Mr.","Ahsan","Pramanik","2340 76th ave","1G", "Jamaica","New York","11432", "May","20","1985",
				"ahsan@gmail.com", "ahsan@gmail.com",},
			{"Ms.","Ahsan","Pramanik","2340 76th ave","1G", "Jamaica","New York","11432", "May","20","1985",
					"ahsan@gmail.com", "ahsan@gmail.com",},
			
			{"Mrs.","Ahsan","Pramanik","2340 76th ave","1G", "Jamaica","New York","11432", "May","20","1985",
						"ahsan@gmail.com", "ahsan@gmail.com",},	
			
		};
	}
	
	

}
