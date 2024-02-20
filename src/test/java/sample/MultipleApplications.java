package sample;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleApplications {

		@Test(priority = 0)
		public void schemeSubscription() throws Exception
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
			
			driver.findElement(By.xpath("//h6[.='Add Scheme']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Scheme Name']")).sendKeys("Festivalll Scheme");
			
			Thread.sleep(3000);
			
			WebElement country = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='country']"));
			
			Select s = new Select(country);
			s.selectByValue("Cuba");
			
			Thread.sleep(3000);
			
			WebElement calculationType = driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//select[@formcontrolname='scheme_calculation_type']"));
			
			Select ss = new Select(calculationType);
			ss.selectByValue("MG");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']")).sendKeys("Best Scheme");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//h1[.='Add Scheme']/../following-sibling::div//input[@placeholder='Enter Description']/../../../following-sibling::div/button[.='Add']")).click();
			
			WebElement SchemesListPage = driver.findElement(By.xpath("//div[@class='table-responsive']"));
			String AllSchemesList = SchemesListPage.getText();
			
			
			if(AllSchemesList.contains("Festivalll Scheme"))
			{
				System.out.println("SchemesListPage contains Festivalll Scheme");
			}
			else
			{
				System.out.println("SchemesListPage does not contains Festivallll Scheme");
			}
			
			driver.quit();
			
			Thread.sleep(3000);
			
			WebDriverManager.chromedriver().setup();
		    WebDriver driver1 = new ChromeDriver();
		    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver1.manage().window().maximize();
		    driver1.get("https://www.flipkart.com/");
		    
		    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		    
		    WebElement ElectronicsEle = driver1.findElement(By.xpath("//span[.='Electronics']"));
		    Actions act = new Actions(driver1);
		    act.moveToElement(ElectronicsEle).perform();
		    
		    List<WebElement> electronics = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    
		    for(WebElement ele : electronics)
		    {
		    	System.out.println("\n"+"\n"+"Electronics");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement tvAppliances = driver1.findElement(By.xpath("//span[.='TVs & Appliances']"));
		    act.moveToElement(tvAppliances).perform();
		    
		    List<WebElement> tvApplications = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : tvApplications)
		    {
		    	System.out.println("\n"+"\n"+"TV Applications");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement menEle = driver1.findElement(By.xpath("//span[.='Men']"));
		    act.moveToElement(menEle).perform();
		    
		    List<WebElement> men = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : men)
		    {
		    	System.out.println("\n"+"\n"+"Men");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement womenEle = driver1.findElement(By.xpath("//span[.='Women']"));
		    act.moveToElement(womenEle).perform();
		    
		    List<WebElement> women = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : women)
		    {
		    	System.out.println("\n"+"\n"+"Women");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement babyKidsEle = driver1.findElement(By.xpath("//span[.='Baby & Kids']"));
		    act.moveToElement(babyKidsEle).perform();
		    
		    List<WebElement> babyKids = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : babyKids)
		    {
		    	System.out.println("\n"+"\n"+"Baby & Kids");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement homeFurnitureEle = driver1.findElement(By.xpath("//span[.='Home & Furniture']"));
		    act.moveToElement(homeFurnitureEle).perform();
		    
		    List<WebElement> homeFurniture = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : homeFurniture)
		    {
		    	System.out.println("\n"+"\n"+"Home & Furniture");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    
		    WebElement sportsBooksMoreEle = driver1.findElement(By.xpath("//span[.='Sports, Books & More']"));
		    act.moveToElement(sportsBooksMoreEle).perform();
		    
		    List<WebElement> sportsBooksMore = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    
		    for(WebElement ele : sportsBooksMore)
		    {
		    	System.out.println("\n"+"\n"+"Sports Books & More");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    WebElement flightsEle = driver1.findElement(By.xpath("//a[.='Flights']"));
		    act.moveToElement(flightsEle).perform();
		    
		    List<WebElement> flights = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : flights)
		    {
		    	System.out.println("\n"+"\n"+"Flights");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
		    
		    
		    
		    WebElement offerZoneEle = driver1.findElement(By.xpath("//a[.='Offer Zone']"));
		    act.moveToElement(offerZoneEle).perform();
		    
		    List<WebElement> offerZone = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
		    			    
		    for(WebElement ele : offerZone)
		    {
		    	System.out.println("\n"+"\n"+"Offer Zone");
		    	System.out.println("\n"+"\n"+"\n"+ele.getText());
		    }
		    
		    Thread.sleep(3000);
		    
		    
		    
	}
		
		
		
			@Test(priority = 1)
			public void flipKartelectronics()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement Electronics = driver1.findElement(By.xpath("//span[.='Electronics']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(Electronics).perform();
			    
			    List<WebElement> electronics = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : electronics)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			@Test(priority = 2)
			public void flipkartTvApplications()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement tvAppliances = driver1.findElement(By.xpath("//span[.='TVs & Appliances']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(tvAppliances).perform();
			    
			    List<WebElement> tvApplications = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : tvApplications)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 3)
			public void flipkartMen()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement menEle = driver1.findElement(By.xpath("//span[.='Men']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(menEle).perform();
			    
			    List<WebElement> men = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : men)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			    
			}
			
			
			@Test(priority = 4)
			public void flipkartWomen()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement womenEle = driver1.findElement(By.xpath("//span[.='Women']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(womenEle).perform();
			    
			    List<WebElement> electronics = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : electronics)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 5)
			public void flipkartBabyKids()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement babyKidsEle = driver1.findElement(By.xpath("//span[.='Baby & Kids']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(babyKidsEle).perform();
			    
			    List<WebElement> babyKids = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : babyKids)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 6)
			public void flipkartHomeFurniture()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement homeFurnitureEle = driver1.findElement(By.xpath("//span[.='Home & Furniture']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(homeFurnitureEle).perform();
			    
			    List<WebElement> homeFurniture = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : homeFurniture)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 7)
			public void flipkartSportsBooksMore()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement sportsBooksMoreEle = driver1.findElement(By.xpath("//span[.='Sports, Books & More']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(sportsBooksMoreEle).perform();
			    
			    List<WebElement> sportsBooksMore = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    for(WebElement ele : sportsBooksMore)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 8)
			public void flipkartFlights()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement flightsEle = driver1.findElement(By.xpath("//a[.='Flights']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(flightsEle).perform();
			    
			    List<WebElement> flights = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : flights)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
			
			
			@Test(priority = 9)
			public void offerZone()
			{
				WebDriverManager.chromedriver().setup();
			    WebDriver driver1 = new ChromeDriver();
			    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver1.manage().window().maximize();
			    driver1.get("https://www.flipkart.com/");
			    
			    driver1.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			    
			    WebElement offerZoneEle = driver1.findElement(By.xpath("//a[.='Offer Zone']"));
			    Actions act = new Actions(driver1);
			    act.moveToElement(offerZoneEle).perform();
			    
			    List<WebElement> offerZone = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    			    
			    for(WebElement ele : offerZone)
			    {
			    	System.out.println(ele.getText());
			    }
			    
			    driver1.quit();
			    
			}
	
			
			
			
			
		
}

/*
 
                List<WebElement> tvApplications = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> men = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> women = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> babyKids = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> homeFurniture = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> SportsBooksMore = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> flights = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
			    
			    List<WebElement> offerZone = driver1.findElements(By.xpath("//div[@class='_1QrT3s']"));
 
 */

