package forloop;

public class VoterAge {
	public static void main(String args [] ) {
		int[] ages= {28,24,25,28,17,16,24,14};
		for(int i=0;i<ages.length;i++)
		{
			if(ages[i]>=18) {
				System.out.println(ages[i]+" Eligible to Vote");
			}
		}
	}

}
