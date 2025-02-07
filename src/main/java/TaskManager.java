import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    public void exit() {
       
    }
}
