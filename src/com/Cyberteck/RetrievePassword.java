package com.Cyberteck;
//Retrieve password Task
//        1.Open browser
//        2. Go to https://the-internet.herokuapp.com/forgot_password
//        3. Enter any email
//        4. Click on Retrieve password
//        5.Verify url contains email_sent
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("0615cholpon@gmail.com");
        driver.findElement(By.id("form_submit")).click();

        if(driver.getCurrentUrl().contains("email_sent")){
            System.out.println("Link verification Passed");
        }else{
            System.out.println("Link veryfication Failed!!!");
        }

    }
}
