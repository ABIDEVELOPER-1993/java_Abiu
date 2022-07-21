package constructorsample;
import java.util.*;
public class Student {
	String name;
	int rno;
	int age;

	Student(String called,int id,int dob){
		this.name=called;
		this.rno=id;
		this.age=dob;
	}
	public  void display() {
		System.out.println("name "+this.name);
		System.out.println("rollno "+this.rno);
		System.out.println("age "+this.age);	
	}
	public void result_status() {
		System.out.println("enter you marks scored..");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=50) {
		System.out.println("the result status of "+this.name+ "pass" );
		}
		else
		System.out.println("the result status of "+this.name + "fail");
	}
	}

