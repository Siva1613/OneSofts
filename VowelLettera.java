package forloop;

public class VowelLettera {
	public static void main(String args []) {
		String[] words= {"sk","siva","bharani","gobi"};
		for(int i=0;i<words.length;i++) {
			if(words[i].contains("a")||words[i].contains("e")||words[i].contains("i")||words[i].contains("o")||words[i].contains("u"))
			{
				System.out.println(words[i]);
			}
		}
	}

}
