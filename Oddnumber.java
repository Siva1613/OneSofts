package forloop;

public class Oddnumber {
	public static void main(String args[]) {
		int[] odds= {4,8,5,87,50,25};
		for(int i=0;i<odds.length;i++) {
			if(odds[i]%2!=0) {
				System.out.println(odds[i]);
			}
		}
	}

}
