public class Student_details {

	public String name;
	public String matric_num;
	public String gender;
	public int AU;
	public String nationality;
	public String[] CourseRegistered;
	
	public Student_details(String name, String matric_num, String gender, int AU, String nationality, String[] CourseRegistered)
	{
		
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
	public void setAU(int a) {
		AU = a;
		
	}
	public String getnationality() {
		return nationality;
	}

	public String[] getCourseRegistered() {
		return CourseRegistered;
		
		
	}
}
