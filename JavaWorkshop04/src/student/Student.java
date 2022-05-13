package student;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg () {
		double sum = korean+english+math+science;
		double avg = sum /4;
		return avg;
	}
	
	public String getGrade () {
		int avg = (int) getAvg();
		if(avg>=90) return "A학점";
		else if(avg>=70) return "B학점";
		else if(avg>=50) return "C학점";
		else if(avg>=30) return "D학점";
		else return "F학점";
	}
}
