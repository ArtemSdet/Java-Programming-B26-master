package day27_05_17_2022;

import day24_05_04_2022.browserTask.Firefox;
import day26_05_11_2022.driverTask.ChromeDriver;
import day26_05_11_2022.driverTask.FirefoxDriver;
import day26_05_11_2022.driverTask.SafariDriver;
import day26_05_11_2022.driverTask.WebDriver;

public class DriverUtil {


    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){

            case "chrome":
                // WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "safari":
                // WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                break;

            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            default:
                System.out.println("UNKNOWN BROWSER");
                driver=null;

        }

        return driver;

    }

}
