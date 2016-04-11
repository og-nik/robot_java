package com.cybervisiontech.mapr.qa;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Created by Анна on 11.04.2016.
 */
public class OlxBot {

    static WebDriver driver;
    static Properties applicationProps;
    WebDriverWait wait;

    @BeforeClass
    public static void readPropertiesFromFile(){
        applicationProps = new Properties();
        try (InputStream in = new FileInputStream("project.properties")){
            applicationProps.load(in);
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
    }

    @Before
    public void openOlx(){
        driver.get("https://ssl.olx.ua/account/");
    }

    @Test
    public void login() {
        wait = new WebDriverWait(driver, 10);
        // Login field
        WebElement loginField = driver.findElement(By.id("userEmail"));
        wait.until(ExpectedConditions.elementToBeClickable(loginField));
        loginField.sendKeys(applicationProps.getProperty("login"));
        // Password field
        WebElement passwordField = driver.findElement(By.id("userPass"));
        passwordField.sendKeys(applicationProps.getProperty("password"));
        // Check mark
        WebElement checkMark = driver.findElement(By.xpath("//label[@relname='login[remember-me]']"));
        checkMark.click();
        // Click Enter
        WebElement enterButton = driver.findElement(By.id("se_userLogin"));
        enterButton.click();
    }

    @Test
    public void searchByKeyWordsTest(){
        wait = new WebDriverWait(driver, 10);
        // Go to Search page
        WebElement searchPage = driver.findElement(By.id("headerLogo"));
        wait.until(ExpectedConditions.elementToBeClickable(searchPage));
        searchPage.click();
        // Enter key words in search field, click Enter
        WebElement searchField = driver.findElement(By.id("headerSearch"));
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(applicationProps.getProperty("keyWords"));
        searchField.submit();
        // Display titles of all found advertisements
        String titles = driver.findElement(By.xpath("//a/strong")).getText();
        System.out.println(titles);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


}
