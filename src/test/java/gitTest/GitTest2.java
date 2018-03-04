package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class GitTest2 {

	
	@Test
	public void loginTest() throws IOException{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.bing.com");
		
	File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\workspace\\GitTest\\screenshot\\test.jpg"));
	}
}
