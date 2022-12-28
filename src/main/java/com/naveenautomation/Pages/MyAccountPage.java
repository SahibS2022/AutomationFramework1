package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement myAccountText;

	@FindBy(css = "#column-right a:nth-of-type(3)")
	WebElement changePasswordLink;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editAccountInfoLink;

	@FindBy(xpath = "//a[text()='Subscribe / unsubscribe to newsletter']")
	WebElement subscribeOrUnsubscribeToNewsletterLink;

	@FindBy(css = "aside#column-right a:last-of-type")
	WebElement logoutLink;

	@FindBy(css = "div.alert-success")
	WebElement passwordChangesSuccessBanner;

	@FindBy(css = "div.alert-success")
	WebElement telephoneChangesSuccessBanner;

	@FindBy(css = "div.alert-success")
	WebElement newsletterSubscriptionSuccessBanner;

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public String getTelephoneChangesSuccessMessage() {
		return telephoneChangesSuccessBanner.getText();
	}

	public String getNewsletterSubscriptionSuccessMessage() {
		return newsletterSubscriptionSuccessBanner.getText();
	}

	public MyAccountInformationPage clickEditYourAccountInfoLink() {
		editAccountInfoLink.click();
		return new MyAccountInformationPage();
	}

	public NewsletterSubscriptionPage clickSubscribeOrUnsubscribeNewsletterLink() {
		subscribeOrUnsubscribeToNewsletterLink.click();
		return new NewsletterSubscriptionPage();
	}

	public AccountLogoutPage clickLogoutLink() {
		logoutLink.click();
		return new AccountLogoutPage();
	}
}
