package com.Cyberteck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title veryfication Passed");

        }
        else{
            System.out.println("Gmail veryfication Failed!!!");
        }
         driver.navigate().back();
        Thread.sleep(1000);
        if(driver.getTitle().contains("Google")){
            System.out.println("Gmail title veryfication Passed");
        }
        else{
            System.out.println("Gmail title veryfication Failed");
        }
        driver.navigate().forward();
        if(driver.getTitle().contains(("Gmail"))){
            System.out.println("Gmail title veryfication Passed");

        }
        else{
            System.out.println("Gmail title veryfication Failed");
        }

    }
}
