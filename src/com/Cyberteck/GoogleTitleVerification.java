package com.Cyberteck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
        System.out.println("print passed");
    }
    else
        System.out.println("Google not passed");

    }

}
