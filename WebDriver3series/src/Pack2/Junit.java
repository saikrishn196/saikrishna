package Pack2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	
	@Before
	public void a1(){
		System.out.println("This is before class");
	}
	@After
	public void b1(){
		System.out.println("This is after class");
	}
	@Test
	public void c1(){
		System.out.println("This is test1");
	}
	@Test
	public void d1(){
		System.out.println("This is test2");
	}
	@Test
	public void e1(){
		System.out.println("This is test3");
	}
	
}
