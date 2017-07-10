package testingFiles.copy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annoations2 {
	@BeforeSuite
	public void installSoftware(){
		System.out.println("Installation of software");
	}
	@AfterSuite
	public void deinstallSoftware(){
		System.out.println("De installation of software");
	}
	@Test
	public void sampleTest(){
		System.out.println("I am the test");
	}
	@Test(dataProvider="getData")
	public void FlightBooking(String userId,String userName,String password) {
		System.out.println("Flight booking");
		
		System.out.println(userId +" "+userName+" "+password);
		
	}
	
}
