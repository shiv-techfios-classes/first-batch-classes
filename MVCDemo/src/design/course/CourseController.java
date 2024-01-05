package design.course;

public class CourseController {
	
	private Course model;
	
	private CourseView courseView;
	
	
	public CourseController(Course model, CourseView view) {
		
		this.model=model;
		
		this.courseView = view;
	}
	
	public void setCourseName(String name) {
		
		model.setCoursename(name);
	}
	
	public void setCourseId(int id) {
		
		model.setId(id);;
	}
	
	public void setCourseCategory(String category) {
		
		model.setCoursecategory(category);
	}
	
	public int getCourseId() {
		return model.getId();
	}
	
	public String getCourseCategory() {
		
		return model.getCoursecategory();
	}
	
	public String getCourseName() {
		
		return model.getCoursename();
	}
	
	public void updateView() {
		
		courseView.printCourseDetails(model);
	}

}
