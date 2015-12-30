package web;

import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.TimerTask;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.HttpClientConnection;

import com.thoughtworks.selenium.webdriven.Timer;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class sms {
	
	
	
	
	
	public static void main(String[] args) {
		
		 

		try {

		String recipient = "9967415791";

		String message = " Hi...Good morning";

		String username = "admin";

		String password = "abc123";

		String originator = "8080824824";

		String requestUrl  = "http://127.0.0.1:9501/api?action=sendmessage&" +

		 "username=" + URLEncoder.encode(username, "UTF-8") +

		 "&password=" + URLEncoder.encode(password, "UTF-8") +

		 "&recipient=" + URLEncoder.encode(recipient, "UTF-8") +

		 "&messagetype=SMS:TEXT" +

		 "&messagedata=" + URLEncoder.encode(message, "UTF-8") +

		 "&originator=" + URLEncoder.encode(originator, "UTF-8") +

		 "&serviceprovider=GSMModem1" +

		 "&responseformat=html";

		URL url = new URL(requestUrl );

		URLConnection uc = url.openConnection();

		System.out.println(((HttpURLConnection) uc).getResponseMessage());

		uc.connect();

		} 
		
		catch(Exception ex) {

		System.out.println(ex.getMessage());

		}

	}

}
	
	
