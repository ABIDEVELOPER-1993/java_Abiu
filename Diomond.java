package printingpattern_new2;

public class Diomond {
//assign2-6
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print(" ");		
			}
			
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
