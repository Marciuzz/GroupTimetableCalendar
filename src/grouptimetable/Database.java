package grouptimetable;

import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Database {
    //Initialization using Arrays.asList, imitates having predefined data e.g. in file system
    List<Event> eventsDatabase = new ArrayList<Event>(Arrays.asList(
            //String eventDate, String eventHourTime, String eventName, String eventType [personName/common/SA]
            new Event("2018-04-01", "10:00 - 12:00", "Event10", "MIFSAStudent1 Surname1"),
            new Event("2018-04-01", "12:00 - 13:00", "Event15", "MIFSAStudent1 Surname1"),
            new Event("2018-04-01", "10:00 - 12:00", "MIFSAEvent13", "SA"),
            new Event("2018-04-01", "12:00 - 13:00", "MIFSAEvent26", "SA"),
            new Event("2018-04-02", "10:00 - 12:00", "MIFSAEvent13", "SA"),
            new Event("2018-04-02", "12:00 - 13:00", "MIFSAEvent26", "SA"),
            new Event("2018-04-02", "12:00 - 13:00", "Event100", "MIFSAStudent1 Surname1"),
            new Event("2018-04-02", "10:00 - 12:00", "Event150", "MIFSAStudent1 Surname1"),
            new Event("2018-04-01", "10:00 - 12:00", "CommonEvent999", "common"),
            new Event("2018-04-02", "12:00 - 18:00", "CommonEvent111", "common"),
            new Event("2018-04-01", "16:00 - 18:00", "Event19", "MIFSAStudent1 Surname1"),
            new Event("2018-04-01", "12:00 - 14:00", "Event20", "MIFSAStudent2 Surname2"),
            new Event("2018-04-01", "14:00 - 16:00", "Event25", "MIFSAStudent2 Surname2"),
            new Event("2018-04-01", "18:00 - 10:00", "Event29", "MIFSAStudent2 Surname2"),
            new Event("2018-04-01", "10:00 - 13:00", "Event80", "Student1 Surname3"),
            new Event("2018-04-01", "13:00 - 16:00", "Event85", "Student1 Surname3"),
            new Event("2018-04-01", "8:00 - 12:00", "Event89", "Student1 Surname3"),
            new Event("2018-04-01", "12:00 - 16:00", "Event90", "Student2 Surname4"),
            new Event("2018-04-01", "16:00 - 20:00", "Event95", "Student2 Surname4"),
            new Event("2018-04-01", "20:00 - 00:00", "Event99", "Student2 Surname4"),
            new Event("2018-04-01", "10:00 - 12:00", "Event30", "Teacher1 Surname5"),
            new Event("2018-04-01", "12:00 - 14:00", "Event40", "Teacher1 Surname5"),
            new Event("2018-04-01", "10:00 - 12:00", "Event50", "Teacher2 Surname6"),
            new Event("2018-04-01", "12:00 - 14:00", "Event60", "Teacher2 Surname6")
    ));
    List<Person> personDatabase = new ArrayList<Person>(Arrays.asList(
            new MIFSAStudent("MIFSAStudent1", "Surname1", "IT", 1),
            new MIFSAStudent("MIFSAStudent2", "Surname2", "MED", 2),
            new Student("Student1", "Surname3", "IT", 2),
            new Student("Student2", "Surname4", "MED", 1),
            new Teacher("Teacher1", "Surname5"),
            new Teacher("Teacher2", "Surname6")
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

    public List getPersonList() {
        return personDatabase;
    }
    public String getFirstPersonInThePersonList() {
        String personType = new String();
        //check child classes here, MIFSAStudent is also a Student, so check first
        if (personDatabase.get(0) instanceof Teacher) {
            personType = " [T]";
        } else if (personDatabase.get(0) instanceof MIFSAStudent) {
            personType = " [SA]";
        } else if (personDatabase.get(0) instanceof Student) {
            personType = " [S]";
        } 
        return personDatabase.get(0).getName()+" "+personDatabase.get(0).getLastName()+personType;
    }
    
    public void addItemToEventsDatabase(Event evt) {
        eventsDatabase.add(evt);
    }
}