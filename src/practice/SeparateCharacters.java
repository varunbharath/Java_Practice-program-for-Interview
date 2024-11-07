package practice;

public class SeparateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Storedvalue="bharath123@GM((*^";
		StringBuilder Letters=new StringBuilder();
		StringBuilder numbers=new StringBuilder();
		StringBuilder Specialcharacters=new StringBuilder();
		
		  // Loop to categorize characters
		
		for(int i=0;i<Storedvalue.length();i++) {
			char ch=Storedvalue.charAt(i);
			if(Character.isLetter(ch)) {
				Letters.append(ch);}
				else if (Character.isDigit(ch)) {
					numbers.append(ch);}
				else {
					Specialcharacters.append(ch);
					
					
				}
			}
		System.out.println("Letters: " + Letters.toString());
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Special Characters: " + Specialcharacters.toString());
	
		}
		

	

}
