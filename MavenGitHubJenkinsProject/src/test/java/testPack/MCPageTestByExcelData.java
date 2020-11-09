package testPack;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import Datahelper.ExcelFileReading;
import pagesPack.MCPage;

public class MCPageTestByExcelData extends BaseClass{
	///----ConnectionWithExcelFile
	//String filePath="G:\\ITTraining\\MCData.xlsx"; ///If ExcelFile into Local Machine
	String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelData\\MCData.xlsx";///If ExcelFile into project
	
	///----ConnectionWithExcelSheet
	String sheetName="MCDataSheet"; ///When We using Excel File
	 
	///---(Above) Code for Excel File -----\\\\

	
	
MCPage mcp;
	
	@BeforeMethod
	public void initializePHPPage() {
		mcp =PageFactory.initElements(driver, MCPage.class);
		driver.get("https://account.microcenter.com/Registration.aspx");
	}
	
	@Test(dataProvider="mcdata")
	public void McregistrationForm(String FName,String LName,String Email, String PWord,String ConPword) throws InterruptedException {
		
		mcp.enterFname(FName);
		mcp.enterLname(LName);
		mcp.enterEmail(Email);
		mcp.enterPword(PWord);
		mcp.enterRePword(ConPword);
		
		Thread.sleep(2000);
		mcp.CheckBox();
		
		Thread.sleep(2000);
		mcp.CreateProfile();
		
		
	}
	
	
	@DataProvider(name="mcdata")
	
	public Object[][] getData() throws IOException{

		return ExcelFileReading.excelDataReading(filePath, sheetName);
	}
	
	

}
