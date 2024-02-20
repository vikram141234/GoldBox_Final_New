package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_SubCategoryPage {

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addsubcat']")private WebElement AddSubCategoryBtn;
    
    @FindBy(xpath="//td[.='bangle']/following-sibling::td[.='Rose Gold Bangle']/../td/button[.=' Edit ']")private WebElement ActionEditBtn;
    
    @FindBy(xpath="//td[.='bangle']/following-sibling::td[.='Rose Gold Bangle']/../td/button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_SubCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Rule-4:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddSubCategoryBtn() {
		return AddSubCategoryBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}


	public WebElement getActionEnableDisableBootStrapBtn() {
		return ActionEnableDisableBootStrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	//Create Business Library
	
}
