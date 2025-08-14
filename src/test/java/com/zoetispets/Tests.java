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
import com.aventstack.extentreports.*;

public class Tests {

    private WebDriver driver;
    ExtentReports extent;
    ExtentTest test;
    
    @BeforeClass
    public void setUp() throws IOException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        Path tempDir = Files.createTempDirectory("chrome-user-data");
        options.addArguments("user-data-dir=" + tempDir.toAbsolutePath().toString());
        extent = ExtentManager.getInstance();
        test = extent.createTest("SetUp Test");


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        test.info("ChromeDriver started successfully");
        
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            test.info("ChromeDriver closed");
        }
        extent.flush(); // Write the report to HTML
    }


    @Test(dataProvider = "zoetispetsV2Locals", dataProviderClass = TestData.class, enabled = true, priority = 1)
    public void PracticeDetail(String pageURL, String pageTitle) throws InterruptedException {

        test = extent.createTest("navigating to " + pageURL);

        driver.get(pageURL);
        String title = driver.getTitle();
        System.out.println("title = " + title);

        try {
            Assert.assertEquals(title, pageTitle);
            test.pass("✅ Test Passed — Expected and actual title match: " + title);
        } catch (AssertionError e) {
            test.fail("❌ Test Failed — Expected: " + pageTitle + " | Actual: " + title);
            throw e; // rethrow so TestNG marks the test as failed
        }




    }
    
    
    
    
}
