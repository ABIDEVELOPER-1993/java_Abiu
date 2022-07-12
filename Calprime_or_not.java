package findingprimeno;
//assign2-3
public class Calprime_or_not {

	public static void main(String[] args) {
		System.out.println("prime nos upto 20..");
		for(int i=0;i<=20;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(+i);
			}
			}
		}
		}  
	
	
	

