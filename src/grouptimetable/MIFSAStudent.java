package grouptimetable;

public class MIFSAStudent extends Student {
    boolean isMIFSAstudent;
    
    public MIFSAStudent(String name, String lastName, String facultyName, int yearOfStudy) {
        super(name, lastName, facultyName, yearOfStudy);
        this.isMIFSAstudent = true;
    }
    
    public void setValues(String name, String lastName, String facultyName, int yearOfStudy) {
        super.setValues(name, lastName, facultyName, yearOfStudy);
        this.isMIFSAstudent = true;
    }
}
