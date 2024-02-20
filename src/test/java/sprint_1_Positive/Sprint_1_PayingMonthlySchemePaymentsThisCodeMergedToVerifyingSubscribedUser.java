package sprint_1_Positive;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.SchemesPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class Sprint_1_PayingMonthlySchemePaymentsThisCodeMergedToVerifyingSubscribedUser extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	
	@Test(groups = "sprint-1")
	public void payMonthlyPayment() throws Exception
	{
		Thread.sleep(2000);
		
		DashboardPage dPage = new DashboardPage(driver);
		wUtil.waitForElementToBeClickable(driver, dPage.getSchemesDrpDwn());
		dPage.getSchemesDrpDwn().click();
	    
		Thread.sleep(3000);
		
		SchemesPage sPage = new SchemesPage(driver);
		sPage.getSchemeUsersLnk().click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Pavani");
		
		Thread.sleep(2000);
		
		WebElement Info = driver.findElement(By.xpath("(//h4[.='Scheme Users']/ancestor::div//th[.='Action']/ancestor::table//button[.=' Info '])[1]"));
		wUtil.waitForElementToBeClickable(driver, Info);
		Info.click();
		
		Thread.sleep(2000);
		
		wUtil.scrollPageDown();
		
		driver.findElement(By.xpath("//button[.=' View more ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h4[.='Scheme Installments of Pavani']/ancestor::div/following-sibling::div//th[.='Actions']/ancestor::table//button[.=' Pay '])[1]")).click();
	    
		Thread.sleep(2000);
		
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		
		driver.switchTo().frame(Frame);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("6309631698");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Proceed']")).click();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Netbanking']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='ICICI']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Pay Now']")).click();
		
		Thread.sleep(2000);
		
        String ParentWin = driver.getWindowHandle();
		
		Set<String> ChildWins = driver.getWindowHandles();
		
		for(String ChildWin : ChildWins)
		{
			if(!ChildWin.equals(ParentWin))
			{
			    driver.switchTo().window(ChildWin);
			    driver.findElement(By.xpath("//button[.='Success']")).click();
			}
		}
		Thread.sleep(2000);
		
		driver.switchTo().window(ParentWin);
        
		wUtil.waitUntilAlertIsPresent(driver);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
