package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Config {
    public static final String BASE_URL = "https://www.ryanair.com/gb/en";
    
    private static WebDriver driver;

    public static String getHomePageUrl() {
        return BASE_URL;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
