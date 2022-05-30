package test;

public class Course {

	private int courseNo;
	private String courseName;
	private int recruitmentNumber;
	private int applyNumber;
	private String startDate;
	private boolean courseStart;
	
	public Course() {}

	public Course(int courseNo, String courseName, int recruitmentNumber, int applyNumber, String startDate,
			boolean courseStart) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.recruitmentNumber = recruitmentNumber;
		this.applyNumber = applyNumber;
		this.startDate = startDate;
		this.courseStart = courseStart;
	}

	public int getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRecruitmentNumber() {
		return recruitmentNumber;
	}

	public void setRecruitmentNumber(int recruitmentNumber) {
		this.recruitmentNumber = recruitmentNumber;
	}

	public int getApplyNumber() {
		return applyNumber;
	}

	public void setApplyNumber(int applyNumber) {
		this.applyNumber = applyNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public boolean isCourseStart() {
		return courseStart;
	}

	public void setCourseStart(boolean courseStart) {
		this.courseStart = courseStart;
	}
	
}
