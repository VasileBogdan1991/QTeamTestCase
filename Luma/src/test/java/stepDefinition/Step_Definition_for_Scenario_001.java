package stepDefinition;
import com.google.common.base.Verify;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static stepDefinition.DriverManager.getDriver;


public class Step_Definition_for_Scenario_001 {
    protected WebDriver driver;

    public Step_Definition_for_Scenario_001() {
        WebDriverManager.chromedriver().setup();
        driver = getDriver();
    }

// S size for Hero Hoodle
    WebElement sSizeForHeroHoodle = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-167'])[4]"));

// Green color for Hero Hoodle
    WebElement greenColorForHeroHoodle = driver.findElement(By.xpath("//div[@option-label='Green']"));

// Add to cart button from Hero Hoodle
    WebElement addToCartForHeroHoodle = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));

// Cart button
    WebElement cartButton = driver.findElement(By.xpath("//span[@class='counter-number']"));

// Proceed to checkout button
    WebElement proccedToCheckoutButton = driver.findElement(By.id ("top-cart-btn-checkout"));

// Email address field from Shipping Address
    WebElement emailAddressField = driver.findElement(By.xpath("(//input[@type='email'])[2]"));

// First name field from Shipping Address
    WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));

// Last name field from Shipping Address
    WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));

// Street address field from Shipping Address
    WebElement streetAddressField = driver.findElement(By.xpath("//input[@name='street[0]']"));

// City field from Shipping Address
    WebElement cityField = driver.findElement(By.xpath("//input[@name='city']"));

// State/province field from Shipping Address
    WebElement stateProvinceField = driver.findElement(By.xpath("//select[@name='region_id']"));

// Texas state/province from Shipping Address
    WebElement texas = driver.findElement(By.xpath("//option[@data-title='Texas']"));

// Zip/Postal Code from Shipping Address
    WebElement zipPostalCodeField = driver.findElement(By.xpath("//input[@name='postcode']"));

// Phone Number field from Shipping Address
    WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name='telephone']"));

// First radio button from Shipping Method
    WebElement firstShippingMethod = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

// Next button from Shipping Address
    WebElement nextButton = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));

// Check/uncheck the box from Payment Method
    WebElement checkUncheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

// Apply Discount Code from Payment Method
    WebElement applyDiscountCode = driver.findElement(By.cssSelector("#block-discount-heading"));

// Enter Discount Code field from Payment Method
    WebElement enterDiscountCodeField = driver.findElement(By.xpath("//input[@name='discount_code']"));

// Apply Discount button from Payment Method
    WebElement applyDiscountButton = driver.findElement(By.xpath("//button[@value='Apply Discount']"));

// Place order button from Payment Method
    WebElement orderButton = driver.findElement(By.xpath("//button[@class='action primary checkout']"));

// Item in Cart
    WebElement itemInCart = driver.findElement(By.xpath("//div[@class='title']"));

// Change Shipping Method from Payment Method
    WebElement changeShippingMethod = driver.findElement(By.xpath("//button[@data-bind='click: backToShippingMethod']"));

