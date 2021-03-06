package test.testng.practice.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@DataProvider
	public Object[][] getData(){
		//in array
		// i - stands for number of time testcase should run
		//j- stands for number of parameters it should send in one go
		Object[][] data =new Object[2][3];
		data[0][0]="01";
		data[0][1]="ABC";
		data[0][2]="abc01";
		data[1][0]="02";
		data[1][1]="XYZ";
		data[1][2]="xyz02";
		return data;
	}
	@Test(dataProvider="getData")
	public void FlightBooking(String userId,String userName,String password) {
		System.out.println("Flight booking");
		System.out.println(userId +" "+userName+" "+password);		
	}
}
