package pages;

import org.openqa.selenium.Beta;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SelcukQualityDemiPage {

    public SelcukQualityDemiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement qaLoginLinki;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement qaEmail;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement qaLoginPassword;

    @FindBy (xpath = "(//*[@type='submit'])[2]")
    public WebElement qaLoginTikla;

    @FindBy(xpath = "(//*[text()='My courses'])[1]")
    public WebElement qaGirisKontol;


}
