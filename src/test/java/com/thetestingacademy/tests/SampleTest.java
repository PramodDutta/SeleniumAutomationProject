package com.thetestingacademy.tests;

import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.listeners.RetryAnalyzer;
import com.thetestingacademy.pageobjects.GoogleHomePage;
import com.thetestingacademy.utils.WebDriverManager;
import com.thetestingacademy.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    private GoogleHomePage googleHomePage;

    @Test(description = "Test to verify Google Search functionality", retryAnalyzer = RetryAnalyzer.class)
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Google Search")
    @Story("As a user, I want to search for a term using Google")
    @Description("Test Description: Verifies that the Google Search is working as expected")

    public void testGoogleSearch() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("TheTestingAcademy");
        Assert.assertEquals(driver.getTitle(), "TheTestingAcademy - Google Search");
    }

    @Test(description = "Test to verify Google Search functionality2", retryAnalyzer = RetryAnalyzer.class)
    public void testGoogleSearchNegative() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("TheTestingAcademy");
        Assert.assertEquals(driver.getTitle(), "No Title");
    }
}
