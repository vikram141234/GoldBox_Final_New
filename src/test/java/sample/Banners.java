package sample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import objectRepository.BannersPage;
import objectRepository.Banners_EcomBanners;
import objectRepository.Banners_EcomBanners_AddEcomBannersPage;
import objectRepository.Banners_MainBannersPage;
import objectRepository.Banners_MainBanners_AddMainBannersPage;
import objectRepository.Banners_MainBanners_UpdateBannerPage;
import objectRepository.Banners_SplashBannersPage;
import objectRepository.Banners_SplashBanners_AddSplashBannersPage;
import objectRepository.DashboardPage;

public class Banners extends FMS_BaseClass {

	@Test(priority = 1)
	public void addingMainBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage bmbPage = new Banners_MainBannersPage(driver);
		bmbPage.getAddMainBannersBtn().click();
		
		Banners_MainBanners_AddMainBannersPage bmabPage = new Banners_MainBanners_AddMainBannersPage(driver);
		bmabPage.addingMainBanner(driver);
		
        String SuccessMsg = driver.findElement(By.xpath("(//div[contains(.,' Main Banner Added Successfully ')])[3]")).getText();
		
        // Validation
        Thread.sleep(2000);
        
        System.out.println(SuccessMsg);
        
        // With Assertions
        
        Assert.assertEquals(SuccessMsg, "Main Banner Added Successfully");
        
        // With If Else Condition
        
//		if(SuccessMsg.contains("Main Banner Added Successfully"))
//		{
//			System.out.println("Main Banner Added Successfully");
//		}
//		else 
//		{
//			System.out.println("Main Banner Not Added");
//		}
		
	}
	
	
	
	@Test(priority = 2)
	public void viewMainBanner () throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getBannerImgViewBtn().click();
        
		
	}
	
	
	
	@Test(priority = 3)
	public void editMainBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEditBtn().click();
		
		Banners_MainBanners_UpdateBannerPage bmub = new Banners_MainBanners_UpdateBannerPage(driver);
	    bmub.updateMainBanner(driver);
		
		
	}
	
	
	@Test(priority = 4)
	public void enableMainBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEnableDisableBootstrapBtn().click();
	}
	
	
	
	@Test(priority = 5)
	public void enableOrDisableParticularMainBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.enableOrDisableParticularBanner(driver, 19, 30, 1);
	}
	
	
	@Test(priority = 6)
	public void addingSplashBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getSplashBannersLnk().click();
		
		Banners_SplashBannersPage bsPage = new Banners_SplashBannersPage(driver);
		bsPage.getAddSplashBannersBtn().click();
		
		Banners_SplashBanners_AddSplashBannersPage bsabPage = new Banners_SplashBanners_AddSplashBannersPage(driver);
		bsabPage.addingSplashBanner(driver);
		
		//For validation banner added successfully msg
		
		String SuccessMsg = driver.findElement(By.xpath("(//div[contains(.,' splash bannner added successfully ')])[3]")).getText();
		
		Thread.sleep(2000);
		
		System.out.println(SuccessMsg);
		
		// With Assertions
		
        Assert.assertEquals(SuccessMsg, "splash bannner added successfully");
		
        //With If Else Conditions
        
//		if(SuccessMsg.contains("splash bannner added successfully"))
//		{
//			System.out.println("Splash Banner Added Successfully");
//		}
//		else 
//		{
//			System.out.println("Splash Banner Not Added");
//		}
		
		
		
	}
	
	
	@Test(priority = 7)
	public void viewSplashBanner () throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getBannerImgViewBtn().click();
        
		
	}
	
	
	
	@Test(priority = 8)
	public void editSplashBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEditBtn().click();
		
		Banners_MainBanners_UpdateBannerPage bmub = new Banners_MainBanners_UpdateBannerPage(driver);
	    bmub.updateMainBanner(driver);
		
		
	}
	
	
	@Test(priority = 9)
	public void enableOrDesableFirstSplashBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEnableDisableBootstrapBtn().click();
	}
	
	
	
	@Test(priority = 10)
	public void enableOrDisableParticularSplashBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.enableOrDisableParticularBanner(driver, 19, 30, 1);
	}
	
	
	
	@Test(priority = 11)
	public void addingEcomBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getEcomBannersLnk().click();
		
		Banners_EcomBanners ebPage = new Banners_EcomBanners(driver);
		ebPage.getAddEcomBannersBtn().click();
		
		Banners_EcomBanners_AddEcomBannersPage beabPage = new Banners_EcomBanners_AddEcomBannersPage(driver);
		beabPage.addingEcomBanner(driver);
		
		//  Validation
		
        String SuccessMsg = driver.findElement(By.xpath("(//div[contains(.,' Ecommerce Banner Added Successfully ')])[3]")).getText();
		
        Thread.sleep(2000);
		
		System.out.println(SuccessMsg);
		
		
		
		// With Assertions
		
		Assert.assertEquals(SuccessMsg, "Ecommerce Banner Added Successfully");
        
		
		
		//With If Else
		
		
//		if(SuccessMsg.contains("Ecommerce Banner Added Successfully"))
//		{
//			System.out.println("Ecommerce Banner Added Successfully");
//		}
//		else 
//		{
//			System.out.println("Ecommerce Banner Not Added");
//		}
	}
	
	
	@Test(priority = 12)
	public void viewEcomBanner () throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getBannerImgViewBtn().click();
        
		
	}
	
	
	
	@Test(priority = 13)
	public void editEcomBanner() throws Exception
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEditBtn().click();
		
		Banners_MainBanners_UpdateBannerPage bmub = new Banners_MainBanners_UpdateBannerPage(driver);
	    bmub.updateMainBanner(driver);
		
		
	}
	
	
	@Test(priority = 14)
	public void enableOrDesableFirstEcomBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.getStatusEnableDisableBootstrapBtn().click();
	}
	
	
	
	@Test(priority = 15)
	public void enableOrDisableParticularEcomBanner()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getBannersDrpDwn().click();
		
		BannersPage bPage = new BannersPage(driver);
		bPage.getMainBannersLnk().click();
		
		Banners_MainBannersPage ebPage = new Banners_MainBannersPage(driver);
		ebPage.enableOrDisableParticularBanner(driver, 19, 30, 1);
	}
	
	
	
//	public void MainBannerUpdateMainBanner()
//	{
//		DashboardPage dbPage = new DashboardPage(driver);
//		dbPage.getBannersDrpDwn().click();
//		
//		BannersPage bPage = new BannersPage(driver);
//		bPage.getMainBannersLnk().click();
//		
//		
//	}
	
}
/*



*/