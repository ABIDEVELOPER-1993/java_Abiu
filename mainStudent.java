package constructorsample;

public class mainStudent {

	public static void main(String[] args) {
		Student s1= new Student("ABI",101,25);
		Student s2= new Student("BALU",105,27);
		s1.display();
		s1.result_status();
		s2.display();
		s2.result_status();
	}

}
