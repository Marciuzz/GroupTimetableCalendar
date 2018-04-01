package grouptimetable;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class GroupTimetable { 
    public void setupGroupTimetable() {
        //new Object[]{"8:30 - 10:00", "Web Programming"}
        
    }
    public static void main(String[] args) {
        
        MainJFrame mjf = new MainJFrame();
        mjf.setVisible(true);
        GroupTimetable gt = new GroupTimetable();
        gt.setupGroupTimetable();
        
        
        Database db = new Database();
        Object[][] commonEvents = db.getCommonEvents();
        mjf.addItems(commonEvents);
        //mjf.addItem(new Object[]{"8:30 - 10:00", "Web Programming"});
        Date date = new Date();
        Event EventObject = new Event(0, "Java programming exercises", date);
        
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
    }
    
}
