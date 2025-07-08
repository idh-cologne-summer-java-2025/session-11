package idh.java;

import java.util.function.Predicate;

public class CourseFilter implements Predicate<Student> {
    Course course;

    public CourseFilter(Course course) {
	this.course = course;
    }

    @Override
    public boolean test(Student t) {
	return course.getMembers().contains(t);
    }

}
