package grouptimetable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        MainJFrame mjf = new MainJFrame();
        mjf.setVisible(true);
        
        
        //mjf.addItem(new Object[]{"8:30 - 10:00", "Web Programming"});
        //Date date = new Date();
        //Event EventObject = new Event(LocalDate.of(2018, 04, 01), "Java programming exercises");
        
        MIFSAStudent studTest = new MIFSAStudent();
        studTest.setValues("Name", "Surname", "IT", 1);
        System.out.println(studTest.getValues());
        studTest.setName("newName");
        //System.out.println(studTest.isMIFSAstudent);
        
        MIFSAStudent studTest2 = new MIFSAStudent();
        studTest2.setValues("Vardenis", "Pavardenis");
        System.out.println(studTest2.getValues());
        
        Student studTest3 = new Student();
        studTest3.setValues("Name3", "Surname3", "IT", 1);
        System.out.println(studTest3.getValues());
        
        //db.populateDatabase();
    }
}
