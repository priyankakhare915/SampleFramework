package LibraryFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
    public static WebDriver driver;
    public void intializeBrowser(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            driver= new ChromeDriver();
        }
        if (browserName.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        if (browserName.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }

    }
}
