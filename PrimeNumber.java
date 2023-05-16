package forloop;

public class PrimeNumber {
	public static void main(String args []) {
		int num=7;
		boolean isPrime=true;
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
			
			}
		if(isPrime==true) {
			System.out.println("Prime");
		}
			else {
				System.out.println("not prime");
			}
		}
	}


