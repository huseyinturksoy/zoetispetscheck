package com.zoetispets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests {

    private WebDriver driver;
    
    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    @Test(dataProvider = "zoetispetsV2Locals", dataProviderClass = TestData.class, enabled = true, priority = 1)
    public void PracticeDetail(String pageURL) throws InterruptedException {

        driver.get(pageURL);
        String title = driver.getTitle();
        System.out.println("title = " + title);


    }
    
    
    
    
}
