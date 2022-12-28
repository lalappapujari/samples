package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Skillararaylogin;
import pomPages.SkillraryDemoLogin;
import pomPages.Testing;

public class Testcase2 extends StepGroup {

	
	@Test
	public void tc2( ) throws IOException, InterruptedException {
		Skillararaylogin s = new Skillararaylogin(driver);
		s.gearsButton();
		s.demoskillraryapp();
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		
		
		Testing t= new Testing(driver);
		//driverutilities.draganddrop(driver,t.getSelenium(),t.getCart());
	Thread.sleep(6000);
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollbar(driver, x, y);
		t.Facebookicon();
		
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
