
public class Person {
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
	setName(name);
	setYearOfBirth(yearOfBirth);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }



	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + yearOfBirth + "]";
	   }


}
