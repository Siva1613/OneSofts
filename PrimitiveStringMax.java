package forloop;

public class PrimitiveStringMax {
	public static void main(String args []) {
		String[] words= {"siva","kumar","bharani","gobi"};
		String temp="";
		int b=words[0].length();
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=b) {
				b=words[i].length();
				temp=words[i];
			}
		}
		System.out.println(temp);
	}

}

