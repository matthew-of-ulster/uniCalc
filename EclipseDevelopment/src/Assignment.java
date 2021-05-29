
public class Assignment {
	
	private String assignmentName;
	private int score;
	private int total;
	private double grade;
	private int weighting;
	
	public Assignment(String assignmentName, int score, int total, double grade, int weighting) {
		this.assignmentName = assignmentName;
		this.score = score;
		this.total = total;
		this.grade = grade;
		this.weighting = weighting;	
	}
	
	//ParamterLess Assignment Constructor
	public Assignment() {
		assignmentName = "";
		score = 0;
		total = 0;
		grade = 0;
		weighting = 0;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getWeighting() {
		return weighting;
	}

	public void setWeighting(int weighting) {
		this.weighting = weighting;
	}
}