package week6day2Assignment;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void SetExcelfile() {
		filename="CreateLead";
	}
	
	@Test(dataProvider="Fetchvalues")
	public  void runCreateLead(String CompanyName,String FirstName,String LastName,String PhoneNo){
		System.out.println("Create Lead");
		System.out.println("runCreateLead : "+driver);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNo);
		driver.findElement(By.name("submitButton")).click();
	}
	
	//@DataProvider(name="Fetchvalues")
	//public String[][] testdata() throws IOException {
	/*	
		String[][] values = new String[2][4];
		
		values[0][0]="TestLeaf";
		values[0][1]="Yuvarani";
		values[0][2]="S";
		values[0][3]="99";
		
		values[1][0]="TestLeaf";
		values[1][1]="Yuva";
		values[1][2]="V";
		values[1][3]="999";
		*/
		//String[][] getData = ReadExcelData.getData("./data/CreateLead.xlsx");
		//ReadExcelData obj=new ReadExcelData();
		//return getData;
	}
	
	
	
	
	
	
	
	
	







