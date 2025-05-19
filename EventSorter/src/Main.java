import java.time.LocalDate;
import java.util.Collections;

public class Main {
    public static void main(String [] args){

        EventBooklet betterNights = new EventBooklet();

        Event eventOne = new Event("Jazz night", "Live music evening at city center", LocalDate.of(2025,1,25));
        Event eventTwo = new Event("Wine tasting", "Italian wine tasting event at the Crossroads inn", LocalDate.of(2025, 1, 27));
        Event eventThree = new Event("Racing event", "Street racing event at midnight", LocalDate.of(2025, 1, 25));
        Event eventFour = new Event("Boxing night", "Boxing night Jefferson vs Ali", LocalDate.of(2025, 1, 23));
        Event eventFive = new Event("Metal concert", "Live music: Metal concert at Lemmy", LocalDate.of(2025, 1, 22));
        Event eventSix = new Event("Whiskey tasting", "japanese Whiskey tasting at Golden Basement", LocalDate.of(2025, 1, 26));
        Event eventSeven = new Event("Ballet: Nutcracker", "Ballet: Nutcracker performance at Grand Hall", LocalDate.of(2025, 1, 27));

        Collections.addAll(betterNights.events, eventOne, eventTwo, eventThree, eventFour, eventFive, eventSix, eventSeven);

        betterNights.sortEvents(LocalDate.of(2025,1,25));

    }
}
