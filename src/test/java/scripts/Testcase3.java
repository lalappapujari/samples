package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SeleniumPage;
import pomPages.Skillararaylogin;
import pomPages.Wishlist;

public class Testcase3 extends StepGroup {
       @Test
	public void tc3( ) throws IOException, InterruptedException {
		Skillararaylogin s= new Skillararaylogin(driver);
		s.Serachtextbox(pdata.getPropertydata("coursename"));
		s.Clicknonsearch();
	  SeleniumPage st=  new SeleniumPage(driver);
	  st.corejavaselenium(driver);
		Wishlist w= new Wishlist(driver);
		driverutilities.switchframe(driver);
		w.playbtn();
		Thread.sleep(3000);
		w.pausebtn();
		driverutilities.switchbackframe(driver);
		w.wishlist();

			}
}
