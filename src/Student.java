
public class Student extends Person {
	/**
	 * 
	 
	   A student is represented by the name, birth year, and major.
	   You must enter the class name, instance variable(s), and constructor below
	   
	   /**
	    
	    */
	String major;
	
	
	public Student(String name, int yearOfBirth, String major) {
		super(name, yearOfBirth);
		
		setMajor(major);
	
		
		
		
		}
	
	private void setMajor(String major) {
		this.major = major;
		
	}
	public String getMajor() {
		return major;
	}
	
	



	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	   }


}
