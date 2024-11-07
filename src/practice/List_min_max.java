package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_min_max {
	 public void mini() {
		 List<Double>a=new ArrayList();
		 a.add(23.65);
		 a.add(98.67);
		 a.add(45.98);
		 System.out.println(a);
		double b =Collections.min(a);
		System.out.println(b);
	 }
	 // max
	  static void  maxi() {
		  List<Double> d= new ArrayList<Double>();
		  d.add(345.4567);
		  d.add(879.567);
		  d.add(123.5678);
		  System.out.println(d);
		double n  =Collections.max(d);
		System.out.println(n);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List_min_max obj=new List_min_max();
obj.mini();
maxi();
	}

}
