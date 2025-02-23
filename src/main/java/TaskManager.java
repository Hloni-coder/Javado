import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks; 

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
    }
    public void addTask(String name) {
        Task task = new Task(name);
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public void deleteTask(String taskName) {
        tasks.removeIf(task -> task.getName().equals(taskName)); 
    }

    public void exit() {
        System.out.println("Exiting... Saving tasks...");
        for (Task task : tasks) {
            System.out.println("Saved task: " + task.getName()); 
        }
    }
}
