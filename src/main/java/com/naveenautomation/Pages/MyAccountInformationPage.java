package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountInformationPage extends TestBase {

	public MyAccountInformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='telephone']")
	WebElement telephone;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public MyAccountPage updateUserTelephone() {
		telephone.clear();
		telephone.sendKeys("5146217769");
		continueBtn.submit();
		return new MyAccountPage();
	}

}
