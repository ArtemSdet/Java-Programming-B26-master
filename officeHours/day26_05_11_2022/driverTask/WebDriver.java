package day26_05_11_2022.driverTask;

public interface WebDriver {
    /*

    Interface WebDriver:
        void get(String URL);
        void close();
        void quit();

     */

  // public static final String VERSION =" init them right away";
    public abstract void get(String URL);  // by default --> public abstract
    void close();
    void quit();





}