// Second radio button from Shipping Method
    WebElement secondShippingMethod = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));


    @Given("I navigate to url web page")
    public void navigateToUrl() {
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
    }

    @When("I select S size for Hero Hoodle")
    public void selectSSizeForHeroHoodle() {
        sSizeForHeroHoodle.click();
    }

    @And("I select the “green” color for “Hero Hoodle”")
    public void selectGreenColorForHeroHoodle() {
        greenColorForHeroHoodle.click();
    }

    @And("I press the “Add to Cart” button")
    public void addToCartForHeroHoodle() {

        Actions action = new Actions(driver);
        action.moveToElement(greenColorForHeroHoodle).perform();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", greenColorForHeroHoodle);

        addToCartForHeroHoodle.click();
    }

    @And("I verify if the product has been added in the cart")
    public void verifyIfTheProductHasBeenAddedIntoTheCart() {
        String actualMessage = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")).getText();
        System.out.println("actualMessage is: " + actualMessage);

        String expectedMessage = " You added Hero Hoodie to your shopping cart. ";
        System.out.println("expectedMessage is: " + expectedMessage);

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("I click the “Cart” button")
    public void clickCartButton() {
        cartButton.click();
    }

    @And("I click the “ProceedToCheckout” button")
    public void clickProccedToCheckoutButtonButton() {
        proccedToCheckoutButton.click();
    }

    @And ("I click Next button")
    public void clickNextButton() {
        nextButton.click();
    }

    @And ("I verify the message received about shipping method")
    public void verifyMessageReceivedAboutShippingMethod() {
        String actualMessageReceivedAboutShippingMethod = driver.findElement(By.xpath("//span[@data-bind='text: errorValidationMessage()']")).getText();
        System.out.println("actualMessageReceivedAboutShippingMethod is: " + actualMessageReceivedAboutShippingMethod);

        String expectedMessageReceivedAboutShippingMethod = "The shipping method is missing. Select the shipping method and try again.";
        System.out.println("expectedMessageReceivedAboutShippingMethod is: " + expectedMessageReceivedAboutShippingMethod);

        Assert.assertEquals(actualMessageReceivedAboutShippingMethod, expectedMessageReceivedAboutShippingMethod);
    }

    @And ("I select first shipping method")
    public void selectFirstShippingMethod() {
        firstShippingMethod.click();
    }

    @And ("I complete the <Email Address> field")
    public void completeEmailAddressField() {
        emailAddressField.sendKeys("bhurmuzache@deloittece.com");
    }

    @And ("I complete the <First Name> field")
    public void completeFirstNameField() {
        firstNameField.sendKeys("Bogdan");
    }

    @And ("I complete the <Last Name> field")
    public void completeLastNameField() {
        lastNameField.sendKeys("Hurmuzache");
    }

    @And ("I complete the <Street Address> field")
    public void completeStreetAddressField() {
        streetAddressField.sendKeys("Holt 13");
    }

    @And ("I complete the <City> field")
    public void completeCityField() {
        cityField.sendKeys("Iasi");
    }

    @And ("I select the <StateProvince>")
    public void selectStateProvince() {
        stateProvinceField.click();
        texas.click();
    }

    @And ("I complete the <ZipPostal Code> field")
    public void completeZipPostalCodeField() {
        zipPostalCodeField.sendKeys("600394");
    }

    @And ("I complete the <Phone Number> field")
    public void completePhoneNumberField() {
        phoneNumberField.sendKeys("0123456789");
    }

    @And ("I check the checkbox from My billing and shipping address are the same")
    public void checkBox() {
        checkUncheckBox.click();
        checkUncheckBox.click();
    }

    @And ("I click the Apply Discount Code text")
    public void clickApplyDiscountCode() {
        applyDiscountCode.click();
    }

    @And ("I complete the <Enter discount code> field")
    public void completeEnterDiscountCodeField() {
        enterDiscountCodeField.sendKeys("-10%");
    }

    @And ("I click the Apply Discount button")
    public void clickApplyDiscountButton() {
        applyDiscountButton.click();
    }

    @And ("I verify if the discount has been applied to the cart")
    public void verifyIfTheDiscountHasBeenAppliedToTheCart() {
        String actualMessageAfterDiscount = driver.findElement(By.xpath("//div[@class='message message-error error']")).getText();
        System.out.println("actualMessageAfterDiscount is: " + actualMessageAfterDiscount);

        String expectedMessageAfterDiscount = "The coupon code isn't valid. Verify the code and try again.";
        System.out.println("expectedMessage is: " + expectedMessageAfterDiscount);

        Assert.assertNotEquals(actualMessageAfterDiscount, expectedMessageAfterDiscount);
    }

    @And ("I check the shipping fee")
    public void checkShippingFee() {
        String actualShippingFee = driver.findElement(By.xpath("//span[@data-th='Shipping']")).getText();
        System.out.println("actualShippingFee is: " + actualShippingFee);

        String expectedShippingFee = "$0.00";
        System.out.println("expectedShippingFee is: " + expectedShippingFee);

        Assert.assertEquals(actualShippingFee, expectedShippingFee);
    }

    @And ("I check that one item is in the cart")
    public void checkItemsFromCart(){
        String actualItemsCart = itemInCart.getText();
        System.out.println("actualItemsCart is: " + actualItemsCart);

        String expectedItemsCart = "1 Item in Cart";
        System.out.println("expectedItemsCart is: " + expectedItemsCart);

        Assert.assertEquals(actualItemsCart, expectedItemsCart);
    }

    @And ("I check the size and the color of the product")
    public void checkSizeAndColorProduct() {
        itemInCart.click();
// Check Size of the product
        String actualSize = driver.findElement(By.xpath("(//dd[@class='values'])[1]")).getText();
        System.out.println("actualSize is: " + actualSize);
        String expectedSize = "S";
        System.out.println("expectedSize is: " + expectedSize);
        Assert.assertEquals(actualSize, expectedSize);

// CHeck Color of the product
        String actualColor = driver.findElement(By.xpath("(//dd[@class='values'])[2]")).getText();
        System.out.println("actualColor is: " + actualColor);
        String expectedColor = "Green";
        System.out.println("expectedColor is: " + expectedColor);
        Assert.assertEquals(actualColor, expectedColor);
    }

    @And ("I change the shipping method")
    public void changeShippingMethod() {
        changeShippingMethod.click();
        secondShippingMethod.click();
    }

    @And ("I click the Press Order button")
    public void clickPressOrderButton() {
        orderButton.click();
    }

    @Then("I verify the message after the order is done")
    public void verifyMessageAfterOrderDone() {
        String actualMessagePurchase = driver.findElement(By.xpath("//span[@class='base']")).getText();
        System.out.println("actualMessagePurchase is: " + actualMessagePurchase);

        String expectedMessagePurchase = "Thank you for your purchase!";
        System.out.println("expectedMessagePurchase is: " + expectedMessagePurchase);

        Assert.assertEquals(actualMessagePurchase, expectedMessagePurchase);

    }
}




