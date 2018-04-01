package grouptimetable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        MainJFrame mjf = new MainJFrame();
        mjf.setVisible(true);
        
        
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
