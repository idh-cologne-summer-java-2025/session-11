package idh.java;

import static java.lang.System.out;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import idh.java.util.NameGenerator;

public class Main {

    public static void main(String[] args) throws IOException {
	NameGenerator ng = new NameGenerator();
	Random random = new Random(0);

	// Set of all students
	Set<Student> allStudents = new HashSet<Student>();

	// Two courses
	Course java2 = new Course("Java 2");
	Course bit = new Course("Basisinformationstechnologie");

	// Create students with random names
	for (int i = 0; i < 1000; i++) {
	    Student s = new Student(ng.getName());
	    allStudents.add(s);

	    // assign 20% of the students to java2
	    if (random.nextDouble() < 0.2) {
		java2.addMember(s);
		// assign random points
		java2.setPoints(s, random.nextInt(100));
	    }

	    // assign 20% of the students to bit
	    if (random.nextDouble() < 0.2) {
		bit.addMember(s);
		// assign random points
		bit.setPoints(s, random.nextInt(100));
	    }
	}
	// System.out.println(allStudents);

	// Task: Filter students based on
	// - the course they take
	// - their name (e.g., only names starting with S or T)
	// - their points
	// - whether they take part in two courses
	
	// Predicate<Student> test = t -> java2.getMembers().contains(t);

	Iterator<Integer> iterator = allStudents.stream().filter(t -> java2.getMembers().contains(t)).map(t -> t.id)
		.iterator();

	while (iterator.hasNext()) {

	    out.println(iterator.next());

	}
    }


}
