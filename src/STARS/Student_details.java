package stars;
public class Student_details extends User {

	public String name;
	public String matric_num;
	public String gender;
	public int AU;
	public String nationality;
	public String[] CourseRegistered;
	
	public Student_details(String username, String password, String name, String matric_num, String gender, int AU, String nationality, String[] CourseRegistered)
	{
		super(username, password);
		this.name = name;
		this.matric_num = matric_num;
		this.gender = gender;
		this.AU = AU;
		this.nationality = nationality;
		this.CourseRegistered = CourseRegistered;
	}
	public String getname() {
		return name;
	}
	public String getmatric_num() {
		return matric_num;
	}
	public String getgender() {
		return gender;
	}
	public int getAU() {
		return AU;
	}
	public String getnationality() {
		return nationality;
	}

	public String[] getCourseRegistered() {
		return CourseRegistered;
	}
}