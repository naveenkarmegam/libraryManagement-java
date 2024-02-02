package libraryManagement;

public class User {
	String name;
	int age;
	String department;
	public User(String name,int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public String toString() {
		return "User: " + name + "Age: " + age + "Department: " + department; 
	}
}
