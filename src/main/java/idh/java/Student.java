package idh.java;

public class Student {
	private String name;
	private int id;

	static int lastId = 7000001;

	public Student(String name) {
		this.id = lastId++;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " (Id: " + this.id + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	
}
