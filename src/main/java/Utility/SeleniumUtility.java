package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SeleniumUtility {
	private static WebDriver driver;

	public void screenShotMethod(String filename) {
//		TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./SCREENSHOTS/" + filename + ".jpg");
		try {
			FileUtils.copyFile(src, destination);
			System.out.println("ScreenShot saved Successfully" + "onTestFailure");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
