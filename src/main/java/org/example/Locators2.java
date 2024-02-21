package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;

public class Locators2 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanita_patil/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        String Name = "Vinnee";
        driver.findElement(By.id("inputUsername")).sendKeys(Name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + Name +",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }
}
