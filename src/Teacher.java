
public class Teacher extends Person{
	
	private int baseSalary;
	private int experienceYears;
	private int activeHoursPerWeek;

	public Teacher(String firstName, String lastName, int baseSalary, int experienceYears, int activeHoursPerWeek) {
		super(firstName, lastName);
		this.baseSalary = baseSalary;
		this.experienceYears = experienceYears;
		this.activeHoursPerWeek = activeHoursPerWeek;
	}
		
	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public int getActiveHoursPerWeek() {
		return activeHoursPerWeek;
	}

	public void setActiveHoursPerWeek(int activeHoursPerWeek) {
		this.activeHoursPerWeek = activeHoursPerWeek;
	}

	public int salaryPartialTime() {
		return 0;
	}
	
	public String toString() {
        String s="";
        s+=" \n Teacher First Name = "+this.getFirstName();
        s+=" \n Teacher Last Name = "+this.getLastName();
        s+=" \n Base Salary = "+this.baseSalary;
        s+=" \n Experience's Years = "+this.experienceYears;
        s+=" \n Active Hours per Week = "+this.activeHoursPerWeek;
        return s;
	}
}
