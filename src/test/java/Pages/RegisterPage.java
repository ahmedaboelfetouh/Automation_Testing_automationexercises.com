package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class RegisterPage {
    WebDriver driver;

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);

    private final By LoginSignUpButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    private final By Name = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    private final By Email = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private final By SignUp = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");

    private final By Gender = By.id("id_gender1");
    private final By Password = By.cssSelector("#password");
    private final By BirthDay = By.cssSelector("#days");
    private final By ChoosenDay = By.cssSelector("#days > option:nth-child(17)");
    private final By BirthMonth = By.cssSelector("#months");
    private final By ChoosenMonth = By.cssSelector("#months > option:nth-child(2)");
    private final By BirthYear = By.cssSelector("#years");
    private final By ChoosenYear = By.cssSelector("#years > option:nth-child(24)");
    private final By Newsteller = By.cssSelector("#newsletter");

    private final By RecieveOffers = By.cssSelector("#optin");
    private final By FirstName = By.cssSelector("#first_name");
    private final By LastName = By.cssSelector("#last_name");
    private final By Company = By.cssSelector("#company");
    private final By Address = By.cssSelector("#address1");
    private final By Address2 = By.cssSelector("#address2");
    private final By Country = By.cssSelector("#country");
    private final By ChoosenCountry = By.cssSelector("#country > option:nth-child(2)");
    private final By State = By.cssSelector("#state");
    private final By City = By.cssSelector("#city");
    private final By ZipCode = By.cssSelector("#zipcode");
    private final By MobileNumber = By.cssSelector("#mobile_number");
    private final By CreatAccountButton = By.cssSelector("#form > div > div > div > div.login-form > form > button");
    private final By continueButton = By.cssSelector("#form > div > div > div > div > a");
    private final By deleteAccountButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void naviagteToURL(){
        driver.get("https://automationexercise.com/");
        logger.info("✅ navigate to URL");
    }
    public void enterLoginSignUpPage(){
        driver.findElement(LoginSignUpButton).click();
        logger.info("✅ enter login/sign up page");
    }

    public void setName(String name){
        driver.findElement(Name).sendKeys(name);
        logger.info("✅ set name");
    }

    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
        logger.info("✅ set email");
    }

    public void enterSignUpPage(){
        driver.findElement(SignUp).click();
        logger.info("✅ click on Sign Up button");
    }

    public void setGender(){
        driver.findElement(Gender).click();
        logger.info("✅ set gender");

    }

    public void setPassword(){
       driver.findElement(Password).sendKeys("WWEppp10");
        logger.info("✅ set password");
    }

    public void setBirthDay(){
        driver.findElement(BirthDay).click();
        driver.findElement(ChoosenDay).click();
        logger.info("✅ set birth day");
    }

    public void setBirthMonth(){
        driver.findElement(BirthMonth).click();
        driver.findElement(ChoosenMonth).click();
        logger.info("✅ set birth month");
    }

    public void setBirthYear(){
        driver.findElement(BirthYear).click();
        driver.findElement(ChoosenYear).click();
        logger.info("✅ set birth month");
    }

    public void setNewsteller(){
        driver.findElement(Newsteller).click();
        logger.info("✅ set newsteller");
    }

    public void setSpecialOffers(){
        driver.findElement(RecieveOffers).click();
        logger.info("✅ set special offers");
    }

    public void setFirstName(){
        driver.findElement(FirstName).sendKeys("Ali");
        logger.info("✅ set first name");
    }

    public void setLastName(){
        driver.findElement(LastName).sendKeys("Moahmed");
        logger.info("✅ set last name");
    }

    public void setCompany(){
        driver.findElement(Company).sendKeys("oppo");
        logger.info("✅ set company");
    }

    public void setAddress(){
        driver.findElement(Address).sendKeys("25 - sonny street");
        logger.info("✅ set address");
    }

    public void setAddress2(){
        driver.findElement(Address2).sendKeys("27 - aroo street");
        logger.info("✅ set address2");
    }

    public void setCountry(){
        driver.findElement(Country).click();
        driver.findElement(ChoosenCountry).click();
        logger.info("✅ set country");
    }

    public void setState(){
        driver.findElement(State).sendKeys("California");
        logger.info("✅ set state");
    }

    public void setCity(){
        driver.findElement(City).sendKeys("California");
        logger.info("✅ set city");
    }

    public void setZipCode(){
        driver.findElement(ZipCode).sendKeys("90");
        logger.info("✅ set zip code");
    }

    public void setMobileNumber(){
        driver.findElement(MobileNumber).sendKeys("+11516329");
        logger.info("✅ set method number");
    }

    public void createAccount(){
        driver.findElement(CreatAccountButton).click();
        logger.info("✅ click on create account button");
    }

    public void NewUserSignupVisibility(){
        Assert.assertEquals(driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > h2")).getText(), "New User Signup!");
        logger.info("✅ new user sign up! is visible");
    }

    public void HomePageVisibility(){
        try{
            driver.get("https://automationexercise.com/");
            logger.info("✅ Home Page is Visible");
        }
        catch(Exception e){
            logger.fatal("❌ Error in HomePageVisibilityTest");
        }
    }

    public void verifyEnterAccountInfoVisibility(){
        Assert.assertEquals(driver.findElement(By.cssSelector("#form > div > div > div > div.login-form > h2 > b")).getText(), "ENTER ACCOUNT INFORMATION");
        logger.info("✅ Enter account info is visible");
    }

    public void accountCreatedVisibility(){
        Assert.assertEquals(driver.findElement(By.cssSelector("#form > div > div > div > h2 > b")).getText(), "ACCOUNT CREATED!");
        logger.info("✅ account created is visible");
    }

    public void clickContinue(){
        driver.findElement(continueButton).click();
        logger.info("✅ click continue button");
    }

    public void loggedInAsVisibility(){
        Assert.assertEquals(driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a")).getText(), "Logged in as Ahmed");
        logger.info("✅ logged in is visible");
    }

    public void clickDeleteAccount(){
        driver.findElement(deleteAccountButton).click();
        logger.info("✅ click on delete account");
    }

    public void accountDeletedVisibility(){
        Assert.assertEquals(driver.findElement(By.cssSelector("#form > div > div > div > h2 > b")).getText(), "ACCOUNT DELETED!");
        logger.info("✅ account deleted is visible");
    }

    public void TestCase1(String name,String email){
        naviagteToURL();
        HomePageVisibility();
        enterLoginSignUpPage();
        NewUserSignupVisibility();
        setName(name);
        setEmail(email);
        enterSignUpPage();
        verifyEnterAccountInfoVisibility();
        setGender();
        setPassword();
        setBirthDay();
        setBirthMonth();
        setBirthYear();
        setNewsteller();
        setSpecialOffers();

        setFirstName();
        setLastName();
        setCompany();
        setAddress();
        setAddress2();
        setCountry();
        setState();
        setCity();
        setZipCode();
        setMobileNumber();

        createAccount();

        accountCreatedVisibility();
        clickContinue();
        loggedInAsVisibility();
        clickDeleteAccount();
        accountDeletedVisibility();
        logger.info("✅✅✅✅ Test Passed ✅✅✅✅");
    }
}
