package stars;


public class Index {
	private String Name;
	private int Vacancy;
	private ArrayList<String> StudentsRegistered;
	
	public Index(String name,int vacancy) {
		Name=name;
		Vacancy=vacancy;
		StudentsRegistered= new ArrayList<String>();
	}
	
	public void PrintStudentList() {
		for (int i=0;i<StudentsRegistered.size();i++) {
			System.out.println(StudentsRegistered[i]);
		}
	}
	
	public Boolean CheckVacancy() {
		if (Vacancy>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void SetIndex(String newindex) {
		Name = newindex;
	}
	
	public String GetIndex() {
		return Name;
	}
	
	public void SetVacancy(int newvacancy) {
		Vacancy=newvacancy;
	}
	
	public int GetVacancy() {
		return Vacancy;
	}
}
