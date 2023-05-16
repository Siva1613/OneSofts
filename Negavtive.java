package forloop;

public class Negavtive {
	public static void main(String args[]) {
		int[] nums= {25,-52,85,-25};
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<0) {
				System.out.println(nums[i]+" is negative number");
				count=count+1;
				
			}
		}
		System.out.println(count);
	}

}



