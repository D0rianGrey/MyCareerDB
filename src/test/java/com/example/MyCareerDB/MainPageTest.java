package com.example.MyCareerDB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MainPageTest {
    @Test
    public void openPage() {
        String baseURL = "https://www.google.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        assertThat(driver.getCurrentUrl(),equalTo(baseURL));
        driver.quit();
    }
}