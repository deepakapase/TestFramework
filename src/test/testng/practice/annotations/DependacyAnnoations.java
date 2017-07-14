package test.testng.practice.annotations;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependacyAnnoations {

	@Test
	@Parameters("userId")
	public void openingBrowser(String uid) {
		System.out.println("Executing opening browser for userId: " + uid);
	}

	@Test(dependsOnMethods={"openingBrowser"},alwaysRun=true)
	public void flightBooking() {
		System.out.println("Flight booking");
	}
	@Test(dependsOnMethods={"flightBooking"},enabled=true)
	public void payment(){
		System.out.println("Payment");
	}
	@Test(timeOut=2000)
	public void timerelated(){
		System.out.println("Timeout testcase");
	}

}
