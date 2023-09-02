package LoginTest;

import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseDriver {
    @Test
    void test1(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement emailInbox = driver.findElement(By.cssSelector("input[id='input-email']"));
        emailInbox.sendKeys("testngusbatch@gmail.com");

        WebElement passInbox = driver.findElement(By.cssSelector("input[id='input-password']"));
        passInbox.sendKeys("usbatch1234");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButton.click();

        WebElement myAccountText = driver.findElement(By.xpath("//h2[text()='My Account']"));

        Assert.assertTrue(myAccountText.isDisplayed());
    }
}
