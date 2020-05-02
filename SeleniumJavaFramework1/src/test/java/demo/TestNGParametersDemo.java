package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParametersDemo { //.xml je pod brojem testng6.xml
	
	@Test
	@Parameters({"MyName"}) // moze i vise parametara, bitne su viticaste zagrade
	public void test(@Optional("zoka") String name) {
		//test moze proci i bez parametara u xml fajlu ako je oznacen kao @optional
		
		System.out.println("Name is: "+name);
		
	}

}
