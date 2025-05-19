import java.time.LocalDate;
import java.util.ArrayList;

public class EventBooklet {

    public ArrayList<Event> events = new ArrayList<>();


    public void sortEvents(LocalDate date){
        for(Event event: events){

            if(event.getDate().equals(date)){
                System.out.println(event.toString());
            }
        }
    }
}
