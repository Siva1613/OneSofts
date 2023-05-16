package forloop;

public class ConsonendWords {
	public static void main(String args []) {
		String word="india";
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
				
		}else 
		{
			count++;
		}
		
		}
		System.out.println(count);

}
}
