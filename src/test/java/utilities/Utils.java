package utilities;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {

    private static final String DIRECTORY = "src/test/resources/screenshots/";

    public static void takeScreenshot(WebDriver driver, String screenshotName){
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        String newScreenshotName = DIRECTORY + screenshotName + ".png";

        try {
            Files.move(screenshot, new File(newScreenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
