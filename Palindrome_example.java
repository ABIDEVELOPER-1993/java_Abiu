package palindromeofno;
import java.util.*;
public class Palindrome_example {
//assign2-10
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a no to check whether its a palindrome..");
		  int n=scan.nextInt();
			  int r,sum=0,temp;    
			  temp=n;    
			  while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println(+temp + "is a palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			  

	}



