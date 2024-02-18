package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanita_patil/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");

        //Edge browser

        //System.setProperty("webdriver.edge.driver", "C:/Users/vanita_patil/Edgedriver/edgedriver_win64/msedgedriver.exe");
        //WebDriver driver1 = new EdgeDriver();
        //driver.get("https://rahulshettyacademy.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        driver.quit();
       }}