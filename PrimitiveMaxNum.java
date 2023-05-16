package forloop;

public class PrimitiveMaxNum {
	public static void main(String args []) {
		int[] nums= {15,15,28,57,48,15};
		
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
