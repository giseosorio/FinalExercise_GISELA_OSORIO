import java.util.ArrayList;
import java.util.Scanner;

public class University {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option;
		int printClassStudentTeacher;
		String studentFirstName;
		String studentLastName;
		String studentId;
		int studentAge;
		int subjectSelectedByStudent; 
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
				
		//Teachers' List
 		Teacher teacherPartialTime = new Teacher("Alejandro", "Osorio", 1000, 10, 25);
		Teacher teacherFullTime = new Teacher("Alejandro", "Osorio", 2000, 15, 30);
		
		teacherList.add(teacherPartialTime);
		teacherList.add(teacherFullTime);
			
		//Student's List
		Student student = new Student("Alejandro", "Osorio", "id0", 20); 
		Student student1 = new Student("Leonel", "Duque", "id1", 21);
		Student student2 = new Student("Martha", "Restrepo", "id2", 22);
		Student student3 = new Student("Carlos", "Barrera", "id3", 23);
		Student student4 = new Student("Carolina", "Alzate", "id4", 24);
		Student student5 = new Student("Gloria", "Alzate", "id5", 25);
		Student student6 = new Student("Paola", "Lopez", "id6", 26);
		
				
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		
		/* for (int i = 0; i <= studentList.size() - 1; i++) {
			 	System.out.println("---------------------------------------");
	            System.out.println(studentList.get(i).toString());
	            System.out.println("---------------------------------------");
		 }*/
				
		//Subject's List
		Subject subject = new Subject("Programming 1", "LP-201", studentList, teacherFullTime);
		Subject subject1 = new Subject("Programming 2", "LP-202", studentList, teacherPartialTime);
		Subject subject2 = new Subject("Programming 3", "LP-203", studentList, teacherFullTime);
		Subject subject3 = new Subject("Programming 4", "LP-204", studentList, teacherPartialTime);
		
		subjectList.add(subject);
		subjectList.add(subject1);
		subjectList.add(subject2);
		subjectList.add(subject3);
		
		System.out.println("-----------------------------------");
		System.out.println("Select an option:");
		System.out.println("1. Print all the professors with its data");
		System.out.println("2. Print all the classes and a submenu to select a class in order to print the class data including its teacher and students");
		System.out.println("3. Create a new student and add it to an existing class");
		System.out.println("4. Create a new class and add a teacher, students and its relevant data");
		System.out.println("5. Create a new class and add a teacher, students and its relevant data");
		System.out.println("6. Exit");
		System.out.println("-----------------------------------");
		
		option = scanner.nextInt();
				
		switch (option) {
        case 1:
        	for (int i = 0; i <= teacherList.size() - 1; i++) {
			 	System.out.println("---------------------------------------");
	            System.out.println(teacherList.get(i).toString());
	            System.out.println("---------------------------------------");
		 }
            break;
        case 2:
        	System.out.println("Select a class:");
        	System.out.println("1. Programming 1");
        	System.out.println("2. Programming 2");
        	System.out.println("3. Programming 3");
        	System.out.println("4. Programming 4");
        	
        	printClassStudentTeacher = scanner.nextInt();
        	
        	if(printClassStudentTeacher == 1) {
        		System.out.println("---------------------------------------");
       		 	System.out.print(subject);
       		 	System.out.println("\n---------------------------------------");
        	}else if (printClassStudentTeacher == 2) {
        		System.out.println("---------------------------------------");
       			System.out.println(subject1);
       			System.out.println("\n---------------------------------------");
			}else if (printClassStudentTeacher == 3) {
				System.out.println("---------------------------------------");
				System.out.println(subject2);
				System.out.println("\n---------------------------------------");
			}else {
				System.out.println("\n---------------------------------------");
				System.out.println(subject3);
				System.out.println("---------------------------------------");
			}
        	
            break;
        case 3:
        	System.out.println("Enter the Student First Name:");
        	studentFirstName = scanner.next();
        	System.out.println("Enter the Student Last Name:");
        	studentLastName = scanner.next();
        	System.out.println("Enter the Student Id:");
        	studentId = scanner.next();
        	System.out.println("Enter the Student Age:");
        	studentAge = scanner.nextInt();
        	Student student7 = new Student(studentFirstName, studentLastName, studentId, studentAge);
        	System.out.println(student7);
        	
        	System.out.println("Select a class:");
        	System.out.println("1. Programming 1");
        	System.out.println("2. Programming 2");
        	System.out.println("3. Programming 3");
        	System.out.println("4. Programming 4");
        	
        	subjectSelectedByStudent = scanner.nextInt();
        	
        	/*if(subjectSelectedByStudent == 1) {
        		 subject ("Programming 1", "LP-201", studentList.set(6, student7), teacherFullTime);
        	}else if (subjectSelectedByStudent == 2) {
				
			}else if (subjectSelectedByStudent == 3) {
				
			}else {
				
			}*/
        	
            break;
        case 4:
        	
        	break;
        case 5:
        	
        	break;
        case 6:
        	System.out.println("-----------------------------------");
    		System.out.println("You left. Thank you for using the service!");
    		System.out.println("-----------------------------------");
        	break;
		}
		
				
	}

}
