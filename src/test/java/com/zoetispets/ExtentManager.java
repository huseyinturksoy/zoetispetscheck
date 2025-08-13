package com.zoetispets;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("target/ExtentReports.html");
            reporter.config().setReportName("ZoetisPetsCheck Test Report");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}

