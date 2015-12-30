package web;

//import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//import java.io.File;
//import java.io.FileInputStream;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.jna.platform.win32.Netapi32Util.User;

public class sample {
	
	//static string a;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("http://4102-01-41.zimmber.com/admin/default/login");
		driver.manage().window().maximize();



}
	}
