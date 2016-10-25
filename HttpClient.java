package net.ukr.geka3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.function.IntPredicate;

public class HttpClient {
	
	
	URL url;
	URLConnection urlCon;
	public HttpClient(String url) {
		super();
		
		try {
			this.url = new URL(url);
			this.urlCon = this.url.openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getHttpText(){
		StringBuilder sb = new StringBuilder();
		
		if(urlCon.getContentLength() != 0){
			try(InputStream io = urlCon.getInputStream()) {
				BufferedReader bf = new BufferedReader(new InputStreamReader(io));
				char ch;
				int ich;
				for(;(ich = bf.read()) != -1;){
					sb.append((char)ich);
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	
	
	
}
