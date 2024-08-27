import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tasks:");
            int task = input.nextInt();
                input.nextLine();
                    System.out.print("Name:");
                        String crewName = input.nextLine();
        
        CrewDefiner crew = new CrewDefiner(task, crewName);


        System.out.printf("Tasks Made: %d \n", crew.getTasks());
        System.out.printf("Name: %s \n", crew.getCrewName());

        System.out.print("New amount of tasks:");
            int newTask = input.nextInt();
                crew.setTasks(newTask);
                    input.nextLine();
                        System.out.print("New crewmate Name:");
                            String newCrewName = input.nextLine();
                                crew.setCrewName(newCrewName);

        System.out.printf("New Crewmate Name: %s \n", crew.getCrewName());
        System.out.printf("New amount of tasks: %d", crew.getTasks());

    }
}