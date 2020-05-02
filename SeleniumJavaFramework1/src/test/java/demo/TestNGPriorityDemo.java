package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority = 1)
	public void test1() {
		System.out.println("I am inside test 1");
		
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	@Test(priority = 0) 
	public void test3() {
		System.out.println("I am inside test 3");
	}
	 //moze i u minus, sto manji broj on krece prvi, ako je isti prioritet onda abecednim redom
	//ako neki testovi nemaju podesen prioritet a neki imaju onda prvo pokrece one koji nemaju podesen prioritet

}
