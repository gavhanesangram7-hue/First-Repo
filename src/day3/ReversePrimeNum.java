package day3;

public class ReversePrimeNum {
	
	public static void main(String[] args) {
		
		
		int n = 17;
		int primecount = 0;
		
		
		for(int i =17;i>=2;i--) {
			
			int count = 0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			
			
			if(count==2) {
				System.out.println(i);
				primecount++;
			}
			if(primecount==3) {
				break;
			}
		}
		
	}

}
