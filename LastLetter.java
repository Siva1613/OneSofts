package forloop;

public class LastLetter {
	public static void main(String args[]) {
		String[] words= {"siva","bharani","gokul"};
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i].charAt(words[i].length()-1));
		}

}}
