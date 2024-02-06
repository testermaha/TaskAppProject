package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.CreateAccount_page;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_CreateAnAccount extends BaseClass{
	@Test
	public void CreateNewAccount()  {
		HomePage hp=new HomePage(driver);
		CreateAccount_page ca=new CreateAccount_page(driver);
		logger.debug("Application logs");
		logger.info("clicking on create an accouut");
		hp.click_Createaccnt();
		ca.Firstname("MahaLakshmi");
		ca.Lastname("Tadiboyina");
		ca.Email("mahatadiboyina83438@gmail.com");
		ca.Password("@lakshmi24");
		ca.ConfirmPassword("@lakshmi24");
		ca.createaccnt();		
	//Assert.assertTrue(false);
	}
	
}
