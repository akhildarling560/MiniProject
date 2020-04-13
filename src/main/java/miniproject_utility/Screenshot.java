package miniproject_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * Class created to taking Screenshots
 */
public class Screenshot {
	public String getScreenshot(WebDriver driver){
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed "+e.getMessage());
		}  
		return path;
	}
}
