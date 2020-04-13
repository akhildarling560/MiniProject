package miniproject_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * Class created to configure Properties file and accessing paths for respected keywords
 */
public class ConfigReader {
Properties prop;
	
	public ConfigReader() {
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			prop.load(fis);
		    } 
		catch (Exception e) {
			System.out.println(e.getMessage());
			} 
	}	
	
	/**
	 * Method to get path of chromeDriver
	 */
	public String getchromepath() {
		
		String path = prop.getProperty("chromeDriver");
		return path;
	}
	
	/**
	 * Method to get path of firefoxDriver
	 */
	public String getfirefoxpath() {
		
		String path = prop.getProperty("firefoxDriver");
		return path;
	}
	
	/**
	 * Method to get path of JPetStore_Url
	 */
	public String getJPetStore_url() {
		String url = prop.getProperty("JpetStore_URL");
		return url;
	}
	
	/**
	 * Method to get path of Excel file used here
	 */
	public String getExcelPath() {
		String excelpath = prop.getProperty("Excelpath");
		return excelpath;
	}
}
