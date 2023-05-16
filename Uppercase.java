package forloop;

public class Uppercase {
	public static void main(String args []) {
		String word="TurKeY";
		String a=word.toUpperCase();
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==a.charAt(i)) {
				System.out.println(word.charAt(i));
				
				
			}
		}
	}

}
