package com.cybertek.tests.day2_locator_getText_getAttribute;
//TC #3: Back and forth navigation
//        1- Open a chrome browser
//        2- Go to: https://google.com
//        3- Click to Gmail from top right.
//        4- Verify title contains:
//        Expected: Gmail
//        5- Go back to Google by using the .back();
//        6- Verify title equals:

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
