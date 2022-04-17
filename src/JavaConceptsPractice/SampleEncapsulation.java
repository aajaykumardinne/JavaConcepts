package JavaConceptsPractice;

public class SampleEncapsulation {

	private int studentid;
	private String studentName;
	private int studentage;

	public static void main(String[] args) {
		SampleEncapsulation sp = new SampleEncapsulation();
		sp.setStudentName("Aajay");
		
		System.out.println("Student name is: " +sp.getStudentName());

	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

}
