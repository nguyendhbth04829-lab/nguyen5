package vn.fpoly.detri.selenium_webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {
WebDriver webDriver;
@BeforeEach
    void setUp(){
    WebDriverManager.chromedriver().setup();
    webDriver = new ChromeDriver();
}
@Test
    void testSteps() throws InterruptedException{
    //open linnk
    webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    //click menu
    webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
    //login
    Thread.sleep(2000);
    webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
//dangnhap
    webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
    webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
    webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
    //
    WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
    Assertions.assertEquals("Formal Shoes",webElement.getText());
    //
    webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
    webDriver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button")).click();
    //dong
    webDriver.quit();
}

}
