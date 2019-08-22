package Pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test1.FinalSel;

public class propertiseCon {

	public static Properties prop = new Properties();

	public static void main(String[] args) {

		getPropertise();
		//setPropertise();

	}

	public static void getPropertise()
	{

		InputStream fileIn;

		try {

			fileIn = new FileInputStream("C://Users/jatin/eclipse-workspace/FinalSelenium/src/Pro/conf.properties");
			prop.load(fileIn);
			FinalSel.browser = prop.getProperty("browser");
			//System.out.println(prop.getProperty("browser"));
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

	public static void setPropertise()
	{
		OutputStream fileOut;
		try
		{
			fileOut = new FileOutputStream("C:\\Users\\jatin\\eclipse-workspace\\FinalSelenium\\src\\Pro\\conf.properties");	
			prop.setProperty("broswer", "chrome");
			prop.store(fileOut, null);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
