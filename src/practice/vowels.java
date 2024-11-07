package practice;

import java.util.Iterator;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abuyuyyiq";
		 int vowelscount=0;
		  StringBuilder a1= new StringBuilder();
		 for(int i=0;i<a.length();i++) {
			 
		 
		
		 char ch = a.charAt(i);
	 switch(ch) {
	 case 'a': 
	 case 'e':
	 case 'i':
	 case'o':
	 case 'u':
		 vowelscount++;
		 System.out.println(ch);
	
		 break;
			
	 }
	
	}
		 //System.out.println(ch);
		 System.out.println(vowelscount);
		 System.out.println(a.toString());
	}
}
