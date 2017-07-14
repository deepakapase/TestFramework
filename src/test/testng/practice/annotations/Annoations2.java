package test.testng.practice.annotations;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
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
	
	@Test(alwaysRun=true)
	@Parameters({"userId"})
	public void sampleTest(String uId){
		System.out.println("test user id  : " +uId);
	}
}
