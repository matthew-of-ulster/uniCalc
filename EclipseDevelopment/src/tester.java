import java.util.Scanner;

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

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			String printString = "\nWelcome to our system. \nWhat would you like to do?";
			printString+="\n1--Add Assignment";
			printString += "\n2--View Assignments";
			printString += "\n3--Add Module";
			printString += "\n4--Add Assignments to Module";
			System.out.println(printString);
			
			int choice = sc.nextInt();
			if(choice==0) {
				run = false;
			}
			
			
			
		}
		
	}
}
