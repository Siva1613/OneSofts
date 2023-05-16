package forloop;

public class PrimitiveStatrs {
	public static void main(String args []) {
		String[] words= {"siva","bharani","gobi"};
		for(int i=0;i<words.length;i++) {
			if(words[i].startsWith("b")) {
				System.out.println(words[i]);
			}
		}

}}
