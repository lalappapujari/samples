package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillararaylogin {

	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstb;
	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP']) [2]")
	private WebElement demoapp;
	
	
	@FindBy(name="q")
			private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobutton;
	
	
	public Skillararaylogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gearstb.click();
	}
	
	public void demoskillraryapp() {
		demoapp.click();
	}
	
	public void Serachtextbox(String course) {
		searchtb.sendKeys(course);
	}
	
	public void Clicknonsearch() {
		gobutton.click();
	}
	
}


