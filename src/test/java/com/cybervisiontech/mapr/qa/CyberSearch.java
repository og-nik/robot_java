package com.cybervisiontech.mapr.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.pkcs11.wrapper.Constants;

/**
 * Created by Анна on 09.04.2016.
 */
public class CyberSearch {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
    }

    @Before
    public void openYandex(){
        driver.get("https://www.yandex.ua/");
    }

    @Test
    public void searchCyber(){
        System.out.println("TC 1: Find Cyber in yandex. Show title as output");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = driver.findElement(By.id("text"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Cybervision");
        element.submit(); // equal enter
        // Find first search result
        WebElement element2 = driver.findElement(By.xpath("//div[@class='content__left']//a"));
        wait.until(ExpectedConditions.elementToBeClickable(element2));
        element2.click();

        // Find title
        WebElement element3 = driver.findElement(By.xpath("/html/head/title"));
        wait.until(ExpectedConditions.elementToBeClickable(element3));
        System.out.println(element3.getText());

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
