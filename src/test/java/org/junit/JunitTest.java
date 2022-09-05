package org.junit;

public class JunitTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");

	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");

	}
	@Before
	public void before() {
		System.out.println("Before");

	}
	
	@After
	public void after() {
		System.out.println("After");

	}
	@Test
	public void test1() {
		System.out.println("Junit Test 1");
		

	}
	@Test
	public void test4() {
		System.out.println("Junit Test 4");
		

	}
	@Test
	public void test3() {
		System.out.println("Junit Test 3");
		

	}
	

}
