package web;

import java.net.HttpURLConnection;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class urlcheck {
	HttpURLConnection connection = null;
	String urlstring= "http://www.google.com";
	public void url1()
	
	{
		try{         
		    URL myurl = new URL();        
		    connection = (HttpURLConnection) myurl.openConnection(); 
		         
		    connection.setRequestMethod("HEAD");         
		    int code = connection.getResponseCode();        
		    System.out.println("" + code); 
		} 
		catch (Throwable e) {
		
		}
		
	}
	
	public static void main(String[] args)
	{
		
	urlcheck uk = new urlcheck();
	uk.url1();
	
	}
}
