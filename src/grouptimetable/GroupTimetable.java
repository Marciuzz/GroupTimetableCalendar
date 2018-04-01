package grouptimetable;

import java.util.Date;

public class GroupTimetable {

    
    public static void main(String[] args) {
        
        /* Create and display the MainJFrame form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
        
        Event EventObject = new Event();
        Date date = new Date();
        EventObject.setEvent(0, "Java programming exercises", date);
        
        MIFSAStudent studTest = new MIFSAStudent();
        studTest.setValues("Vardas", "Pavarde", "Studentas", "IT", 1);
        System.out.println(studTest.getValues());
        studTest.setName("newName");
        System.out.println(studTest.isMIFSAstudent);
    }
    
}
