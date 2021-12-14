package musterCucumber.pages;

import musterCucumber.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MusterPO {

    public MusterPO() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "passport1")
    public WebElement passport1;

    @FindBy(id = "passport2")
    public WebElement passport2;

    @FindBy(id = "regitster")
    public WebElement registerButton;

    @FindBy(id = "succes")
    public WebElement succesMessage;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    public void userRegister(String type,String entry){

        switch (type){
            case "user":
                userName.sendKeys(entry);
                break;
            case "name":
                firstname.sendKeys(entry);
                break;
            case "lastname":
                lastname.sendKeys(entry);
                break;
            case "passport1":
                passport1.sendKeys(entry);
                break;
            case "passport2":
                passport2.sendKeys(entry);
        }
    }

    public void isUserRegistered(){
        boolean isSucces=succesMessage.isDisplayed();

        Assert.assertTrue("User was not registered!",isSucces);
    }
    public void clickRegister(){
        registerButton.click();
    }

}
