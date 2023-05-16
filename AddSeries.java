package forloop;

public class AddSeries {
	public static void main(String args[]) {
		int total1=0;
		int total2=0;
		for(int i=0;i<=5;i++) {
			total1=total1+i;
			total2=total1+total2;
			
		}
		System.out.println(total2);
	}

}
