package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.Skillararaylogin;
import pomPages.SkillraryDemoLogin;

public class Test1  extends StepGroup {
	
	@Test
	
public void tc1() {
		Skillararaylogin l = new Skillararaylogin(driver);
		l.gearsButton();
		l.demoskillraryapp();
		
		SkillraryDemoLogin sd =new SkillraryDemoLogin(driver);
		driverutilities .switchTabs(driver);
		driverutilities.mousHover(driver,sd.getCourstb());
		sd.seleniumtraining();
		
		
		Addtocart ad = new Addtocart(driver);
		driverutilities.doubleclick(driver,ad.getAddtocart());
		//driverutilities.alaertpopup(driver);
	}
	
	
	
	
	
	
}
