package design.course;

public class CourseView {
	
	public void printCourseDetails(Course course) {
		
		System.out.println("Displaying course View:");
		
		System.out.println("Course Name:" + course.getCoursename());
		
		System.out.println("Course ID:" + course.getId());
		
		System.out.println("Course Category:" + course.getCoursecategory());
		
	}

}
