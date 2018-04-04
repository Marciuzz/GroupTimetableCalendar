package grouptimetable;

public class MIFSAStudent extends Student {
    
    public MIFSAStudent(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super(name, lastName, typeOfStudy, yearOfStudy);
        boolean isMIFSAstudent = true;
        this.setPersonType("MIFSAStudent");
    }
    
    public void setValues(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName, typeOfStudy, yearOfStudy);
        boolean isMIFSAstudent = true;
        this.setPersonType("MIFSAStudent");
    }
}
