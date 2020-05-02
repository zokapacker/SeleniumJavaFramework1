package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = {"test2"}, priority = 1)
	public void test1() {
		
		System.out.println("I am inside in test 1");
	}
	
	@Test(priority = 2)
	public void test2() {
		
		System.out.println("I am inside in test 2");
	}
	
	@Test(priority = 2)
	public void test3() {
		
		System.out.println("I am inside in test 3");
	}
	
	//ako je podeseno dependency i priority, prvenstvo ima dependency
	//mogu se testovi grupisati pa u zavisnosti od grupa se izvrsavaju, ima u klipu br. 25


}
