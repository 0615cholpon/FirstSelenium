package com.Cyberteck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWoodenSpoon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://etsy.com");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);


        if(driver.getTitle().contains("Wooden spoon")){
            System.out.println("Etsy title verification PASSED!");
        }else{
            System.out.println("Etsy title verification FAILED!!!");
        }

    }
}
