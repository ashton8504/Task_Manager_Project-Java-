import java.util.Scanner;

public class TaskManagerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isRunning = true;
        while (isRunning) {
            // Display menu options

            int choice = scanner.nextInt();

            // Implement menu options here

            if (choice == 5) {
                isRunning = false;
            }
        }

        scanner.close();
    }

}
