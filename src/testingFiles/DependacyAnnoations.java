package testingFiles;

import org.testng.annotations.Test;

public class DependacyAnnoations {

	@Test
	public void OpeningBrowser() {
		System.out.println("Executing opening browser");
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
