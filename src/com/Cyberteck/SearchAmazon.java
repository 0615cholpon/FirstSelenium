package com.Cyberteck;
//PRACTICE: Search Amazon
//        1.Open browser
//        2. Go to https://amazon.com
//        3. Enter any search term (use cssSelector to locate search box)
//        4.Verify title contains the search term
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/" +
                "Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedInTitle = "wooden spoon";
        String actualTitle = driver.getTitle();


        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
    }
}
