package com.cybervisiontech.mapr.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Анна on 09.04.2016.
 */
public class MySelenium {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");

        WebElement element = driver.findElement(By.id(""));

    }
}
