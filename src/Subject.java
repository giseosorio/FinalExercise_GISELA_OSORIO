import java.util.ArrayList;

public class Subject {

	private String subjectName;
	private String subjectClassroom;
	private ArrayList<Student> student = new ArrayList<Student>();
	private Teacher teacher;
	
	public Subject(String subjectName, String subjectClassroom, ArrayList<Student> student, Teacher teacher) {
		this.subjectName = subjectName;
		this.subjectClassroom = subjectClassroom;
		this.student = student; 
		this.teacher = teacher; 
	}
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectClassroom() {
		return subjectClassroom;
	}

	public void setSubjectClassroom(String subjectClassroom) {
		this.subjectClassroom = subjectClassroom;
	}
		
	public ArrayList<Student> getStudent() {
		return student;
	}
	
	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public String toString() {
        String s="";
        s+=" Subject Name = "+this.subjectName;
        s+=" \n Subject Classroom = "+this.subjectClassroom;
        s+=" \n Student = "+this.student;
        s+=" \n Teacher = "+this.teacher;
        return s;
	}

	public int size() {
		return 0;
	}

	public Object get(int i) {
		return null;
	}
}
