package grouptimetable;

public class MIFSAStudent extends Student {
    public void setValues(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName, typeOfStudy, yearOfStudy);
        boolean isMIFSAstudent = true;
        this.setPersonType("MIFSAStudent");
    }
}
