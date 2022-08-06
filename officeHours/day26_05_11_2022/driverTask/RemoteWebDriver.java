package day26_05_11_2022.driverTask;

public   class RemoteWebDriver implements WebDriver,JavaScriptExecuter,TakeScreenshot {


    @Override
    public void executeScript(String script) {
        System.out.println("Executing Script");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenshot "+name);

    }

    @Override
    public void get(String URL) {
        System.out.println("opening webstie "+URL);

    }

    @Override
    public void close() {
        System.out.println("Closing Browser");

    }

    @Override
    public void quit() {
        System.out.println("Quit the Browser");

    }
}
