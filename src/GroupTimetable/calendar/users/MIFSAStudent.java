package grouptimetable.calendar.users;

import java.io.Serializable;

public class MIFSAStudent extends Student implements Serializable {
    private boolean isMIFSAstudent;
    
    public MIFSAStudent(String name, String lastName, String facultyName, int yearOfStudy) {
        super(name, lastName, facultyName, yearOfStudy);
        this.isMIFSAstudent = true;
    }
    
    public void setValues(String name, String lastName, String facultyName, int yearOfStudy) {
        super.setValues(name, lastName, facultyName, yearOfStudy);
        this.isMIFSAstudent = true;
    }
}
