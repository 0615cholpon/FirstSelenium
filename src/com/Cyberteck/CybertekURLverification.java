package com.Cyberteck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekURLverification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cybertekschool.com/");

        if(driver.getCurrentUrl().contains("https://cybertekschool.com/")){
            System.out.println("Cybertek URL Veryfication PASSED");

        }
        else{
            System.out.println("Cybertek veryfication faild");
        }


    }
}
