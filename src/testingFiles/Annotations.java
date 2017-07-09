package testingFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeMethod
	public void USerIdGeneration(){
		System.out.println("this block executes before each method");
	}
	@AfterMethod
	public void ReportTrading(){
		System.out.println("this block executes after each method");
	}
	@BeforeTest
	public void Cookies() {
		System.out.println("Delete cookis before running test");
	}
	@AfterTest
	public void Cookiesclose() {
		System.out.println("Delete cookis before running test");
	}
	@Test
	public void OpeningBrowser() {
		System.out.println("Executing opening browser");
	}

	@Test
	public void FlightBooking() {
		System.out.println("Flight booking");
	}
	
}
