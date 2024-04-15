import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
    HashMap<String, Boolean> listofTasks = new HashMap<String, Boolean>();

    listofTasks.put("Do Laundry", true);
    listofTasks.put("Buy a Macbook with M3", true); 
    listofTasks.put("Learn some more CS", true); 

    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Your To-Do List. Select the Following: \n 1. Add Task \n 2. Complete Task \n 3. Delete Task \n4. View Task \n 5. Exit App");
    String userInput = scanner.nextLine(); 

    if(userInput.equals("1")) {
        System.out.println("Write the Task Below?"); 
        String newTask = scanner.nextLine();
        listofTasks.put(newTask, true);
    }
    else if (userInput.equals("2")) {
        System.out.println("")
        
    } {

    }

    } 




    }
