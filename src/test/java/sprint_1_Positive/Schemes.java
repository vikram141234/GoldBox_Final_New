package sprint_1_Positive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.MyProfilePage;
import objectRepository.Scheme_SchemeList_DescriptionPage;
import objectRepository.Scheme_SchemesList_ManageTenuresPage;
import objectRepository.SchemesPage;
import objectRepository.Schemes_SchemeListPage;
import objectRepository.Schemes_SchemeList_AddSchemePage;

public class Schemes extends FMS_BaseClass {

	@Test
	public void CreateScheme() throws Exception
	{
		JavaUtility jUtil = new JavaUtility();
		
		String SchemeName = "Abc"+jUtil.getRandomNum();
		String SchemeDescription = "Xyz"+jUtil.getRandomNum();
		
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getSchemesDrpDwn().click();
	    
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemesListLnk().click();
		
		Thread.sleep(3000);
		
		Schemes_SchemeListPage sslPage = new Schemes_SchemeListPage(driver);
		sslPage.getAddSchemeBtn().click();
		
		Thread.sleep(3000);
		
		Schemes_SchemeList_AddSchemePage ssaPage = new Schemes_SchemeList_AddSchemePage(driver);
		ssaPage.createScheme(SchemeName, SchemeDescription);
		
		

	}
	
	
	
	@Test
	public void viewSchemeDescription() throws Exception
	{
		String SchemeTitle = "Abc2665193";
		String SchemeType = "JEWLLERY PLAN";
					
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getSchemesDrpDwn().click();
		
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemesListLnk().click();
		
		Thread.sleep(3000);
		
		//td[.='"+SchemeTitle+"']/following-sibling::td[.='"+SchemeType+"']/following-sibling::td/button[.=' View ']
		driver.findElement(By.xpath("//td[.='"+SchemeTitle+"']/..//button[.=' View ']")).click();
		
		Thread.sleep(2000);
		
		Scheme_SchemeList_DescriptionPage ssdPage = new Scheme_SchemeList_DescriptionPage(driver);
		ssdPage.getUnderstandBtn().click();
	}
	
	
	
	@Test
	public void addingSchemeTenure() throws Exception
	{
		JavaUtility jUtil = new JavaUtility();
		int Months = jUtil.getSingleRandomnumber();
		
		String SchemeTitle = "Abc2665193";
		String SchemeType = "JEWLLERY PLAN";
		
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getSchemesDrpDwn().click();
		
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemesListLnk().click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//td[.='"+SchemeTitle+"']/..//button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]")).click();
		
		Thread.sleep(2000);   // (//td[.='"+SchemeTitle+"']/following-sibling::td[.='"+SchemeType+"']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]
		
		Scheme_SchemesList_ManageTenuresPage ssmPage = new Scheme_SchemesList_ManageTenuresPage(driver);
		ssmPage.getTenureMonthsEdt().sendKeys("5");
		
        Thread.sleep(2000);
        
        ssmPage.getAddBtn().click();
        
		Thread.sleep(2000);
		
		ssmPage.getCloseBtn().click();
        
		
	}
	
	
	 @Test
	 public void viewSchemeTenureInfoPage() throws Exception
		{
		    
		    String SchemeTitle = "Abc2665193";
			String SchemeType = "JEWLLERY PLAN";
			
			DashboardPage dPage = new DashboardPage(driver);
			dPage.getSchemesDrpDwn().click();
			
			Thread.sleep(3000);
			
			SchemesPage sPage = new SchemesPage(driver);
			sPage.getSchemesListLnk().click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//td[.='"+SchemeTitle+"']/following-sibling::td[.='"+SchemeType+"']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]")).click();
			
			
			
		}
	
	
	// This is for Enabling/Disabling first SCHEME
	@Test
	public void schemeEnablilngDisabling() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("soumyaa@gmail.com" , Keys.TAB , "goldsikka@2023" , Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Schemes']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/schemes/list']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='mat-mdc-slide-toggle-1-button']")).click();
		
		
		
	}
	
	
	// This is for Enabling/Disabling SCHEME based on SCHEME NAME
		@Test
		public void schemeEnablilngDisablingByItsName() throws Exception
		{
			String SchemeTitle = "Festival Scheme";
			String SchemeType = "MY GOLD";
			
			String SchemeTitle1 = "MY GOLD PLAN";
			String SchemeType1 = "JEWLLERY PLAN";
			
			String SchemeTitle2 = "GOLD PLUS PLAN";
			String SchemeType2 = "JEWLLERY PLAN";
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("soumyaa@gmail.com" , Keys.TAB , "goldsikka@2023" , Keys.ENTER);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[.='Schemes']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@href='/schemes/list']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//td[.='"+SchemeTitle+"']/following-sibling::td[.='"+SchemeType+"']/..//div[@class='mdc-switch__icons']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//td[.='"+SchemeTitle1+"']/following-sibling::td[.='"+SchemeType1+"']/..//div[@class='mdc-switch__icons']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//td[.='"+SchemeTitle2+"']/following-sibling::td[.='"+SchemeType2+"']/..//div[@class='mdc-switch__icons']")).click();
			
				
		}		
		
		
		
		
	
	
	
}



//ENABLE = mdc-switch__icon mdc-switch__icon--on
//DISABLE = mdc-switch__icon mdc-switch__icon--off
//VIEW = //td[.='Festival Scheme']/following-sibling::td[.='MY GOLD']/following-sibling::td/button[.=' View ']
//DESCRIPTION INFO = (//td[.='Festival Scheme']/following-sibling::td[.='MY GOLD']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]
//MANAGE TENURES PAGE CLOSE BUTTON = //div[.='Manage Tenures']/button[@aria-label='Close']
//AMOUNT INFO = ((//td[.='Festival Scheme']/following-sibling::td[.='MY GOLD']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' Info '])[1]
//ACTION INFO = ((//td[.='Festival Scheme']/following-sibling::td[.='MY GOLD']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' Info ']
//ACTION EDIT = ((//td[.='Festival Scheme']/following-sibling::td[.='MY GOLD']/following-sibling::td/button[.=' View ']/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' Edit ']