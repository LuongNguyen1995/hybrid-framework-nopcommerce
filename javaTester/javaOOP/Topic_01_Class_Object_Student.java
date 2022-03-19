package javaOOP;

public class Topic_01_Class_Object_Student {

	private int studentID;
	private String studentName;
	private float knowledgePoint;
	private float practicePoint;
	
	public Topic_01_Class_Object_Student(int maSinhVien, String hoTen, float diemLyThuyet, float diemThucHanh) {
		this.studentID = maSinhVien;
		this.studentName = hoTen;
		this.knowledgePoint = diemLyThuyet;
		this.practicePoint = diemThucHanh;
	}
	

	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public float getKnowledgePoint() {
		return knowledgePoint;
	}


	public void setKnowledgePoint(float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}


	public float getPracticePoint() {
		return practicePoint;
	}


	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}


	public float getAveragePoint() {
		return ((this.knowledgePoint + this.practicePoint*2)/3);
	}

	public void showStudentInfor() {
		System.out.println("*********************************");
		System.out.println("Ma sinh vien : "+getStudentID());
		System.out.println("Ho ten sinh vien : "+getStudentName());
		System.out.println("Diem ly thuyet : "+getKnowledgePoint());
		System.out.println("Diem thuc hanh : "+getPracticePoint());
		System.out.println("Diem trung binh : "+getAveragePoint());
	}
	public static void main(String[] args) {
		Topic_01_Class_Object_Student sv1 = new Topic_01_Class_Object_Student(10, "Nguyen Dinh Luong", 7.5f, 6f);
		sv1.showStudentInfor();
		Topic_01_Class_Object_Student sv2 = new Topic_01_Class_Object_Student(9, "Nguyen Van Truong", 7.0f, 6.9f);
		sv2.showStudentInfor();
		Topic_01_Class_Object_Student sv3 = new Topic_01_Class_Object_Student(8, "Tran Van Toan", 8f, 9f);
		sv3.showStudentInfor();
		
		
	}

}
