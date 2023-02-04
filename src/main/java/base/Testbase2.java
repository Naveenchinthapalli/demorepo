package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pageobjects.Contact_Us_Page;
import Pageobjects.Create_Account_page;
import Pageobjects.HomePage;
import Pageobjects.MyAccountPage;
import Pageobjects.Signin;

public class Testbase2 {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static Contact_Us_Page contactUsObj;
	public static Create_Account_page createAccountObj;
	public static HomePage homeObj;
	public static MyAccountPage myAccountObj;
	public static Signin signInObj;
	
	public static void setup() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\config.Properties");
		
		//load the file using below command
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");
			driver = new ChromeDriver(options);
		}
		else if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Santosh\\Automation\\Workspace_new\\BatchFeb\\drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Automation\\Workspace_new\\BatchFeb\\drivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("provided browser is invalid");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		
		contactUsObj = new Contact_Us_Page(driver);
		createAccountObj = new Create_Account_page(driver);
		homeObj = new HomePage(driver);
		myAccountObj = new MyAccountPage(driver);
		signInObj = new Signin(driver);
	}
	
}
