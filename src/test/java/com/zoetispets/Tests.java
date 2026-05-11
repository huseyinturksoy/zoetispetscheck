package com.zoetispets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import com.aventstack.extentreports.*;

@Listeners(com.zoetispets.FailureLogger.class)
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
    public void PracticeDetail(String pageURL, String pageTitle, String pageInfo) throws InterruptedException {

        test = extent.createTest("navigating to " + pageInfo);

        driver.get(pageURL);
        Thread.sleep(3000);
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
    
    @Test(testName = "stage_auth_test", enabled = true, priority = 2)
    public void stageAuthTest() throws IOException {
        String stageUrl = "https://stage-zoetispets.cphostaccess.com/";
        test = extent.createTest("stage_auth_test");

        HttpURLConnection connection = (HttpURLConnection) URI.create(stageUrl).toURL().openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(10000);
        connection.setReadTimeout(10000);
        connection.setInstanceFollowRedirects(false);
        int statusCode = -1;

        try {
            statusCode = connection.getResponseCode();
            Assert.assertEquals(statusCode, 401, "Unexpected response code for stage auth check.");
            test.pass("✅ Test Passed — Received expected 401 from: " + stageUrl);
        } catch (AssertionError e) {
            test.fail("❌ Test Failed — Expected: 401 | Actual: " + statusCode + " | URL: " + stageUrl);
            throw e;
        } finally {
            connection.disconnect();
        }
    }
    
    
}
