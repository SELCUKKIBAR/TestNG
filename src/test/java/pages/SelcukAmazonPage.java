package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SelcukAmazonPage {

    public SelcukAmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement amazonAramaSonucuElementi;







}
