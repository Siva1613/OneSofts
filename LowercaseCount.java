package forloop;

public class LowercaseCount {
	public static void main(String args []) {
		int count=0;
		String a="appLE";
		String b=a.toLowerCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i))
			{
				count=count+1;
			}
					}
		System.out.println("lower case count "+count);
		
	}

}
