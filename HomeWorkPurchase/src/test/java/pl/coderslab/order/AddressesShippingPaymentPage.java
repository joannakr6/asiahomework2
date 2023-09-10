package pl.coderslab.order;

public class AddressesShippingPaymentPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public AddressesShippingPaymentPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickConfirmAddressBtn() {
        WebElement confirmAddressBtn = wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm-addresses")));
        confirmAddressBtn.click();
    }
    public void clickConfirmShippingBtn() {
        WebElement confirmShippingBtn = wait.until(ExpectedConditions.elementToBeClickable(By.name("confirmDeliveryOption")));
        confirmShippingBtn.click();

    }

    public void selectPaymentMethod() {
        WebElement paymentByCheck = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("payment-option-1")));
        paymentByCheck.click();
    }

    public void selectAgreeTerms() {
        WebElement termsCheckbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("conditions_to_approve[terms-and-conditions]")));
        if (!termsCheckbox.isSelected()) {
            termsCheckbox.click();
        }
    }

    public void placeOrder() {
        WebElement placeOrderBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Place order')]")));
        placeOrderBtn.click();
    }

