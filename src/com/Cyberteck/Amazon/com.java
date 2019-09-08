package com.Cyberteck.Amazon;
//1-Go to amazon.com
//        2-Type “wooden spoon” inside of search box
//        3-Click to search button
//        4-Verify title has wooden spoon
//        5- Also verify results under search box also has “wooden spoon” as well

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class com {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/" +
                "Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");


        //enter a "wooden spoon" to search
        //locate the search box

        WebElement inputSearch = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        inputSearch.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));

        searchButton.click();

        String expectedInTitle = "wooden spoon";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification is Passed!");
        }else{
            System.out.println("Title verification is FAILED!!!");
        }

        //verify the text under search box contains given keyword "wooden spoon"

        WebElement resultContainer = driver.findElement(
                By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]"));
        // another locator --> //span[@class='a-color-state a-text-bold']

        String resultContainerText = resultContainer.getText();

        if(resultContainerText.contains(expectedInTitle)){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!!!");
        }



    }
}
