package test.accountsalesforce.utils.drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver {

    public static WebDriver chromeDriver;

    public static MyChromeDriver chromeHisBrowserWeb(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--detach");
        options.addArguments("--aggressive-cache-discard");
        options.addArguments("--headless");

        chromeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }

    public WebDriver onTheUrl(String url){
        chromeDriver.get(url);
        return chromeDriver;
    }
}
