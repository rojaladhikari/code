import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ArrayList<String> listofTasks = new ArrayList<String>();
        ArrayList<Boolean> stateofTasks = new ArrayList<Boolean>();

        listofTasks.add("Send Email to Corporate Boss");
        listofTasks.add("Pick Up Laundry");
        listofTasks.add("Take out Dog");
        listofTasks.add("Get Groceries");

        stateofTasks.add(true);
        stateofTasks.add(true);
        stateofTasks.add(true);
        stateofTasks.add(true);

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Welcome to Your To-Do List. Select the Following: \n 1. Add Task \n 2. Complete Task \n 3. Delete Task \n 4. View Tasks \n 5. Exit App");
        String userInput = scanner.nextLine();

        while (!userInput.equals("5")) {
            if (userInput.equals("1")) {
                System.out.println("Write the task you want to add below.");
                String newTask = scanner.nextLine();
                listofTasks.add(newTask);
                stateofTasks.add(true);
                System.out.println("The task " + newTask + " is added");
            }

            else if (userInput.equals("2")) {
                System.out.println("Which task would you like to Complete? Please select a number.");
                for (int i = 0; i < listofTasks.size(); i++) {
                    System.out.println((i + 1) + " " + listofTasks.get(i));
                    System.out.println(stateofTasks.get(i) ? "Uncompleted" : "Completed"); 
                }
                int userInputII = scanner.nextInt();

                userInputII--;

                stateofTasks.set(userInputII, false);
                System.out.println("The task " + listofTasks.get(userInputII) + " is completed");
                System.out.println("The state of the task is  " + stateofTasks.get(userInputII));
            }

            else if (userInput.equals("3")) {
                System.out.println("Which task would you like to Delete? Please select a number.");
                for (int i = 0; i < listofTasks.size(); i++) {
                    System.out.println((i + 1) + " " + listofTasks.get(i));
                }
                int userInputII = scanner.nextInt();

                userInputII--;
                listofTasks.remove(userInputII);
                stateofTasks.remove(userInputII);

            } else if (userInput.equals("4")) {
                for (int i = 0; i < listofTasks.size(); i++) {
                    System.out.println((i + 1) + " " + listofTasks.get(i));
                }

            }
            System.out.println(
                "Welcome to Your To-Do List. Select the Following: \n 1. Add Task \n 2. Complete Task \n 3. Delete Task \n 4. View Tasks \n 5. Exit App");
                userInput = scanner.nextLine();
        }
        

    }
}
