import tasks.models.Task;   

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Task task = new Task("Encender", "Encender el tv", false);
        System.out.println("Tarea pendiente:"+ 
        task.getName() + 
        "Description:" + 
        task.getDescription()+
        task.getStatus());
        task.setStatus(true);
        System.out.println("tarea finalizada"+ task.getName() + " Description" + task.getDescription()  + task.getStatus());

    }
}
