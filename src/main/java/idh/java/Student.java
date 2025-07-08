package idh.java;

public class Student {
    String name;
    int id;
    
    static int lastId;

    public Student(String name) {
	this.id = lastId++;
	this.name = name;
    }

    @Override
    public String toString() {
	return this.name + " (Id: " + this.id + ")";
    }

    public static void main(String[] args) {
	System.out.println(Student.lastId);
	System.out.println(Student.class);
	
	Class<?> cls = Student.class;

    }
}
