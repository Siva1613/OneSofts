package forloop;

public class UpperWords {
	public static void main(String args []) {
		String[] words= {"siVA","BHARANI","gobi"};
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(words[i].toLowerCase())) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
	

}
