package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pro.propertiseCon;

public class FinalSel
{
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) 
	{

		//setBrowser();
		propertiseCon.getPropertise();
		setPropertise();
		buildExecute();

	}


	//setBrowser
	//set config and property
	//execute


	public static void setBrowser()
	{
		browser="Edge";

	}

	public static void setPropertise()
	{
		if(browser.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://selenium/chromedriver.exe");
			driver = new ChromeDriver();


		}
		if(browser.contains("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C://selenium/MicrosoftWebdriver.exe");
			driver = new EdgeDriver();

		}

	}

	public static void buildExecute()
	{
		driver.get("https://www.youtube.com");
		driver.quit();

	}
}
