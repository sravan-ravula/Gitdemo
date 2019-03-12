package onlineITVidhya;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRAVAN RAVULA\\Desktop\\selenium drivers\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	  //ArrayList<WebElement>links=driver.findElements(By.tagName("a"));
	 driver.findElement(By.linkText("Gmail")).click();
	String actual=driver.getTitle();
	String Expected = "Gmail";
	if (actual.contains(Expected)){
		System.out.println("test Case Pass");
	}
	else{
		System.out.println("test case fail");
	}
	

	}

}
