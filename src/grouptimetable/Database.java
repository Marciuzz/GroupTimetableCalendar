package grouptimetable;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    //Initialization using Arrays.asList, imitates having predefined data e.g. in file system
    List<Event> eventsDatabase = new ArrayList<Event>(Arrays.asList(
            //String eventId, String eventDate, String eventHourTime, String eventName, String eventType [personName/common/SA/facultyName]
            new Event("0", "2018-04-01", "10:00 - 12:00", "Event10", "MIFSAStudent1 Surname1"),
            new Event("1", "2018-04-01", "12:00 - 13:00", "Event15", "MIFSAStudent1 Surname1"),
            new Event("2", "2018-04-01", "10:00 - 12:00", "MIFSAEvent13", "SA"),
            new Event("3", "2018-04-01", "12:00 - 13:00", "MIFSAEvent26", "SA"),
            new Event("4", "2018-04-02", "10:00 - 12:00", "MIFSAEvent13", "SA"),
            new Event("5", "2018-04-02", "12:00 - 13:00", "MIFSAEvent26", "SA"),
            new Event("6", "2018-04-02", "12:00 - 13:00", "Event100", "MIFSAStudent1 Surname1"),
            new Event("7", "2018-04-02", "10:00 - 12:00", "Event150", "MIFSAStudent1 Surname1"),
            new Event("8", "2018-04-01", "10:00 - 12:00", "CommonEvent999", "common"),
            new Event("9", "2018-04-02", "12:00 - 18:00", "CommonEvent111", "common"),
            new Event("10", "2018-04-01", "16:00 - 18:00", "Event19", "MIFSAStudent1 Surname1"),
            new Event("11", "2018-04-01", "12:00 - 14:00", "Event20", "MIFSAStudent2 Surname2"),
            new Event("12", "2018-04-01", "14:00 - 16:00", "Event25", "MIFSAStudent2 Surname2"),
            new Event("13", "2018-04-01", "18:00 - 10:00", "Event29", "MIFSAStudent2 Surname2"),
            new Event("14", "2018-04-01", "10:00 - 13:00", "Event80", "Student1 Surname3"),
            new Event("15", "2018-04-01", "13:00 - 16:00", "Event85", "Student1 Surname3"),
            new Event("16", "2018-04-01", "8:00 - 12:00", "Event89", "Student1 Surname3"),
            new Event("17", "2018-04-01", "12:00 - 16:00", "Event90", "Student2 Surname4"),
            new Event("18", "2018-04-01", "16:00 - 20:00", "Event95", "Student2 Surname4"),
            new Event("19", "2018-04-01", "20:00 - 00:00", "Event99", "Student2 Surname4"),
            new Event("20", "2018-04-01", "10:00 - 12:00", "Event30", "Teacher1 Surname5"),
            new Event("21", "2018-04-01", "12:00 - 14:00", "Event40", "Teacher1 Surname5"),
            new Event("22", "2018-04-01", "10:00 - 12:00", "Event50", "Teacher2 Surname6"),
            new Event("23", "2018-04-01", "12:00 - 14:00", "Event60", "Teacher2 Surname6"),
            new Event("24", "2018-04-01", "12:00 - 14:00", "Event300", "MIF"),
            new Event("25", "2018-04-01", "13:00 - 15:00", "Event400", "MIF"),
            new Event("26", "2018-04-01", "14:00 - 16:00", "Event500", "MIF"),
            new Event("27", "2018-04-01", "12:00 - 14:00", "Event600", "MED"),
            new Event("28", "2018-04-01", "13:00 - 15:00", "Event700", "MED"),
            new Event("29", "2018-04-01", "14:00 - 16:00", "Event800", "MED")
    ));
    List<Person> personDatabase = new ArrayList<Person>(Arrays.asList(
            //String name, String lastName, String typeOfStudy, int yearOfStudy
            new MIFSAStudent("MIFSAStudent1", "Surname1", "MIF", 1),
            new MIFSAStudent("MIFSAStudent2", "Surname2", "MED", 2),
            new MIFSAStudent("MIFSAStudent3", "Surname3", "MED", 1),
            new MIFSAStudent("MIFSAStudent4", "Surname4", "MIF", 2),
            new MIFSAStudent("MIFSAStudent5", "Surname5", "MIF", 2),
            new Student("Student1", "Surname1", "MIF", 2),
            new Student("Student2", "Surname2", "MED", 1),
            new Student("Student3", "Surname3", "MIF", 2),
            new Student("Student4", "Surname4", "MIF", 1),
            new Student("Student5", "Surname5", "MED", 2),
            new Teacher("Teacher1", "Surname1", "MIF"),
            new Teacher("Teacher2", "Surname2", "MED")
    ));
    
    public List getEvents(String date, String filter) {
        List<Event> eventsToReturn = new ArrayList<Event>();
        for (int i=0; i<eventsDatabase.size(); i++) {
            if (eventsDatabase.get(i).getEventDate().equals(date)) {
                if (eventsDatabase.get(i).getEventType().equals(filter)){
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
        //check child classes here, MIFSAStudent is also a Student, so check first, to get more specific info
        if (personDatabase.get(0) instanceof Teacher) {
            //Downcasting from Person to child classes to get faculty name
            Teacher t = (Teacher) personDatabase.get(0);
            personType = " [TE]";
            return t.getName()+" "+t.getLastName()+" "+t.getFacultyName()+personType;
        } else if (personDatabase.get(0) instanceof MIFSAStudent) {
            MIFSAStudent m = (MIFSAStudent) personDatabase.get(0);
            personType = " [SA]";
            return m.getName()+" "+m.getLastName()+" "+m.getFacultyName()+personType;
        } else if (personDatabase.get(0) instanceof Student) {
            Student s = (Student) personDatabase.get(0);
            personType = " [ST]";
            return s.getName()+" "+s.getLastName()+" "+s.getFacultyName()+personType;
        } 
        return null;
    }
    
    public void addItemToEventsDatabase(Event evt) {
        eventsDatabase.add(evt);
        System.out.println("Adding item to db: "+evt.eventDate);
    }
    
    public void removeItemFromDatabase(String eventId) {
        for (int i=0; i<eventsDatabase.size(); i++) {
            if (eventsDatabase.get(i).getEventId().equals(eventId)) {
                eventsDatabase.remove(i);
            }
        }
    }
    
    public int getEventCount() {
        return eventsDatabase.size();
    }
    
    public void addMIFSAToPersonsDatabase(MIFSAStudent mfs){
        personDatabase.add(mfs);
    }
    
    public void addStudentToPersonsDatabase(Student std){
        personDatabase.add(std);
    }
    
    public void addTeacherToPersonsDatabase(Teacher tth){
        personDatabase.add(tth);
    }
}