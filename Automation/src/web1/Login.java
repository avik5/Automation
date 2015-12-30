package web1;

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

public class Login {
	
	//static string a;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("http://4102-01-41.zimmber.com/admin/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement loginButton=driver.findElement(By.className("login cd-signin")).click();
		//loginButton.click();
		//Thread.sleep(20000);
		
		
		
		
			WebElement element= driver. findElement(By.id("LoginForm_username"));
			
			element.sendKeys("avik");
			
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			
			WebElement element1 = driver.findElement(By.id("LoginForm_password"));
		    element1.sendKeys("zimmber1");   
		    
		    driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		    
		    WebElement element2 = driver.findElement(By.name("yt0"));
		    element2.submit();
		    
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
			WebElement element3= driver. findElement(By.id("LoginForm_username"));
			
			element3.clear();
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			WebElement element4 = driver.findElement(By.id("LoginForm_password"));
		    element4.clear();  
		    
		    WebElement element5= driver. findElement(By.id("LoginForm_username"));
			
          element5.sendKeys("avik1");
			
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			
			  WebElement element6 = driver.findElement(By.id("LoginForm_password"));
	    
	          element6.sendKeys("zimmber");
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
		WebElement element7 = driver.findElement(By.name("yt0"));
	    element7.submit();
	    
	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    
	    WebElement element8= driver. findElement(By.id("LoginForm_username"));
		
		element8.clear();
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
		WebElement element9 = driver.findElement(By.id("LoginForm_password"));
	    element9.clear();  
	    
	    driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	    
	    WebElement element10= driver. findElement(By.id("LoginForm_username"));
		
      element10.sendKeys("avik admin");
      
      driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	    WebElement element11 = driver.findElement(By.id("LoginForm_password"));
	    element11.sendKeys("zimmber1");   
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element12 = driver.findElement(By.name("yt0"));
	    element12.submit();
		
		//WebElement userName=driver.findElement(By.id("LoginForm_username"));		
		//boolean flag=userName.isDisplayed();
		
		//userName.sendKeys("avik.karmakar@zimmber.com");
		
		
		//WebElement password=driver.findElement(By.id("login_phone"));

		
		
		//password.sendKeys("zimmber");
		//WebElement loginButton1=driver.findElement(By.className("login-width"));
		//loginButton1.click();
			
		//WebElement loginbutton2= driver.findElement(By.className("login-depth"));
		//loginbutton2.click();
		
		//avik
			
		

	}

}

