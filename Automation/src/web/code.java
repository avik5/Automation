package web;



//import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.SgmlPage;
//import static org.testng.AssertJUnit.assertEquals;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

//import common.Assert;

public class code {

	private static WebClient webClient;
	//private static Scanner in;

	public static void main(String[] args) throws MalformedURLException, IOException
	
	{
		
		 verify();
		 //Assert.assertEquals1("OK",htmlPage.getWebResponse().getStatusMessage());
		
		
	}
	
	public static void verify() throws  MalformedURLException, IOException
	{
		
		String url;
		 
	       Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a url");
	      url = in.nextLine();
		//String url = "http://www.google.com";
		
		 webClient = new WebClient();
		 HtmlPage htmlPage = webClient.getPage(url);
		//int expectedText =200;
		
		int actualText = htmlPage.getWebResponse().getStatusCode();
				
		try
		{
			if(actualText== 200)
			{	
				//System.out.println(actualText);
			//Assert.assertEquals(actualText,expectedText);
			//Assert.assertEquals("OK",htmlPage.getWebResponse().getStatusMessage());
			System.out.println("The request has succeeded.");
			}
			
			else if(actualText== 201)
			{
				System.out.println("Created");
				
			}
			
			else if(actualText== 202)
			{
				System.out.println("Accepted");
				
			}
			
			else if(actualText== 203)
			{
				System.out.println("Non-Authoritative Information");
				
			}
			else if(actualText== 204)
			{
				System.out.println("No content");
				
			}
			else if(actualText== 205)
			{
				System.out.println("Request Content");
				
			}
			
			else
			{
				
				System.out.println("Other");
			}
			
		}
		
		catch(Exception e)
		{
		
			System.out.println("link not found");
			
			
		}
	}

}
