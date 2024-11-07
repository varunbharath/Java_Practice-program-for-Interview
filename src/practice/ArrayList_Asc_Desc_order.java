package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Asc_Desc_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Double> a=new ArrayList<Double>();
		 a.add(234.4567);
		 a.add(0987.45);
		 a.add(347.876);
		 System.out.println(a);
		 Collections.sort(a);
		 System.out.println(a);
		 Collections.sort(a, Collections.reverseOrder());
		
		 System.out.println(a);
	}

}
