package AssertionExamples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionProcedureJUnit {

	//execute only once, in the starting
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	
	//execute only once, in the end
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	
	//execute at each time in the starting
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	@After
	public void after() {
		System.out.println("in after");
	}
	
	@Test
	public void testCase1() {
		System.out.println("in testCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("in testCase2");
	}
}
