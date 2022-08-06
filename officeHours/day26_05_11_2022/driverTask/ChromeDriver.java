package day26_05_11_2022.driverTask;

public class ChromeDriver extends RemoteWebDriver{
    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");
    }
}
