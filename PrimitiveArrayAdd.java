package forloop;

public class PrimitiveArrayAdd {
	public static void main(String args[]) {
		int[] nums= {10,40,52,52,15};
		int add=0;
		for(int i=0;i<nums.length;i++) {
			add=add+nums[i];
			
		}
		System.out.println(add);
	}

}
