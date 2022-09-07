package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.test.AmazonSearch;
import org.test.BaseClass;
import org.test.LoginPage;

public class JunitTest extends BaseClass {

	public JunitTest() {
		PageFactory.initElements(driver, this);
	}

	@BeforeClass
	public static void beforeClass() {
		chromeLaunch();

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

	@Before
	public void before() {
		Date d = new Date();

		System.out.println("Date Before " + d);
		;
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println("Daye After  " + d);

	}
// FaceBook Login
	@Test
	public void test1() {

		urlLaunch("https://www.facebook.com/");
		implicitWait(10);

		LoginPage l = new LoginPage();
		l.getUsrnname().sendKeys("DeepakSharma");
		l.getPassword().sendKeys("Notcorrectone");
		l.getLoginbtn().click();

	}
// Amazon search
	@Test
	public void test4() {
		urlLaunch("https://www.amazon.ca/");
		implicitWait(10);
		driver.manage().window().maximize();
		
		

	}

	@Test
	public void test3() {
		urlLaunch("https://www.snapdeal.com/");
		implicitWait(10);
		driver.manage().window().maximize();
	}

}
