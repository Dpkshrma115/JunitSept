package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch extends BaseClass {
	
	
	public AmazonSearch() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="nav-bb-search")
	private WebElement searchbox();

}
