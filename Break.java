package forloop;

public class Break {
	public static void main(String args[]) {
		for(int i=1;i<=100;i++) {
			if(i%54==0)
			{
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
