package tcs.test;

import org.testng.annotations.DataProvider;

public class Testing2 {
	@DataProvider(name="LoginDatas")
	private Object[][] getdatas() {
	
		return  new Object[][] {
	
			{"username","password"},
			{"Mani5858","mani5858"},
			{"karthi@1","karthi@123"}};
	}
}