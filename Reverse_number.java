package reverseofno;
//assign2-9
public class Reverse_number {

	public static void main(String[] args) {
		int num=12345;
		int r=0;
		int sum=0;
		int temp;
		temp=num;
		while(num>0){    
			   r=num%10;  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }    
		temp=sum;
		System.out.println("reverse of 12345 is"+" "+sum);
		}
	}

