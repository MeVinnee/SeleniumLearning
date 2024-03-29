package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main (String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanita_patil/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Dropdown with Select tag

        WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(Staticdropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        /*int i=1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/

        for (int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //Parent-Child relationship locator to identify the objects uniquely
        // driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();

        //AutoSuggestive Dropdown
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options){
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }

            System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
            driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
            System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        }




        //driver.close();
    }
}