package LibraryFile;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class utilityClass
{
    public static void captureSS(Scenario sce) throws IOException {
        TakesScreenshot shot=(TakesScreenshot) DriverFactory.driver;
        File src=shot.getScreenshotAs(OutputType.FILE);
      String Datetime=  new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());

     String scenarioName=sce.getName().replaceAll(" ","");
     String path="C:\\Users\\kapil\\IdeaProjects\\Oct_3_Framework\\ScreenShot"+scenarioName+"_"+Datetime+".png";
        File des=new File(path);
        FileHandler.copy(src,des);
    }
    public static String getPFdata(String key) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\kapil\\IdeaProjects\\Oct_3_Framework\\src\\main\\java\\PropertiesFile.properties");
        Properties p=new Properties();
        p.load(file);
        String value=p.getProperty(key);
        return value;
    }

}
