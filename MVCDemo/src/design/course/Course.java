package design.course;

/**
 * 
 * @author shivj
 *
 *Model class of MVC design
 */


public class Course {
	
	private int id;
	
	private String coursename;
	
	private String coursecategory;
	

	public Course(int id, String coursename, String coursecategory) {
		this.id = id;
		this.coursename = coursename;
		this.coursecategory = coursecategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursecategory() {
		return coursecategory;
	}

	public void setCoursecategory(String coursecategory) {
		this.coursecategory = coursecategory;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", coursecategory=" + coursecategory + "]";
	}


}
