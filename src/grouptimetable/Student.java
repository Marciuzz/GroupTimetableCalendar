package grouptimetable;

import java.lang.Object;
import org.apache.commons.lang3.StringUtils;

   /**
    * StringUtils.isEmpty(""); // true
    * StringUtils.isEmpty(null); // true
    */

public class Student extends Person {
    String personType;        // teacher, student, MIFSAStudent
    String facultyName; // IT, MED, LAW, ECO
    int yearOfStudy;    // 1, 2, 3, 4
    boolean isMIFSAstudent = false;
    
    public Student(String name, String lastName, String facultyName, int yearOfStudy) {
        super(name, lastName);
        this.setPersonType("Student");
        this.setFacultyName(facultyName);
        this.setYearOfStudy(yearOfStudy);
    }
    
    //overriding Person class (superclass) method setValues, but still calling the super class method to set the name and lastName
    public void setValues(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName);
        this.setPersonType("Student");
        this.setFacultyName(facultyName);
        this.setYearOfStudy(yearOfStudy);
    }
    //setValues overloading
    public void setValues(String name, String lastName) {
        super.setValues(name, lastName);
    }
    
    public void setPersonType(String personType){
            this.personType = personType;
    }
    public void setFacultyName(String facultyName){
        if (StringUtils.isEmpty(facultyName) && facultyName.length()==3) {
            System.out.println("Please set correct faculty abbreviation (Must be 3 letters)!");
        } else {
            this.facultyName = facultyName;
        }
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    
    public String getValues() {
        return name+" "+lastName+" "+personType+" "+facultyName+" "+yearOfStudy;
    }
    public String getPersonType(){
        return personType;
    }
    public String getFacultyName(){
        return facultyName;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
}
