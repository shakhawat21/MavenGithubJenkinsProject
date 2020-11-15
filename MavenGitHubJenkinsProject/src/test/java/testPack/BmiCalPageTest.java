package testPack;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import pagesPack.BmiPage;



public class BmiCalPageTest extends BaseClass{
	
	BmiPage bmiCal;
	@BeforeMethod
	public void initializePage() {
		bmiCal=PageFactory.initElements(driver,BmiPage.class );
	}
	
	
	
	@Test(priority=0)
	public void NoHeightAndNoWeight() throws Exception  {
		driver.get("https://bnscorporation.com/bmi-calculator/");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		System.out.println("Url is opening=======================================");

	
	}
	
	@Test(priority=1)
	public void ValidHeightAndNoWeight() throws Exception  {
		bmiCal.EnterHeight("150");
		bmiCal.ClickCalculateBMI();
		
		bmiCal.verifyMessage("Please enter Weight");
		Thread.sleep(4000);
		bmiCal.ClearHeightBox();

	
	}
	
	@Test(priority=2)
	public void NoHeightAndValidWeight() throws Exception  {
		
		bmiCal.EnterWeight("40");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		bmiCal.ClearWeightBox();
		Thread.sleep(4000);
		bmiCal.verifyMessage("Please enter Height");

	
	}
	
	@Test(priority=3)
	public void UnderweightCategory() throws Exception  {
		bmiCal.EnterHeight("150");
		bmiCal.EnterWeight("40");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		bmiCal.ClearHeightBox();
		bmiCal.ClearWeightBox();
		
		bmiCal.verifyBMIValue("17.8");
		
		bmiCal.verifyBMICategory("Underweight");

	
	}
	
	@Test(priority=4)
	public void NormalCategory() throws Exception  {
		Thread.sleep(4000);
		bmiCal.EnterHeight("150");
		bmiCal.EnterWeight("50");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		
		bmiCal.verifyBMIValue("22.2");
		
		bmiCal.verifyBMICategory("Normal");
		Thread.sleep(4000);
		bmiCal.ClearHeightBox();
		bmiCal.ClearWeightBox();

	
	}
	
	@Test(priority=5)
	public void OverweightCategory() throws Exception  {
		Thread.sleep(4000);
		bmiCal.EnterHeight("150");
		bmiCal.EnterWeight("60");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		
		bmiCal.verifyBMIValue("26.7");
		
		bmiCal.verifyBMICategory("Overweight");
		Thread.sleep(4000);
		bmiCal.ClearHeightBox();
		bmiCal.ClearWeightBox();
		
		Thread.sleep(4000);
	
	}
	
	@Test(priority=6)
	public void ObesityCategory() throws Exception  {
		Thread.sleep(4000);
		bmiCal.EnterHeight("150");
		bmiCal.EnterWeight("70");
		bmiCal.ClickCalculateBMI();
		Thread.sleep(4000);
		
		bmiCal.verifyBMIValue("31.1");
		
		bmiCal.verifyBMICategory("Obesity");
		Thread.sleep(4000);
		

	
	}

}
