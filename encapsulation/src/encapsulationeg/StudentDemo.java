package encapsulationeg;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setSid(10);
		s.setSname("Ammu");
		s.setAvg(95.3f);
		System.out.println("Student ID :" + s.getSid());
		System.out.println("Student Name :" + s.getSname());
		System.out.println("Student avg :" + s.getAvg());
		
		System.out.println(s);
		
		
		

	}

}
