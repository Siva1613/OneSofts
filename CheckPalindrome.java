package forloop;

public class CheckPalindrome {
	public static void main(String args []) {
		String a="madam";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
				}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("it is Palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
			
		}

}
