package testPack;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




import BasePack.BaseClass;
import Datahelper.ExcelFileReading;
import pagesPack.PhPage;

public class PhPageTestByExcelData extends BaseClass{
	//String filePath="G:\\ITTraining\\PCHData.xlsx";
			String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelData\\PCHData.xlsx";///If ExcelFile into project
			//String sheetName="PCHData"; ///When We using Excel File
			//\src\test\resources\ExcelData\PCHData.xlsx
			///---(Above) Code for Excel File 
			String sheetName="PCHDataSheet";
		
		PhPage php;
		@BeforeMethod
		public void initializePHPPage() {
			php =PageFactory.initElements(driver, PhPage.class);
			driver.get("https://accounts.pch.com/register");
		}
		
		@Test(dataProvider="pchdata")
		public void registrationForm(String Title,String FName,String LName,String Address, String Apt, String City,
				String State,String Zipcode,String MN,String DY,String YR,String Eml,String ConEml) throws Exception {
			
			php.selectTitle(Title);
			php.enterFname(FName);
			php.enterLname(LName);
			php.enterAddress(Address);
			php.enterApertment(Apt);
			php.enterCity(City);
			
			Thread.sleep(2000);
			
			php.selectState(State);
			php.enterZip(Zipcode);
			php.SelectMonth(MN);
			php.selectDay(DY);
			php.selectYear(YR);
			php.enterEmail(Eml);
			php.confirmEmail(ConEml);
			
			Thread.sleep(2000);
			
			php.UnclickRemember();
			
			Thread.sleep(2000);
			
			php.clickSubmit();
			
		}
		
		
		
		@DataProvider(name="pchdata")
		public Object[][] getData() throws IOException{
			
				return ExcelFileReading.excelDataReading(filePath, sheetName);
				
			
		}
		
	
	

}
