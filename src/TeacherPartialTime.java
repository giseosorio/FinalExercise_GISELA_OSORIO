
public class TeacherPartialTime extends Teacher{

	public TeacherPartialTime(String firstName, String lastName, int baseSalary, int experienceYears, int activeHoursPerWeek) {
		super(firstName, lastName, baseSalary, experienceYears, activeHoursPerWeek);
	}

	public int salaryPartialTime(int baseSalary, int activeHoursPerWeek) {
		return baseSalary * activeHoursPerWeek;
	}
	
}
