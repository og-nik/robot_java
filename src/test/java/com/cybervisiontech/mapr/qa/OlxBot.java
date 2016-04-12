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

import static org.junit.Assert.assertTrue;

/**
 * Created by Анна on 11.04.2016.
 */
public class OlxBot {

    static WebDriver driver;
    static Properties applicationProps;
    WebDriverWait wait;

    @BeforeClass
    // Read from project.properties file
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
    public void loginTest() {
        System.out.println("TEST CASE 1: Login");
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

        // Verify if login is successful (if there is "anna.imhr" text on the page)
        String pageLoginText = driver.findElement(By.id("topLoginLink")).getText();
        String loginProperty = applicationProps.getProperty("login");
        String[] firstPart = loginProperty.split("@");
        String checkTextLogin = firstPart[0];
        assertTrue("FAILED: Text not found!", pageLoginText.contains(checkTextLogin));
        System.out.println("PASSED: Login is successful.");
        System.out.println();
    }

    @Test
    public void searchByKeyWordsTest(){
        System.out.println("TEST CASE 2: Search by key words");
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

        // Display titles of ALL found advertisements
        List<WebElement> allTitles = driver.findElements(By.xpath(".//*/tbody/tr[1]/td[2]/div/h3/a/strong"));
        for (int i = 0; i < allTitles.size(); i++){
            System.out.println(allTitles.get(i).getText());
        }
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
