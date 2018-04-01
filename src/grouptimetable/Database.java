package grouptimetable;

import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Database {
    //Could probably remove the Database class, and add all event-related methods and variables to Event Class. The same with other classes (Student, Teacher ...)
    //Initialization using Arrays.asList, imitates having predefined data e.g. in file system
    List<Event> eventsDatabase = new ArrayList<Event>(Arrays.asList(
            new Event("2018-04-01", "10:00 - 12:00", "Event10", "common"),
            new Event("2018-04-01", "12:00 - 14:00", "Event20", "martynas"),
            new Event("2018-04-01", "18:00 - 20:00", "Event80", "martynas"),
            new Event("2018-04-01", "16:00 - 20:00", "Event90", "martynas"),
            new Event("2018-04-02", "10:00 - 12:00", "Event30", "common"),
            new Event("2018-04-02", "12:00 - 14:00", "Event40", "common"),
            new Event("2018-04-03", "10:00 - 12:00", "Event50", "common"),
            new Event("2018-04-03", "12:00 - 14:00", "Event60", "common")
    ));
    
    public List getCommonEventsOfTheDay(String date) {
        List<Event> eventsToReturn = new ArrayList<Event>();
        for (int i=0; i<eventsDatabase.size(); i++) {
            if (eventsDatabase.get(i).getEventDate().equals(date)) {
                if (eventsDatabase.get(i).getEventType().equals("common")){
                    eventsToReturn.add(eventsDatabase.get(i));
                }
            }
        }
        return eventsToReturn;
    }
    public List getPersonalEventsOfTheDay(String date, String name) {
        List<Event> eventsToReturn = new ArrayList<Event>();
        for (int i=0; i<eventsDatabase.size(); i++) {
            if (eventsDatabase.get(i).getEventDate().equals(date)) {
                if (eventsDatabase.get(i).getEventType().equals(name)){
                    eventsToReturn.add(eventsDatabase.get(i));
                }
            }
        }
        return eventsToReturn;
    }
    public void addEvent(Event evt) {
        /*System.out.println(eventsDatabase.length);
        eventsDatabase[eventsDatabase.length] = evt;*/
        eventsDatabase.add(evt);
    }
    
    public List getEvents(String date) {
        return eventsDatabase;
        
    }
}
