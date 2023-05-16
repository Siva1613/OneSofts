package forloop;

public class HwFindMinimumWord {
	public static void main(String args []) {
		String[] a= {"siva","kumar","bharani","gobi"};
		int b=a[0].length();
		String add="";
		String rev="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<=b) {
				b=a[i].length();
				add=a[i];
				
				
			}
		}
		System.out.println(add);
		for(int i=add.length()-1;i>=0;i--) {
			rev=rev+add.charAt(i);
			
			
		}
		System.out.println(rev);
		
	}
}

