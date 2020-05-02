package listeners;


import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class) // ova anotacija se moze ukloniti ako se u xml fajl doda listeners i navede ova klasa
public class TestNgListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am inside test 4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside test 5");
		//Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("I am inside test 6");
		throw new SkipException("This test is skipped");
	}

}
