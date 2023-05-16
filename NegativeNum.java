package forloop;

public class NegativeNum {
	public static void main(String args[]) {
		int[] evens= {4,8,5,87,50,25};
		for(int i=0;i<evens.length;i++) {
			if(evens[i]%2==0) {
				System.out.println(evens[i]);
			}
		}
	}

}


