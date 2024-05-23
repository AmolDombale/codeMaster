package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
 public static WebDriver driver=new ChromeDriver();
    public static WebElement findElement(By by){
        WebElement element=driver.findElement(by);
        if(driver instanceof JavascriptExecutor){
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",element);
        }
        return element;
    }

}
