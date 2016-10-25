package net.ukr.geka3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

	public String[] getA(String text) {
		
		ArrayList<String> ALS = new ArrayList<>(); 
		String[] result = null;	
		String rex = "<\\s*a[^>]*>[^<]*<\\s*/\\s*a\\s*>";
		
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(text);

		

		for (int i = 0; m.find(); i++) {
			
			ALS.add(m.group());
			System.out.println(ALS.get(ALS.size()-1));
		}
		
		result = ALS.toArray(new String[ALS.size()]);
		
		
		
		return result;
	}

}
