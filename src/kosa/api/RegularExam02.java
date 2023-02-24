package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
//		String data[] = {
//				"bat", "bba", "bbg", "bonus",
//				"CA", "ca", "c232", "car",
//				"date", "dic", "diraaa"
//		};
//		//위에서 원하는 값 뽑아내기
////		Pattern p = Pattern.compile("c[a-z]*");
//		Pattern p = Pattern.compile("[a-z]a$");
//		
//		for(int i=0; i<data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches()) {
//				System.out.println(data[i]);
//			}
//		}
		
		
//		String source = "ab?cd?ef?hg";
//		String reg = "(\\w*)";
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		String source = "HP:010-1111-1111, HOME: 02-222-2222";
		String reg = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(reg); //패턴
		Matcher m = p.matcher(source); //소스
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
