import java.time.LocalDate;
import java.util.Date;

public class Event {

    private String name;
    private String description;
    private LocalDate date;

    Event(String name, String description, LocalDate date){
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "-----------------------------------\n" + "EVENT INFO: \n" + name + " - " + date +  " \n" + description +"\n-----------------------------------";

    }
}
