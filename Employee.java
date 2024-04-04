public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    // Getter and Setter methods
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void salaryRaise(int percent) {
        salary += (salary * percent) / 100;
    }

    
    public String toString() {
    	System.out.println("Before salary raise:");
        return "Employee ID: " + ID + ", Name: " + firstName + " " + lastName + ", Salary: " + salary;
    }

    public static void main(String[] args) {
    	
    	// Create an emp object
    	        Employee emp = new Employee();
        emp.setID(7);
        emp.setFirstName("Dharaneesh");
        emp.setLastName("kumar");
        emp.setSalary(85000);

        System.out.println(emp.toString());

        emp.salaryRaise(10);
        System.out.println("");
        System.out.println("After salary raise:");
        System.out.println("");
        System.out.println(emp.toString());
    }
}
/*
 * OUTPUT
 Before salary raise:
Employee ID: 7, Name: Dharaneesh kumar, Salary: 85000

After salary raise:

Before salary raise:
Employee ID: 7, Name: Dharaneesh kumar, Salary: 93500
 */
