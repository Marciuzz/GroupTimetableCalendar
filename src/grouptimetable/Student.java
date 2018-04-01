package grouptimetable;

public class Student extends Person {
    String personType;        // teacher, student, MIFSAStudent
    String typeOfStudy; // IT, Law, Economics
    int yearOfStudy;    // 1, 2, 3, 4
    boolean isMIFSAstudent = false;
    
    public void setValues(String name, String lastName, String personType, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName);
        this.personType = personType;
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
    }
    
    public void setPersonType(String personType){
        this.personType = personType;
    }
    public void setTypeOfStudy(String typeOfStudy){
        this.typeOfStudy = typeOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    
    public String getValues() {
        return name+" "+lastName+" "+personType+" "+typeOfStudy+" "+yearOfStudy;
    }
    public String getPersonType(){
        return personType;
    }
    public String getTypeOfStudy(){
        return typeOfStudy;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
}
