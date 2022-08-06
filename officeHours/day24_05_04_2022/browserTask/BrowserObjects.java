package day24_05_04_2022.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {


        System.out.println("======= CHROME ======= ");

        Chrome chrome=new Chrome();
        chrome.open();
        chrome.navigate("www.google.com");
        chrome.refresh();
        chrome.close();


        System.out.println("======= FIREFOX ======= ");

        Firefox firefox=new Firefox();
        firefox.open();
        firefox.navigate("www.google.com");
        firefox.refresh();
        firefox.close();


    }
}
