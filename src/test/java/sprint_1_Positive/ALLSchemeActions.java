package sprint_1_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import objectRepository.DashboardPage;
import objectRepository.Scheme_SchemeList_DescriptionPage;
import objectRepository.SchemesPage;
import objectRepository.Schemes_SchemeListPage;
import objectRepository.Schemes_SchemeList_AddSchemePage;

public class ALLSchemeActions extends FMS_BaseClass{

	@Test
	public void CreateScheme() throws Exception
	{
		JavaUtility jUtil = new JavaUtility();
		
		String SchemeTitle = "Abc"+jUtil.getRandomNum();
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
		ssaPage.createScheme(SchemeTitle, SchemeDescription);
		
		Thread.sleep(3000);
		
		WebElement AllEle = driver.findElement(By.xpath("//div[@class='table-responsive']"));
		String Element = AllEle.getText();
		
		if(Element.contains(SchemeTitle))
		{
			System.out.println("Passed");
			
		}
		else 
		{
			System.out.println("Failed");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[.='"+SchemeTitle+"']/..//button[.=' View ']")).click();
		
		Scheme_SchemeList_DescriptionPage ssdPage = new Scheme_SchemeList_DescriptionPage(driver);
		ssdPage.getUnderstandBtn().click();
		

	}
	
}
