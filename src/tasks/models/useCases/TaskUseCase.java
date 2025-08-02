package tasks.models.useCases;

import tasks.models.Task;

public class TaskUseCase {

    public void create (String name, String description) {
        Task task = new Task(name, description, status: false);
        return "Tarea Creada:" + task.getName() + "Descripcion" + task.getDescription();

        
    }
}
