package LibraryFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass
{
	public WebDriver m;
	public void initializeBrowser() throws IOException
	{
		 m= new ChromeDriver();
		 m.get(Utility_Class.getPropertyFileData("URL"));
		 m.manage().window().maximize();
		 m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
	}
	
}
