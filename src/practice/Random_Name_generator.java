package practice;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Random_Name_generator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale local=new Locale("eng","INDIA");
		Faker fake=new Faker (local);
		
		String a=fake.name().fullName();
		int value=fake.number().randomDigitNotZero();
		String Address=fake.address().fullAddress();
		System.out.println(a);System.out.println(Address);System.out.println(value);

	}

}
