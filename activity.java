import java.util.ArrayList;
import java.util.Scanner;

class TaskScheduler {
    private static ArrayList<String> tasks = new ArrayList<>();

    // Function to add a task
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Function to run the scheduler
    public static void runScheduler() {
        System.out.println("\nRunning Task Scheduler...");
        if (tasks.isEmpty()) {
            System.out.println("No tasks to run.");
        } else {
            for (String task : tasks) {
                System.out.println("Executing task: " + task);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Run Scheduler");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    runScheduler();
                    break;
                case 3:
                    System.out.println("Exiting Task Scheduler...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
