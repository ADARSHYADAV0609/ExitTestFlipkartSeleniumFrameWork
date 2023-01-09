package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocery {
	WebDriver driver;

	public Grocery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")
	WebElement GROCERY;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/input")
	WebElement PIN;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div/button")
	WebElement CURRENT_lOCATION;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement SEARCHBOX;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[2]/form/div/button")
	WebElement SEARCHBTN;

	@FindBy(xpath ="//img[@alt='INDIA GATE Tibar Basmati Rice']")
	WebElement SELECT_ITEM;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")
	WebElement ADD_TO_BASKET;

	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww undefined _27Cjkl\"]")
	WebElement GOTO_BASKET;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3ajIkB _3AWRsL']")
	WebElement PLACE_ORDER;

	public String GrocerySection() {
		return GROCERY.getText();
	}

	public void ClickGrocery() {
		GROCERY.click();
	}

	public void PinCode(String PINCODE) {
		PIN.sendKeys(PINCODE);
	}

	public void click_CurrentLocation() {
		CURRENT_lOCATION.click();
	}

	public void SearchProduct(String PRDCT) {
		SEARCHBOX.sendKeys(PRDCT);
		SEARCHBTN.click();
	}

	public void SelectItem() {
		SELECT_ITEM.click();
	}

	public void AddToBasket() {
		ADD_TO_BASKET.click();
	}

	public void GotoBasket() {
		GOTO_BASKET.click();
	}

	public void PlaceOrder() {
		PLACE_ORDER.click();
	}
}
