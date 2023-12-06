package practiceTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviders {

	@DataProvider(name = "airportTestData")
	public Object[][] getData() {
		return new Object[][] {
			{"depAirport", "columbus"},
			{"arrAirport", "chicago"}
		};
	}
	
	@Test(dataProvider = "airportTestData")
	public void method1(String  depAirport, String arrAirport) {
		System.out.println("depAirport : "  + depAirport);
		System.out.println("arrAirport : "  + arrAirport);

	}
	
}
