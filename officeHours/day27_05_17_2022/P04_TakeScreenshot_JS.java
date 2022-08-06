package day27_05_17_2022;

import day26_05_11_2022.driverTask.*;

public class P04_TakeScreenshot_JS {
    public static void main(String[] args) {

    // How to take screenshot
        WebDriver driver=new ChromeDriver();


        ((RemoteWebDriver)driver).TakeScreenShot("pic001");

        ((TakeScreenshot)driver).TakeScreenShot("pic002");


    // how to executeScripts
        ((JavaScriptExecuter)driver).executeScript("Executing Script");





    }
}
