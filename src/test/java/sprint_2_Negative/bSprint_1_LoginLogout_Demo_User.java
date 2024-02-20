package sprint_2_Negative;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;

public class bSprint_1_LoginLogout_Demo_User {

WebDriverUtility wUtil = new WebDriverUtility();
	
	@Test
	public void loginWithoutByGiving10AlphabetsInMobileNumberTextFieldTest() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg.goldbox.gold/login");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		wUtil.takeScreenShot(driver, "loginWithoutByGiving10AlphabetsInMobileNumberIntegerFieldTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void loginWithoutByGivingMoreThan10NumbersInMobileNumberInTextFieldTest() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg.goldbox.gold/login");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("987654321987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "loginWithoutByGivingMoreThan10NumbersInMobileNumberIntegerFieldTest");
	}
	
	@Test
	public void loginWithoutByGivingLessThan10NumbersInMobileNumberTextFieldTest() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://stg.goldbox.gold/login");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "loginWithoutByGivingLessThan10NumbersInMobileNumberIntegerFieldTest");
	}
	
	
	
}
