package printingpatternnew_3;
//assign2-7
public class Hourglass_model {

	public static void main(String[] args) {
		int n=7;
for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print(" ");		
			}
			
			for(int j=7;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
for(int i=1;i<=n;i++) {
	for(int j=n-1;j>=i;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" *");	
	}
	System.out.println();
}
	}
}
