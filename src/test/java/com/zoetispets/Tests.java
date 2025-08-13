package com.zoetispets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tests {

    private WebDriver driver;
    
    @BeforeClass
    public void setUp() throws IOException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        Path tempDir = Files.createTempDirectory("chrome-user-data");
        options.addArguments("user-data-dir=" + tempDir.toAbsolutePath().toString());


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    @Test(dataProvider = "zoetispetsV2Locals", dataProviderClass = TestData.class, enabled = true, priority = 1)
    public void PracticeDetail(String pageURL, String pageTitle) throws InterruptedException {

        driver.get(pageURL);
        String title = driver.getTitle();
        System.out.println("title = " + title);

        Assert.assertEquals(title,pageTitle);




    }
    
    
    
    
}
