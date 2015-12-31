package web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class linkcode {

	public String ur1 = "http://www.nbc.com/Heroes/novels/downloads/";
	HttpURLConnection connection = null;
	static int code;

	public static void main(String[] args) {

		// HttpURLConnection connection = null;
		try {
			/*
			 * URL u = new URL(); huc.setRequestProperty("User-Agent",
			 * "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)"
			 * ); connection = (HttpURLConnection) u.openConnection();
			 * connection.setRequestMethod("HEAD"); int code =
			 * connection.getResponseCode(); System.out.println("" + code);
			 */
			URL u = new URL();
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			huc.setRequestMethod("GET"); // OR huc.setRequestMethod ("HEAD");
			huc.connect();
			int code = huc.getResponseCode();
			System.out.println(code);
			// You can determine on HTTP return code received. 200 is success.
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * finally { if (code != null) { code.disconnect(); }
		 */
	}

}
