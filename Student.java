package week3.day1assignment;

public class Student extends Department {
	
	public String returnStudentDetails(String A) {
		return(A);
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.collageName("sastra university"));
		System.out.println(s.collegeCode(1699));
		System.out.println(s.collegeRank(01));
		System.out.println(s.deptName("Chemical Engg"));
		System.out.println(s.returnStudentDetails("Prasanth Chemical Engg 114002034"));
		
		
		

	}

}
