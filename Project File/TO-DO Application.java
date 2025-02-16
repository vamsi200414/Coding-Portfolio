package projects;
import java.util.*;
public class App{
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		System.out.println("Welcome to the TO-DO LIST APP");
		while(true) {
			System.out.println("0.====TO-DO LIST====");
			System.out.println("1.Add tasks");
			System.out.println("2.Remove tasks");
			System.out.println("3.View tasks");
			System.out.println("4.Exit");
			
			System.out.println("choose any number from above to perform action on TO-DO LIST");
			int n = abc.nextInt();
			abc.nextLine();
			switch(n) {
			case 1:
				System.out.println("Enter task : ");
				String s = abc.nextLine();
				tasks.add(s);
				System.out.println("Task added successfully");
				System.out.println();
				break;
			case 2:
				System.out.println("which task to remove");
				int task = abc.nextInt();
				if(!tasks.isEmpty()) {
					tasks.remove(task-1);
				}
				else {
					System.out.println("No task to remove");
					System.out.println();
				}
				System.out.println("Task removed successfully");
				System.out.println();
				break;
				
			case 3:
				if(!tasks.isEmpty()) {
					for(int i=0 ; i<tasks.size() ; i++) {
						System.out.println(tasks.get(i));
					}
					System.out.println();
				}
				else if(tasks.isEmpty()){
					System.out.println("No-task to view");
					System.out.println();
				}
				break;
				
			case 4:
				System.out.println("Exiting the TO-DO APPLICATION.........");
				System.out.println();
				return;
				
			default :
				System.out.println("Invalid choice , please select a valid option..");
					
			}
			
		}
	}
}
