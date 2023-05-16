package forloop;

public class AgesBackward {
	public static void main(String args [] ) {
		int[] ages=new int[8];
		ages[0]=28;
		ages[1]=27;
		ages[2]=25;
		ages[3]=25;
		ages[4]=26;
		ages[5]=27;
		ages[6]=25;
		ages[7]=23;
		for(int i=ages.length-1;i>=0;i--) {
			System.out.println(ages[i]);
			
		}
	}
}
