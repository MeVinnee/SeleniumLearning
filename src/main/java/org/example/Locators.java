package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Locators {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanita_patil/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();

        //Edge browser

        //System.setProperty("webdriver.edge.driver", "C:/Users/vanita_patil/Edgedriver/edgedriver_win64/msedgedriver.exe");
        //WebDriver driver1 = new EdgeDriver();
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();

       // Locators
        driver.findElement(By.id("inputUsername")).sendKeys("Vinnee");
        driver.findElement(By.name("inputPassword")).sendKeys("ABC");
        driver.findElement(By.className("signInBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       driver.findElement(By.linkText("Forgot your password?")).click();
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vinnee");
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Vinnee@abc.com");
       driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Vinnee@XYZ.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9898354518");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        //Entered Correct Username and Password
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Vinnee");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //driver.findElement(By.id("chkboxOne")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // driver.quit();
       }}