
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLog students = new StringLog("Students", 3);
		
		students.add("Sam");
		students.add("Haseeb");
		students.add("Thomas");
		
		System.out.println(students);
		System.out.println(students.contains("Thomas"));
		System.out.println(students.contains("aeiou"));
	}

}
