package section05;

public class Student {
	private String name;
	private int english;
	private int math;
	private String sex;
	private int score;

	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public int getScore() {
		return this.score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}