package tasks.models.useCases;

import tasks.models.Task;

public class TaskUseCase {

    // Propiedad
    Task task;

    //Constructor

    public TaskUseCase(){
        this.task = new Task();  //Forma 
    

    public String create (String name, String description) {
        Task task = new Task(name, description,  false);
        return "Tarea Creada:" + task.getName() + "Descripcion" + task.getDescription();

        
    }

    //Update

    public task.set 



    //Delete




    //  Get

    public String get(){
         return "Tarea Creada:" + task.getName() + "Descripcion" + task.getDescription();
    
    }







}
