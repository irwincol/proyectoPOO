package tasks.models;

public class Task {
    private String name;
    private String description;
    private boolean status;

    public Task (String name, String description, boolean status){
        this.name = name;
        this.description = description;
        this.status = status;

    }

    //Set y Get 

    //setters set 

    public void setName(String name){
        this.name = name;   
    }
      public void setDescription (String description){
        this.description = description;
      }
    public void setStatus (boolean status){
        this.status= status;
    }
    //GETters

    public String getName(){
        return this.name;
    }

    public String getDescription (){
        return this.description;
    }

    public boolean getStatus (){
        return this.status;
    }
    
}
