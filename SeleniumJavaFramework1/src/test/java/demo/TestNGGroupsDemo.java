package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"}) // svi testovi ispod pripadaju i ovoj klasi
public class TestNGGroupsDemo {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test(groups = {"sanity", "smoke"}) /* moze se staviti i npr "windows.regression" i 
	u xml fajlu pozvati recimo "windows.*" i onda se pozivaju sve grupe koje pocinju sa "windows" */
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void test3() {
		System.out.println("This is test 3");
		/* npr , ako je exclude regression u .xml fajlu(moze se odatle pokretati), 
		a include sanity ipak ce se izvrsiti ovaj test. primer pod "run" tagom */
		/* u xml fajlu moze se napraviti metagroup pod tagom "define", primer je tamo*/
	}
	
	@Test
	public void test4() {
		System.out.println("This is test 4");
	}
}
