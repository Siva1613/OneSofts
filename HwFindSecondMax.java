package forloop;

public class HwFindSecondMax {
	public static void main(String args [] )
	{
		int[] nums= {25,45,85,88,95,71,20,53};
		int a=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=a)
			{
				a=nums[i];
			}
			
			
		}
	System.out.println(a);
	}

}
