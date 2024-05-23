package com.testing;

import com.config.PropertyFileReader;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.testing.AppConstant.*;
import static com.testing.CommonMethods.*;

public class LaunchBrowser {

    public static PropertyFileReader  properties = ConfigFactory.create(PropertyFileReader.class);

static By username= By.xpath("//input[@name='username']");
static By password= By.xpath("//input[@name='password']");
static By loginButton=By.xpath("//button");
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(CHROMEEXECUTABLE,CHROMEDRIVERPATH);
        //WebDriver driver =new ChromeDriver();
        driver.get(properties.url());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        findElement(username).sendKeys(properties.username());
        findElement(password).sendKeys(properties.password());
        findElement(loginButton).click();

    }

}
