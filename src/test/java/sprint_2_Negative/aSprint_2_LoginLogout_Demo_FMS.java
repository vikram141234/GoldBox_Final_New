package sprint_2_Negative;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage;
import objectRepository.Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage;
import objectRepository.SchemesPage;
import objectRepository.Schemes_SchemeListPage;

public class aSprint_2_LoginLogout_Demo_FMS {

	WebDriverUtility wUtil = new WebDriverUtility();
	JavaUtility jUtil = new JavaUtility();
	
	String SchemeName = "Scheme"+jUtil.getRandomNum();
	
	@Test(groups = "sprint-2", priority = 1)
	public void a_loginByGivingInvalidEmailError1Test() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("Soumya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "a_loginByGivingInvalidEmailError1Test");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
		
	}
	
	@Test(groups = "sprint-2", priority = 2)
	public void b_loginByGivingInvalidPasswordError2Test() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@123");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "b_loginByGivingInvalidPasswordError2Test");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
	}
	
	
	@Test(groups = "sprint-2", priority = 3)
	public void c_loginToFmsApplicationPass3Test() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(6000);
		wUtil.takeScreenShot(driver, "c_loginToFmsApplicationPass3Test");
		try 
		{
			Thread.sleep(2000);
		} 
		finally 
		{
			driver.quit();
		}
	}
	
	
	@Test(groups = "sprint-2", priority = 4)
	public void d_clickOnEcommerceSchemesPageShouldOpenError4Test() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
		driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Ecommerce']")).click();	
		Thread.sleep(1000);
		
		WebElement SchemesList = driver.findElement(By.xpath("//a[.='Scheme List']"));
		
		try
		{
			if(SchemesList.isDisplayed())
			{
				System.out.println("Schemes Page Opened");
				driver.quit();
			}
			else 
			{
				Thread.sleep(1000);
				wUtil.takeScreenShot(driver, "d_clickOnEcommerceSchemesPageShouldOpenError4Test");
				Thread.sleep(2000);
				driver.quit();
			}
		}
		finally 
		{
			driver.quit();
		}
	}
		
		@Test(groups = "sprint-2", priority = 5)
		public void e_clickOnUserLinkSchemesPageShouldOpenError5Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[.='Users']")).click();	
			Thread.sleep(1000);
			
			WebElement SchemesList = driver.findElement(By.xpath("//a[.='Scheme List']"));
			try
			{
				if(SchemesList.isDisplayed())
				{
					System.out.println("Schemes Page Opened");
					driver.quit();
				}
				else 
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "e_clickOnUserLinkSchemesPageShouldOpenError5Test");
					Thread.sleep(2000);
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 6)
		public void f_schemeClickOnAddSchemesAndAddSchemesPageShouldNotOpenError6Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[.='Schemes']")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[.='Scheme List']")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();	
			Thread.sleep(1000);
			
			WebElement AddSchemePage = driver.findElement(By.xpath("//h1[.='Add Scheme']"));
			try
			{
				if(AddSchemePage.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "f_schemeClickOnAddSchemesAndAddSchemesPageShouldNotOpenError6Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Add Scheme Page is not displayed");
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
		
	    }
		
		
		@Test(groups = "sprint-2", priority = 7)
		public void g_schemeCreatingWithoutGivingCountryDrpDwnErrorButPass7Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys("Scheme"+jUtil.getRandomNum());
			
			Thread.sleep(2000);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByVisibleText("MY GOLD", CalculationDrpDwn);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Added Successfully '])[2]"));
			
			try
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "g_schemeCreatingWithoutGivingCountryDrpDwnErrorButPass7Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Not Created");
					driver.quit();
				}
			}
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 8)
		public void h_schemeCreatingWithoutGivingCalculationDrpDwnError8Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys("Scheme"+jUtil.getRandomNum());
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 7);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter scheme_calculation_type '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "h_schemeCreatingWithoutGivingCalculationDrpDwnTest8ErrorTest");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Created");
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 9)
		public void i_schemeCreatingWithoutGivingSchemeDescriptionError9Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 1);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' please Enter description '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "i_schemeCreatingWithoutGivingSchemeDescriptionError9Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Created");
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		}
		
		
		@Test(groups = "sprint-2", priority = 10)
		public void j_schemeCreatingByGivingAllSchemeDetailsPass10Test() throws Exception
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement SuccessMsg = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='page-header']/following-sibling::div[@class='card-body']//td)[1]"));
			
			wUtil.waitForElementToBeVisible(driver, SuccessMsg);
			
			try 
			{
				if(SuccessMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "j_schemeCreatingByGivingAllSchemeDetailsPass10Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Not Added");
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
//			WebElement FirstSchemeElement = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='page-header']/following-sibling::div[@class='card-body']//td)[1]"));
//			
//			String FrstScheme = FirstSchemeElement.getText();
//			
//			if(FrstScheme.contains(SchemeName))
//			{
//				Thread.sleep(1000);
//				wUtil.takeScreenShot(driver, "schemeCreatingByGivingAllSchemeDetailsTest");
//				System.out.println("Scheme Created");
//				Thread.sleep(2000);
//				driver.quit();
//			}
//			else 
//			{
//				System.out.println("Scheme Not Created");
//				Thread.sleep(2000);
//				driver.quit();
//			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 11)
		public void k_addingTenureListDetailsWithoutGivingAnyDetailsError11Test() throws Exception
		{
			String SchemeName = "Scheme"+jUtil.getRandomNum();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 9);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]")).click();
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			WebElement ErrorMsg = driver.findElement(By.xpath("(//div[.=' Please Enter Tenure '])[2]"));
			
			try 
			{
				if(ErrorMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "k_addingTenureListDetailsWithoutGivingAnyDetailsError11Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Tenure Added Successfully");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 12)
		public void l_addingTenureListDetailsByGivingAllDetailsPass12Test() throws Exception
		{
						
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Scheme Tenure Added Successfully '])[2]"));
			
			try 
			{
				if(SuccessMsg.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "l_addingTenureListDetailsByGivingAllDetailsPass12Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Tenure Not Added Successfully");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 13)
		public void m_addingTenureAmountDetailsWithoutGivingAnyDetailsError13Test() throws Exception
		{			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(1000);
			
			WebElement ErrorElement = driver.findElement(By.xpath("//div[@aria-label='Please Enter Amount']"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "m_addingTenureAmountDetailsWithoutGivingAnyDetailsError13Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Amount Not Added Successfully");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		@Test(groups = "sprint-2", priority = 14)
		public void n_addingTenureAmountDetailsByGivingAllPositiveDetailsPass14Test() throws Exception
		{
			String Amt = "1000";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/../following-sibling::div//th[.='Tenure in Amount']/../../following-sibling::tbody/tr/td"));
			String Amount = AmountElement.getText();
			
			try 
			{
				if(Amount.contains(Amt))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "n_addingTenureAmountDetailsByGivingAllPositiveDetailsPass14Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Tenure Not Added Successfully");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		}
		
		
		@Test(groups = "sprint-2", priority = 15)
		public void o_actionInfoSchemeContentAddingByGivingValidDataPass15Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Content Added Successfully '])[2]"));
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "o_actionInfoSchemeContentAddingByGivingValidDataPass15Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Content Not Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		
		
		@Test(groups = "sprint-2", priority = 16)
		public void p_actionInfoSchemeContentAddingWithoutGivingDataError16Test() throws Exception
		{
			String Amt = "1000";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter content '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "p_actionInfoSchemeContentAddingWithoutGivingDataError16Test");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[.='Manage Tenure Amount']//button[@aria-label='Close']")).click();
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Content Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		
		
		}
		
		
		@Test(groups = "sprint-2", priority = 17)
		public void q_actionInfoSchemeTermsAndConditionsAddingWithoutGivingDataError17Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div [.=' Please Enter Terms & Conditions '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "q_actionInfoSchemeTermsAndConditionsAddingWithoutGivingDataError17Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Content Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
		
		
		}
		
		
		@Test(groups = "sprint-2", priority = 18)
		public void r_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataPass18Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Terms&Conditions Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "r_actionInfoSchemeTermsAndConditionsAddingByGivingValidDataPass18Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Terms and Conditions Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		
		}
		
		
		@Test(groups = "sprint-2", priority = 19)
		public void s_actionInfoSchemeFeatureAddingByGivingValidDataPass19Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h4[.='Schemes Features']/../following-sibling::div//h6[.='Add Feature']")).click();
			
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
            
            ssasaPage.getEnterFeatureEdt().sendKeys("Gold Plus Plan");
            
            Thread.sleep(2000);
            
            ssasaPage.getEnterFeatureExplanationEdt().sendKeys("11+1");
            
			Thread.sleep(2000);
			
			ssasaPage.getAddBtn().click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Features Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "s_actionInfoSchemeFeatureAddingByGivingValidDataPass19Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Terms and Conditions Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 20)
		public void t_actionInfoSchemeFeatureAddingWithoutGivingDataPageStaticError20Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h4[.='Schemes Features']/../following-sibling::div//h6[.='Add Feature']")).click();
			
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
			
//			ssasaPage.getAddBtn().click();
			
			String AddBtn = ssasaPage.getAddBtn().getText();
			
//			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Features Added Successfully '])[2]"));
//			
//			Thread.sleep(1000);
			try 
			{
				if(AddBtn.contains("Add"))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "t_actionInfoSchemeFeatureAddingWithoutGivingDataPageStaticError20Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Terms and Conditions Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		
		@Test(groups = "sprint-2", priority = 21)
		public void u_actionInfoSchemeFaqAddingByGivingValidDataPass21Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']")).sendKeys(Content);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='content']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//textarea[@formcontrolname='tc']")).sendKeys("Terms and Conditions");
			
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='tc']/../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssasiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
			
			ssasiPage.getAddFeatureBtn().click();
			
            Thread.sleep(2000);
              
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaFeaturePage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
            
            ssasaFeaturePage.getEnterFeatureEdt().sendKeys("Feature");
            
            Thread.sleep(2000);
            
            ssasaFeaturePage.getEnterFeatureExplanationEdt().sendKeys("Explanation");
            
            Thread.sleep(2000);
            
            ssasaFeaturePage.getAddBtn().click();
            
            Thread.sleep(2000);
            
            ssasiPage.getAddFaqBtn().click();
            
            Thread.sleep(2000);
            
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasaPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
            
			ssasaPage.getEnterFaqQuestionEdt().sendKeys("Question");
			
			Thread.sleep(2000);
			
			ssasaPage.getEnterFaqAnswerEdt().sendKeys("Answer");
			
			Thread.sleep(2000);
			
			ssasaPage.getAddBtn().click();
			
			WebElement SuccessElement = driver.findElement(By.xpath("(//div[.=' Scheme Faqs Added Successfully '])[2]"));
			
			Thread.sleep(1000);
			
			try 
			{
				if(SuccessElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "u_actionInfoSchemeFaqAddingByGivingValidDataPass21Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Terms and Conditions Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 22)
		public void v_actionInfoSchemeFaqAddingWithoutGivingDataPageStaticError22Test() throws Exception
		{
			String Amt = "1000";
			String Content = "Content";
			String TermsAndConditions = "Terms And Conditions";
			String Feature = "Feature";
			String Explanation = "Explanation";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 6);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement TenureListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[1]"));
			TenureListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//input[@placeholder='Enter tenure in months']")).sendKeys("12");
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Manage Tenures']/../following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenures']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			
			WebElement AmountListInfoBtn = driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]"));
			AmountListInfoBtn.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//input[@placeholder='Enter Amount']")).sendKeys(Amt);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[.='Manage Tenure Amount']/following-sibling::div//button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[2]")).click();
			
			Thread.sleep(2000);
			
			WebElement CloseBtnElement = driver.findElement(By.xpath("//h1[.='Manage Tenure Amount']/following-sibling::button[@aria-label='Close']"));
			CloseBtnElement.click();
			
			driver.findElement(By.xpath("(//h4[.='Schemes List']/ancestor::div[@class='card-header']//td[.='"+SchemeName+"']/following-sibling::td/button[.=' Info '])[3]")).click();
						
            Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage ssasiPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfoPage(driver);
			
			Thread.sleep(2000);
			
			ssasiPage.addContent(Content);
			
			Thread.sleep(2000);
			
			ssasiPage.addSchemeTermsAndConditions(driver, TermsAndConditions);
			
			Thread.sleep(2000);
			
			ssasiPage.getAddFeatureBtn().click();
			
			Thread.sleep(2000);
			
			Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage ssasaFeaturePage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFeaturePage(driver);
			ssasaFeaturePage.addFeature(Feature, Explanation);
			
			Thread.sleep(2000);
			
			ssasiPage.getAddFaqBtn().click();
			
			Thread.sleep(2000);
			
            Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage ssasaFaqPage = new Scheme_SchemesList_ActionInfoBtn_SchemeInfo_AddFaqPage(driver);
            String FaqAddBtn = ssasaFaqPage.getAddBtn().getText();
			
			Thread.sleep(1000);
			try 
			{
				if(FaqAddBtn.contains("Add"))
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "v_actionInfoSchemeFaqAddingWithoutGivingDataPageStaticError22Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Terms and Conditions Added");
					Thread.sleep(2000);
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 23)
		public void w_schemeCreatingWithoutGivingSchemeNameError23Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();
			
			Thread.sleep(2000);
			
			WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 8);
			
			Thread.sleep(2000);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement ErrorElement = driver.findElement(By.xpath("(//div[.=' Please Enter title '])[2]"));
			
			try 
			{
				if(ErrorElement.isDisplayed())
				{
					Thread.sleep(1000);
					wUtil.takeScreenShot(driver, "w_schemeCreatingWithoutGivingSchemeNameError23Test");
					Thread.sleep(2000);
					driver.quit();
				}
				else 
				{
					System.out.println("Scheme Created");
					driver.quit();
				}
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		@Test(groups = "sprint-2", priority = 24)
		public void x_loginWithoutGivingEmailAndPasswordError24Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "x_loginWithoutGivingEmailAndPasswordError24Test");
			
			try 
			{
				Thread.sleep(2000);
			} finally 
			{
				driver.quit();
			}
			
			
		}
		
		@Test(groups = "sprint-2", priority = 25)
		public void y_loginWithoutGivingEmailError25Test() throws IOException, InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "y_loginWithoutGivingEmailError25Test");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
			
		}
		
		@Test(groups = "sprint-2", priority = 26)
		public void z_loginWithoutGivingPasswordError26Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "z_loginWithoutGivingPasswordError26Test");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
			
			
		}
		
		@Test(groups = "sprint-2", priority = 27)
		public void za_loginByGivingEmailAsPwdAndPasswordAsEmailError27Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver, "za_loginByGivingEmailAsPwdAndPasswordAsEmailError27Test");
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
				
		}
		
		
		@Test(groups = "sprint-2", priority = 28)
		public void zb_schemeBootstrapBtnDisablingAndCheckingSchemeIsEnabledInUserPannelError28Test() throws Exception
		{
			PropertyFileUtility pUtil = new PropertyFileUtility();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(6000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();
	        
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			driver.get("http://stg.goldbox.gold/login");
			
			String MOBILENUMBER = pUtil.readDataFromPropertyFile("mobilenumber");
		    String OTP = pUtil.readDataFromPropertyFile("otp");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(MOBILENUMBER , Keys.ENTER);
	        
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys(OTP);
		    
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//span[.='Schemes']")).click();
		    
		    Thread.sleep(2000);
		    
		    String AllSchemesPage = driver.findElement(By.xpath("//div[@class='card mt-3 p-4']")).getText();
		    
		    if(AllSchemesPage.contains(SchemeName))
		    
		    Thread.sleep(2000);
		    
		    WebElement AllSchemes = driver.findElement(By.xpath("//div[@class='row ng-star-inserted']"));
		    
		    String allSchemes = AllSchemes.getText();
		    
		    if(allSchemes.contains(SchemeName))
		    {
		    	System.out.println("Pass");
		    }
		    else 
		    {
				wUtil.takeScreenShot(driver, "zb_schemeBootstrapBtnDisablingAndCheckingSchemeIsEnabledInUserPannelError28Test");
				Thread.sleep(2000);
			}
		    
		    try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		    	
		    
			
			
		}
		
		
		
		@Test(groups = "sprint-2", priority = 29)
		public void zb_schemeBootstrapBtnEnablingAndCheckingSchemeIsDisabledInUserPannelError29Test() throws Exception
		{
			PropertyFileUtility pUtil = new PropertyFileUtility();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(6000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[.='Scheme List']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();
	        
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//h1[.='Add Scheme']/../..//input[@placeholder='Enter Scheme Name']")).sendKeys(SchemeName);
			
			Thread.sleep(2000);
			
            WebElement CountryDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CountryDrpDwn, 4);
			
            WebElement CalculationDrpDwn = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Thread.sleep(2000);
			
			wUtil.handleDropdownByIndex(CalculationDrpDwn, 2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Description");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement BootStrapBtn = driver.findElement(By.xpath("((//td[.='"+SchemeName+"']/..//td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td)[1]/following-sibling::td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']/following-sibling::div[@class='mdc-switch__icons']"));
			
			if(BootStrapBtn.isEnabled());
			{
				BootStrapBtn.click();
			}
			
			driver.get("http://stg.goldbox.gold/login");
			
			String MOBILENUMBER = pUtil.readDataFromPropertyFile("mobilenumber");
		    String OTP = pUtil.readDataFromPropertyFile("otp");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(MOBILENUMBER , Keys.ENTER);
	        
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys(OTP);
		    
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//span[.='Schemes']")).click();
		    
		    Thread.sleep(2000);
		    
		    String AllSchemesPage = driver.findElement(By.xpath("//div[@class='card mt-3 p-4']")).getText();
		    
		    if(AllSchemesPage.contains(SchemeName))
		    
		    Thread.sleep(2000);
		    
		    WebElement AllSchemes = driver.findElement(By.xpath("//div[@class='row ng-star-inserted']"));
		    
		    String allSchemes = AllSchemes.getText();
		    
		    if(allSchemes.contains(SchemeName))
		    {
		    	wUtil.takeScreenShot(driver, "zb_schemeBootstrapBtnEnablingAndCheckingSchemeIsDisabledInUserPannelError28Test");
		    	Thread.sleep(2000);
		    }
		    else 
		    {
		    	System.out.println("Fail");
			}
		    	
		    try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
		    
		}
		
		
		@Test(groups = "sprint-2", priority = 30)
		public void clickOnDashboardSchemePageShouldBeDisplayedError30Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			
			Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[.='Dashboard']")).click();
	        
	        Thread.sleep(2000);
	        
	        WebElement SchemesPage = driver.findElement(By.xpath("//a[.='Scheme List']"));
	        
	        if(SchemesPage.isDisplayed())
	        {
	        	System.out.println("Schemes Page Displayed");
	        }
	        else
	        {
				wUtil.takeScreenShot(driver, "clickOnDashboardSchemePageShouldBeDisplayed");
			}
	        
	        try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
	        
	        
		}
		
		
		@Test(groups = "sprint-2", priority = 31)
		public void creatingSchemeWithoutGivingDataError31Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
			driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
			Thread.sleep(5000);
			
			DashboardPage dPage = new DashboardPage(driver);
			wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
			dPage.getSchemesDrpDwn().click();
		    
			Thread.sleep(2000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(2000);
			
			Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
			sslPage.getAddSchemeBtn().click();

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			Thread.sleep(2000);
			
			WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter title '])[2]"));
			
			if (Error.isDisplayed()) 
			{
				wUtil.takeScreenShot(driver, "creatingSchemeWithoutGivingDataError31Test");
			}
			else 
			{
                System.out.println("Scheme Created Successfully");
			}
			
			try 
			{
				Thread.sleep(2000);
			} 
			finally 
			{
				driver.quit();
			}
			
		}
		
		
		@Test(groups = "sprint-2", priority = 32)
		public void clickingOnPayNowBtnWithOutSelectingPaymentMode32Test() throws Exception
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://stg.goldbox.gold/login");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6309631698");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='Continue']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("123456");
			
			Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//span[.='Schemes']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	        
	        Thread.sleep(5000);
	        
	        WebElement SelectAmountDrpDwn = driver.findElement(By.xpath("//select[@id='amount']"));
	        Select s = new Select(SelectAmountDrpDwn);
	        s.selectByVisibleText("1500");
	        
	        Thread.sleep(2000);
	        
	        try 
	        {
	        	WebElement LivePriceError = driver.findElement(By.xpath("(//div[.=' Gold live Price Issue '])[2]"));
	        	
				if(LivePriceError.isDisplayed())
				{
					Thread.sleep(2000);
					driver.quit();
				}
			} 
	        catch (Exception e) 
	        {
	        	Thread.sleep(2000);
		        
		        WebElement MonthsDrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='total_installments']"));
		        Select ss = new Select(MonthsDrpDwn);
		        ss.selectByVisibleText("12 Months");
		        
		        Thread.sleep(2000);
		        
		        wUtil.scrollPageDown();
		        
		        Thread.sleep(2000);
		        
		        WebElement TermsAndConditionsCheckBox = driver.findElement(By.xpath("//div[@class='form-group pt-2 d-block']/div/input[@type='checkbox']"));
		        TermsAndConditionsCheckBox.click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()=' Start Subscription ']")).click();
		        
		        Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698",Keys.ENTER);
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[.='Pay Now']"));
		        
		        Thread.sleep(2000);
		        
				WebElement PayNowBtn = driver.findElement(By.xpath("//button[.='Pay Now']"));
				
				if (PayNowBtn.isDisplayed()) 
				{
					wUtil.takeScreenShot(driver, "clickingOnPayNowBtnWithOutSelectingPaymentMode32Test");
				}
				else  
				{
	                System.out.println("Scheme Created Successfully");
				}
				
				try 
				{
					Thread.sleep(2000);
				} 
				finally 
				{
				//	driver.quit();
				}
			}
	        
	        

		}
		
		
		
		
        
		
}

		
