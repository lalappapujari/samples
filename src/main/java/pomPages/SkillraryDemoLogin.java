package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {

	@FindBy(id="course")
		private WebElement courstb;
	
	
	@FindBy(xpath="//a[text()='Selenium Training']")
		private WebElement seleniumtraingtb;
	
	@FindBy(name = "addresstype")
	private WebElement coursedd;
	
	
	
	
	
	
	
	//initialization	
	public SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}
	public WebElement getCourstb() {
		return courstb;
	}
	
	public void seleniumtraining() {
		seleniumtraingtb.click();
	}
	public WebElement getCoursedd() {
		return coursedd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
