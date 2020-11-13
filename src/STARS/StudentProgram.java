public class StudentProgram {
	private Student currentUser;
	
	public StudentProgram(Student currentUser) {
		this.currentUser=currentUser;
	}
	
	public void Add(String course) {
		currentUser.getCourseRegistered().add(course);
	}
	
	public void Drop(String course) {
		currentUser.getCourseRegistered().remove(course);
	}
	
	public void CheckAndPrintRegistered() {
		for (int i=0;i<currentUser.getCourseRegistered().length;i++) {
			//use course id to print course info
			continue;
		}
	}
	
	public void CheckVacancies(int index) {
		// use course index to print vacancy
		continue;
	}
	
	public void changeCourseIndex(int oldindex, int newindex) {
		currentUser.getCourseRegistered().remove(oldindex);
		currentUser.getCourseRegistered().add(newindex);
		continue;
	}
	
	public void SwapIndex(int index, Student student) {
		continue;
	}
}
