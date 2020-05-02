package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	
	@Test
	@Ignore // moze i ispred @Test, a ako hocemo celu klasu da ignorisemo ispred klase se stavlja anotacija
	public void test1() {
		
		System.out.println("I am inside in test 1");
		
	}
	@Test
	public void test2() {
		
		System.out.println("I am inside in test 2");
		
	}

}
