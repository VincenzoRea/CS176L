
public class Instructor extends Person {
	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/
int salary;
	
	public Instructor(String name, int yearOfBirth, int salary) {
		super(name, yearOfBirth);
		setSalary(salary);
		
		
		
	}
	private void setSalary(int salary) {
		this.salary = salary;
		
	}
	public int getSalary() {
		return salary;
	}
	




	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }


}
