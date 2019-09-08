package com.Cyberteck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com/");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.name("btnk")).click();

        if(driver.getTitle().startsWith("apple")){
            System.out.println("The title stsrts with apple");
        }
        else{
            System.out.println("The title does not start with apple");
        }

    }
}
