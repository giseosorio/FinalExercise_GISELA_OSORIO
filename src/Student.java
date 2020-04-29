
public class Student extends Person{

	private String id;
	private int age;
	
	public Student(String firstName, String lastName, String id, int age) {
		super(firstName, lastName);
		this.id = id;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	public String toString() {
        String s="";
        s+=" \n Student First Name = "+this.getFirstName();
        s+=" \n Student Last Name = "+this.getLastName();
        s+=" \n Student id = "+this.id;
        s+=" \n Student age = "+this.age;
        return s;
	}	
}
