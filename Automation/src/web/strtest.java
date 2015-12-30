package web;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class strtest {

public static void main(String[] args) throws IOException {

    try {
        URL url = new URL("http://zimmber.com/book-sofa");
        InputStream i = null;

        try {
            i = url.openStream();
        } catch (UnknownHostException ex) {
            System.out.println("THIS URL IS NOT VALID");
        }

        if (i != null) {
        	System.out.println(i);
            System.out.println("Its working");
        }

    } catch (MalformedURLException e) {
        e.printStackTrace();
           }
      }
  }