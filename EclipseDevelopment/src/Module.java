
public class Module {
	private int weight;
	private String name;
	private Assignment[] aArray;
	private double percent;
	
	public Module(String name, int weight, double percent, Assignment[] aArray) {
		this.setName(name);
		this.setWeight(weight);
		this.setPercent(percent);
		this.setaArray(aArray);
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
}
