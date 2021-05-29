import java.util.Arrays;

public class Module {
	private int weight;
	private String name;
	private Assignment[] aArray;
	private int assignmentTotal;
	private double percent;
	
	public Module(String name, int weight, double percent, Assignment[] aArray, int assignmentTotal) {
		this.setName(name);
		this.setWeight(weight);
		this.setPercent(percent);
		this.setaArray(aArray);
		this.setAssignmentTotal(assignmentTotal);
	}
	
	public Module(Assignment[] aArray) {
		name = "";
		weight = 0;
		percent = 0;
		this.setaArray(aArray);
		assignmentTotal = 0;
	}
	
	
	public String listAssignments() {
		String returnString = "";
		for(int i=0;i<getAssignmentsEntered();i++) {
			returnString += aArray[i].getAssignmentName() + " ";
		}
		if (returnString.equals("")){
			returnString = "No Assignments to show";
		}
		return returnString;
	}
	
	
	
	public int getAssignmentsEntered() {
		return aArray.length;
	}
	public void addAssignment(Assignment a) {
		Assignment[] temp = Arrays.copyOf(aArray, aArray.length + 1);
		temp[temp.length-1] = a;
		aArray=temp;
	}
	public void delLastAssignment() {
		aArray = Arrays.copyOf(aArray, aArray.length -1);
	}
	
	
	
	
	
	
	
	
	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Assignment[] getaArray() {
		return aArray;
	}

	public void setaArray(Assignment[] aArray) {
		this.aArray = aArray;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public int getAssignmentTotal() {
		return assignmentTotal;
	}

	public void setAssignmentTotal(int assignmentTotal) {
		this.assignmentTotal = assignmentTotal;
	}
}
