package net.ukr.geka3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://ukr.net";
		HttpClient hc = new HttpClient(url);
		String httpText = hc.getHttpText();
		
		A a = new A();
		a.getA(httpText);
	}

}
