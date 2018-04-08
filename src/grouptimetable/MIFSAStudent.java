package grouptimetable;

public class MIFSAStudent extends Student {
    boolean isMIFSAstudent;
    
    public MIFSAStudent(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super(name, lastName, typeOfStudy, yearOfStudy);
        this.isMIFSAstudent = true;
    }
    
    public void setValues(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName, typeOfStudy, yearOfStudy);
        this.isMIFSAstudent = true;
    }
}
