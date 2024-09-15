package week1.day3;

public class Student {

	public void Reading() {
		System.out.println("Reading");
	}
	public void writing() {
		System.out.println("take the exam");
	}

	public void playing() {
		System.out.println("playing");
	}

	
	
	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.Reading();
		obj.writing();
		obj.playing();
	}

}
