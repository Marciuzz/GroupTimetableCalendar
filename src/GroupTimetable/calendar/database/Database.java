package grouptimetable.calendar.database;

import grouptimetable.calendar.event.Event;
import grouptimetable.calendar.users.MIFSAStudent;
import grouptimetable.calendar.users.Person;
import grouptimetable.calendar.users.Student;
import grouptimetable.calendar.users.Teacher;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class Database implements Serializable {
    //Initialization using Arrays.asList, imitates having predefined data e.g. in file system


    List<Person> personDatabase;

    
    public List getEvents(String date, String filter) {

        List<Event> eventsToReturn = new ArrayList<>();

        String currDir = String.format(System.getProperty("user.dir"));
        File dir = new File(currDir);
        File[] foundFiles = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith("Event");
            }
        });
        if (foundFiles != null) {
            for (File file: foundFiles) {
                try {
                    Event e;
                    FileInputStream fileIn = new FileInputStream(file);

                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    e = (Event) in.readObject();
                    if (e.eventType.equals(filter) && e.eventDate.equals(date)) {
                        eventsToReturn.add(e);
                    }
                    in.close();
                    fileIn.close();

                } catch (IOException | ClassNotFoundException i) { }
            }
        }


        return eventsToReturn;
    }

    public void removeEventFromDatabase(int eventId) {
        String event = String.format("Event_%d.ser", eventId);
        File file = new File(event);

        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }


    public void addEventToDatabse(Event evt, int eventId) {
        serializeEvent(evt, eventId);

        System.out.println(eventId+" Adding item to db: "+evt.eventDate);
    }

    public int getEventCount() {
        boolean nextEventExists = true;
        int eventsCount = 0;
        while (nextEventExists)
        {
            String eventName = String.format("Event_%d.ser", eventsCount);
            File f = new File(eventName);
            if (f.exists()) {
                eventsCount++;
            } else {
                nextEventExists = false;
            }
        }
        return eventsCount;
    }

    public List getPersonList() {
        List<Person> personsDatabase = new ArrayList<>();
        boolean stillHasMIFSA = true;
        boolean stillHasStudents = true;
        boolean stillHasTeacher = true;
        int mifsaCount = 0;
        int studentsCount = 0;
        int teacherCount = 0;

        while (stillHasMIFSA)
        {
            try {
                MIFSAStudent e;
                String mifsastudent = String.format("MIFSAStudent_%d.ser", mifsaCount);
                FileInputStream fileIn = new FileInputStream(mifsastudent);

                ObjectInputStream in = new ObjectInputStream(fileIn);
                e = (MIFSAStudent) in.readObject();

                mifsaCount++;
                in.close();
                fileIn.close();
                personsDatabase.add(e);

            } catch (IOException | ClassNotFoundException i) {
                stillHasMIFSA = false;
            }
        }
        while (stillHasStudents)
        {
            try {
                Student e;
                String student = String.format("Student_%d.ser", studentsCount);
                FileInputStream fileIn = new FileInputStream(student);

                ObjectInputStream in = new ObjectInputStream(fileIn);
                e = (Student) in.readObject();

                studentsCount++;
                in.close();
                fileIn.close();
                personsDatabase.add(e);

            } catch (IOException | ClassNotFoundException i) {
                stillHasStudents = false;
            }
        }
        while (stillHasTeacher)
        {
            try {
                Teacher e;
                String event = String.format("Teacher_%d.ser", teacherCount);
                FileInputStream fileIn = new FileInputStream(event);

                ObjectInputStream in = new ObjectInputStream(fileIn);
                e = (Teacher) in.readObject();

                teacherCount++;
                in.close();
                fileIn.close();
                personsDatabase.add(e);

            } catch (IOException | ClassNotFoundException i) {
                stillHasTeacher = false;
            }
        }



        return personsDatabase;
    }
    
    public String getFirstPersonInThePersonList() {
        String personType;

        //check child classes here, MIFSAStudent is also a Student, so check first, to get more specific info
        this.personDatabase = getPersonList();
        if (!personDatabase.isEmpty()) {
            if (personDatabase.get(0) instanceof Teacher) {
                //Downcasting from Person to child classes to get faculty name
                Teacher t = (Teacher) personDatabase.get(0);
                personType = " [TE]";
                return t.getName()+ " " +t.getLastName()+ " " +t.getFacultyName()+personType;
            } else if (personDatabase.get(0) instanceof MIFSAStudent) {
                MIFSAStudent m = (MIFSAStudent) personDatabase.get(0);
                personType = " [SA]";
                return m.getName()+" "+m.getLastName()+" "+m.getFacultyName()+personType;
            } else if (personDatabase.get(0) instanceof Student) {
                Student s = (Student) personDatabase.get(0);
                personType = " [ST]";
                return s.getName()+" "+s.getLastName()+" "+s.getFacultyName()+personType;
            }
        }

        return null;
    }

    private void serializeEvent(Event e, int eventId) {
        try {
            System.out.println("funkcija");
            String outputString = String.format("Event_%d.ser", eventId);
            FileOutputStream fileOut = new FileOutputStream(outputString);

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void serializePerson(Person e, int personId, String personType) {
        try {
            switch (personType) {
                case "Teacher": {
                    String outputString = String.format("Teacher_%d.ser", personId);
                    FileOutputStream fileOut = new FileOutputStream(outputString);

                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(e);
                    out.close();
                    fileOut.close();
                    break;
                }
                case "Student": {
                    String outputString = String.format("Student_%d.ser", personId);
                    FileOutputStream fileOut = new FileOutputStream(outputString);

                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(e);
                    out.close();
                    fileOut.close();
                    break;
                }
                case "MIFSAStudent": {
                    String outputString = String.format("MIFSAStudent_%d.ser", personId);
                    FileOutputStream fileOut = new FileOutputStream(outputString);

                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(e);
                    out.close();
                    fileOut.close();
                    break;
                }
            }

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public int getMIFSACount() {
        boolean nextMIFSAExists = true;
        int mifsaCount = 0;

        while (nextMIFSAExists)
        {
            String eventName = String.format("MIFSAStudent_%d.ser", mifsaCount);
            File f = new File(eventName);
            if (f.exists()) {
                mifsaCount++;
            } else {
                nextMIFSAExists = false;
            }
        }
        return mifsaCount;
    }

    public int getStudentsCount() {
        boolean nextStudentExists = true;
        int studentsCount = 0;

        while (nextStudentExists)
        {
            String eventName = String.format("Students_%d.ser", studentsCount);
            File f = new File(eventName);
            if (f.exists()) {
                studentsCount++;
            } else {
                nextStudentExists = false;
            }
        }

        return studentsCount;
    }

    public int getTeacherCount() {

        boolean nextTeacherExists = true;
        int teacherCount = 0;

        while (nextTeacherExists)
        {
            String eventName = String.format("Teacher_%d.ser", teacherCount);
            File f = new File(eventName);
            if (f.exists()) {
                teacherCount++;
            } else {
                nextTeacherExists = false;
            }
        }

        return teacherCount;
    }
}