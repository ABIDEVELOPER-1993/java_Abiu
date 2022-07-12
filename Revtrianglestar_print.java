package printingpatternnew_1;
//assign 2-5
public class Revtrianglestar_print {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print(" ");		
			}
			
			for(int j=n-1;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
