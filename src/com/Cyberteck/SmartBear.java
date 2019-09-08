package com.Cyberteck;
//Test Case #5: Basic Authentication Test
//        1. Open a chrome browser
//        2. Go to website http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//        3. Enter username: Tester
//        4. Enter password: test
//        5. Click “Sign In” button
//        6. Verify Title contains:
//        Expected: Web Orders

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBear {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        if(driver.getTitle().contains("Web Orders")){
            System.out.println("Title veryfication past");
        }else{
            System.out.println("Title veryfication failed");
        }
driver.quit();

    }
}
