package onlineITVidhya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithdropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRAVAN RAVULA\\Desktop\\selenium drivers\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mercurytravels.com");
	}

}
