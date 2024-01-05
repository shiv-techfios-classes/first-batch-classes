package course.launch;

import design.course.Course;
import design.course.CourseController;
import design.course.CourseView;

public class CourseDemo {

	public static void main(String[] args) {
		
		CourseView view =  new CourseView();
		
		Course courseModel = retrieveCourseFromDatabase();
		
		CourseController controller = new CourseController(courseModel, view);
		
		controller.updateView();
		
		controller.setCourseName("SpringBoot Development Along with Oracle as Database");
		
		controller.updateView();
	

	}

	private static Course retrieveCourseFromDatabase() {
		
		Course course1 = new Course(1, "Core Java", "Coding & Practice");
		
//		Course course2 = new Course(1, "Core Java", "Coding & Practice");
		
		return course1;
	}
	
	
	

}
