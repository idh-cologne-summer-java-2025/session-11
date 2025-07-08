package idh.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Course {
    String name;

    Set<Student> members = new HashSet<Student>();
    Map<Student, Integer> points = new HashMap<Student, Integer>();

    public Course(String name) {
	this.name = name;
    }
   
    public void addMember(Student s) {
	this.members.add(s);
    }

    public int getPoints(Student s) {
	return points.get(s);
    }

    public void addPoints(Student s, int p) {
	this.points.put(s, this.points.getOrDefault(s, 0) + p);
    }

    public void setPoints(Student s, int p) {
	this.points.put(s, p);
    }

    public Set<Student> getMembers() {
	return members;
    }
}
