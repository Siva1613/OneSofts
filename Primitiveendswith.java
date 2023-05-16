package forloop;

public class Primitiveendswith {
	public static void main(String args []) {
		String[] words= {"siva","bharani","gobi"};
		for(int i=0;i<words.length;i++) {
			if(words[i].endsWith("a")) {
				System.out.println(words[i]);
			}
		}
		
		
	}
}
