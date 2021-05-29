
public class Module {
	private int weight;
	private String name;
	private Assignment[] aArray;
	private double percent;
	
	public Module(String name, int weight, double percent, Assignment[] aArray) {
		this.name = name;
		this.weight = weight;
		this.percent = percent;
		this.aArray = aArray;
	}
}
