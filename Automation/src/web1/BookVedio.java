package web1;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.monte.media.math.Rational;
import org.monte.media.Format;
//import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.*;
//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

public class BookVedio {
	
	public static String baseurl="http://4102-01-41.zimmber.com/admin/";
	public static WebDriver driver = new FirefoxDriver(); 
	 private static ScreenRecorder screenRecorder;
	 private static GraphicsConfiguration gconfig;
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver =new FirefoxDriver();
		
		 screenRecorder = new ScreenRecorder(gconfig,
		         new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey,
		         MIME_AVI),
		         new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
		         ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		         CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		         DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
		         QualityKey, 1.0f,
		         KeyFrameIntervalKey, (int) (15 * 60)),
		         new Format(MediaTypeKey, MediaType.VIDEO,
		         EncodingKey,"black",
		         FrameRateKey, Rational.valueOf(30)), null);
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement loginButton=driver.findElement(By.className("login cd-signin")).click();
		//loginButton.click();
		//Thread.sleep(20000);
		
		
		
	    WebElement element= driver. findElement(By.id("LoginForm_username"));
		
        element.sendKeys("avik admin");
        
        
       // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	    WebElement element1 = driver.findElement(By.id("LoginForm_password"));
	    element1.sendKeys("zimmber1");   
	    
	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element3 = driver.findElement(By.name("yt0"));
	    element3.submit();
	    
	  /* WebElement element4 = driver.findElement(By.linkText("ORDERS"));
	    element4.click();
	    
	    //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element5 = driver.findElement(By.linkText("Manage Jobs"));
	    element5.click();
	    
	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element6 = driver.findElement(By.linkText("Manage In-Process Job"));
	    element6.click();
	    
	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element12 = driver.findElement(By.linkText("Add"));
	    element12.click(); */
//	    
	    WebElement element7 = driver.findElement(By.linkText("CUSTOMERS"));
	    element7.click();
	    
	    // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
	    
	    WebElement element8 = driver.findElement(By.linkText("Manage Customer"));
	    element8.click();
	   
	    
	 // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element9 = driver.findElement(By.name("q"));
	    element9.sendKeys("Tester Avik");   
	    
	    // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element10 = driver.findElement(By.className("submit_button"));
	    element10.click();
	    
	    // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element11 = driver.findElement(By.cssSelector("a[href*='view/id/1062291']"));
	    element11.click();
	    
	 // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement element13 = driver.findElement(By.name("btnAdd"));
	    element13.click();
	    
	    
	   // WebElement element14 = driver.findElement(By.id("JobDetails_service_id"));
	    //element14.click();
	    
	    Select se= new Select (driver.findElement (By.id("JobDetails_service_id")));
	
	   se.selectByVisibleText("Electrical Service");
	   
	   // driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    
	    //se.selectByValue("6");
	   
	// Select se1= new Select (driver.findElement (By.id("JobDetails_activity_id")));
	   
	 //se1.selectByVisibleText("Installation / Removal of Ceiling fan");
	    
	   //se1.selectByValue("37");
	   
	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   
	   WebElement element15 = driver.findElement(By.id("JobDetails_activity_count"));
	   
	   element15.sendKeys("1");
	    
	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   
 WebElement element16 = driver.findElement(By.id("JobDetails_problem"));
	   
	   element16.sendKeys("This is test");
	   
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   
	WebElement element18 = driver.findElement(By.name("JobDetails[activity_id]"));
	  element18.click();
	   
	    Select se2= new Select (driver.findElement (By.name("JobDetails[activity_id]")));
		   
		 se2.selectByVisibleText("Removal of Ceiling fan");
		    
	   
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   
	  WebElement element20 = driver.findElement(By.className("add_but"));
	   element20.click();
	   
	   driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	   
	  WebElement element21 = driver.findElement(By.id("Booking_source"));
	   element21.click();
	   
	  
	   Select se3= new Select (driver.findElement (By.id("Booking_source")));
		   
		 se3.selectByVisibleText("Just Dial");
		 
		 //driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	   
	   
	   
	 // Select element21 = new Select (driver.findElement(By.partialLinkText("#")));
	   //element21.selectByVisibleText("8");
	   
		 WebElement element22 = driver.findElement(By.name("yt1"));
		   element22.submit();
		   
		   //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		   
		  /* WebElement element23 = driver.findElement(By.linkText("ORDERS"));
		    element23.click();
		    
		    //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
		    WebElement element24 = driver.findElement(By.linkText("Manage Jobs"));
		    element24.click();
		    
		   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
		    WebElement element26 = driver.findElement(By.linkText("Manage In-Process Job"));
		    element26.click();*/
		    
		   testreport();
		   
		  // testreport1();
		    
		    
	   
	}
	
	public static void testreport() throws IOException
	{
		
		String expectedText ="0000-00-00";
		String actualText = driver.getTitle();
				//driver.findElement (By.name("0000-00-00")).getText();
		
		try
		{
			Assert.assertEquals(actualText,expectedText);
			System.out.println("Test Passed");
		}
		
		catch(Exception e)
		{
			
			System.out.println("Test Failed... because service date loopfall");
			screenRecorder.stop();
		}
		
		
	}
	
	/*public static void testreport1() {
	    throw new RuntimeException("Test not implemented");
	  }*/
	
	}


	

		
