package week3.day1assignment;

public class Students {
public void getStudentInfo(String Name) {
	System.out.println(Name);
}

public void getStudentInfo(String Name, long id, String Email, String Phone) {
	System.out.print(Name);
	System.out.print(id);
	System.out.print(Email);
	System.out.print(Phone);
}

public static void main(String[] args) {
  Students s=new Students();
  s.getStudentInfo("Prasanth");
  s.getStudentInfo("Prasanth", 114002034, "prasanthsnkr@gmail.com", "7502687078");
}
}
