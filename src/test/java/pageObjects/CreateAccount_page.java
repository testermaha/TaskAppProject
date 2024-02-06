package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount_page  extends BasePage {
	public CreateAccount_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="firstname")
	WebElement txt_firstname;
	@FindBy(id="lastname")
	WebElement txt_lastname;
	@FindBy(id="email_address")
	WebElement text_email;
	@FindBy(id="password")
	WebElement txt_pwd;
	@FindBy(id="password-confirmation")
	WebElement txt_confirmpwd;
	
	@FindBy(xpath="//span[text()='Create an Account']")
	WebElement btn_Createaccnt;
	
	public void Firstname(String uname) {
		txt_firstname.sendKeys(uname);
	}
	public void Lastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	public void Email(String mailid) {
		text_email.sendKeys(mailid);
	}
	public void Password(String password) {
		txt_pwd.sendKeys(password);
	}
	public void ConfirmPassword(String cpassword) {
		txt_pwd.sendKeys(cpassword);
	}
	public void createaccnt() {
		btn_Createaccnt.click();
	}

}
