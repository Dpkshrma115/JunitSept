package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement usrnname;
	
	@FindBy (id= "pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	@FindBys({@FindBy(xpath="(//a[@role='button'])[2]") , @FindBy(xpath="//a[text()='Create new account']")})
     private WebElement createbtn;
     
	@FindBys ({@FindBy(id="u_a_b_LN"), @FindBy(name="firstname")})
	private WebElement firstName;
	
	@FindBys ({@FindBy(id="u_a_d_je"), @FindBy(name="lastname")})
	private WebElement lastName;
	
	@FindBys ({@FindBy(id="u_a_g_3v"), @FindBy(name="reg_email__")})
	private WebElement mobNum;
	
	@FindBys ({@FindBy(id="password_step_input"), @FindBy(name="reg_passwd__")})
	private WebElement newPassword;
	
	@FindBys ({@FindBy(id="month"), @FindBy(name="birthday_month")})
	private WebElement month;
	
	@FindBys ({@FindBy(id="day"), @FindBy(xpath="birthday_day")})
	private WebElement day;
	
	@FindBys ({@FindBy(id="year"), @FindBy(xpath="birthday_year")})
	private WebElement year;
	
	public WebElement getCreatebtn() {
		return createbtn;
	}

	public void setCreatebtn(WebElement createbtn) {
		this.createbtn = createbtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getMobNum() {
		return mobNum;
	}

	public void setMobNum(WebElement mobNum) {
		this.mobNum = mobNum;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(WebElement newPassword) {
		this.newPassword = newPassword;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getSexFemale() {
		return sexFemale;
	}

	public void setSexFemale(WebElement sexFemale) {
		this.sexFemale = sexFemale;
	}

	public WebElement getSexMale() {
		return sexMale;
	}

	public void setSexMale(WebElement sexMale) {
		this.sexMale = sexMale;
	}

	public WebElement getSexCustom() {
		return sexCustom;
	}

	public void setSexCustom(WebElement sexCustom) {
		this.sexCustom = sexCustom;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	public void setSignUpBtn(WebElement signUpBtn) {
		this.signUpBtn = signUpBtn;
	}
	@FindBys ({@FindBy(xpath="(//input[@class='_8esa'])[1]"), @FindBy(xpath="(//input[@type='radio'])[1]")})
	private WebElement sexFemale;
	
	@FindBys ({@FindBy(xpath="(//input[@class='_8esa'])[2]"), @FindBy(xpath="(//input[@type='radio'])[2]")})
	private WebElement sexMale;
	
	@FindBys ({@FindBy(xpath="(//input[@class='_8esa'])[1]"), @FindBy(name="(//input[@type='radio'])[3]")})
	private WebElement sexCustom;
	

			@FindBys ({@FindBy(xpath="	(//button[text()='Sign Up'])[1]"), @FindBy(id="u_a_s_5u")})
			private WebElement signUpBtn;
	
	
	public WebElement getUsrnname() {
		return usrnname;
	}

	public void setUsrnname(WebElement usrnname) {
		this.usrnname = usrnname;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
	

}



