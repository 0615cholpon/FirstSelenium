package com.Cyberteck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FirstSelenium {
    public static void main(String[] args)throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/Selenium Dependence/drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://google.com");

        System.setProperty("webdriver.gecko.driver",
                "/Users/c.alymova/Documents/Selenium Dependence/drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://google.com");
        //Thread.sleep(1000);

        driver.navigate().back();
       // Thread.sleep(2000);

        driver.navigate().refresh();
        //Thread.sleep(2000);

        System.out.println(driver.getTitle());

        driver.getCurrentUrl();

        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.close();
    }
}
