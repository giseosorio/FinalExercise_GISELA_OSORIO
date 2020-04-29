
public class TeacherFullTime extends Teacher{
	
	public TeacherFullTime(String firstName, String lastName, int baseSalary, int experienceYears, int activeHoursPerWeek) {
		super(firstName, lastName, baseSalary, experienceYears, activeHoursPerWeek);
	}

	public float salaryFullRime (int baseSalary, int experienceYears) {
		return (float) (baseSalary * (experienceYears * (1.10)));
	}
}
