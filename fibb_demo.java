package fibbonaci_series;
public class fibb_demo {
//assign2-8
	public static void main(String[] args) {	
		int count=30;
		int a=0;
		int b=1;
		int sum;
		System.out.println("fibbonaci series upto..:"+count);
		for(int i=2;i<=count;i++) {
			sum=a+b;
			System.out.println(+sum);
			a=b;
			b=sum;
		}

	}

}
