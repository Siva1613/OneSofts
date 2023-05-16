package forloop;

public class NuturalNumber {
	public static void main(String args[]) {
		int[] nuts= {4,8,5,0,87,0,50,25};
		for(int i=0;i<nuts.length;i++) {
			if(nuts[i]==0) {
				System.out.println(nuts[i]);
			}
		}
	}

}



