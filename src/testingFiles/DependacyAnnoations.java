package testingFiles;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependacyAnnoations {

	@Test
	@Parameters("userId")
	public void OpeningBrowser(String uId) {
		System.out.println("Executing opening browser for user id "+uId);
	}

	@Test(dependsOnMethods={"OpeningBrowser"},alwaysRun=true)
	public void FlightBooking() {
		System.out.println("Flight booking");
	}
	@Test(dependsOnMethods={"FlightBooking"},enabled=true)
	public void payment(){
		System.out.println("Payment");
	}
	@Test(timeOut=2000)
	public void timerelated(){
		System.out.println("Timeout testcase");
	}

}
