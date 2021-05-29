
public class tester {

	public static void main(String[] args) {
		Assignment a1 = new Assignment();
		a1.setAssignmentName("a1");
		Assignment a2 = new Assignment();
		a2.setAssignmentName("a2");
		Assignment a3 = new Assignment();
		a3.setAssignmentName("a3");
		
		Assignment[] aArray = {a1,a2};
		Module m1 = new Module(aArray);
		System.out.println(m1.listAssignments());
		m1.addAssignment(a3);
		System.out.println(m1.listAssignments());
		m1.delLastAssignment();
		System.out.println(m1.listAssignments());
		
	}
}
