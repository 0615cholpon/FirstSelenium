package com.Cyberteck;
//Go to : http://practice.cybertekschool.com/forgot_password
//        Enter email
//        Click “retrieve password” button
//        Make sure “Your e-mail's been sent!” message is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterEmail {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/c.alymova/Documents/" +
                "Selenium Dependence/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://practice.cybertekschool.com/forgot_password");
        //to be able to enter email, i need to locate the input box
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));

        //locating the retrieve button here;
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //entering the email

        inputEmail.sendKeys("testemail@email.com");

        retrieveButton.click();

        //locating the message;

        WebElement emailMessage = driver.findElement(By.xpath("//div[@id='content']"));
        // WebElement emailMessage = driver.findElement(By.id("content"));

        if(emailMessage.isDisplayed()){
            System.out.println("Email message verification PASSED!");
        }else{
            System.out.println("Email message verification FAILED!!!");
        }

        //if I wanted make sure that the message inside is correct as well

        String emailMessageText = emailMessage.getText();

        if(emailMessageText.equals("Your e-mail's been sent!")){
            System.out.println("Email message text verification PASSED!");
        }else {
            System.out.println("Email message text verification FAILED!!!");
        }
    }
}
