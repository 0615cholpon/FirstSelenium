package com.Cyberteck;
//Cybertek Practice:
//        Go to : http://practice.cybertekschool.com/forgot_password
//        Locate every single webelement on this page using xpath.
//        Make sure they are all displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/" +
                "Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

      
    }
}
