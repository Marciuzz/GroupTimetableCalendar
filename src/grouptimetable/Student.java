package grouptimetable;

import java.lang.Object;
import org.apache.commons.lang3.StringUtils;

   /**
    * StringUtils.isEmpty(""); // true
    * StringUtils.isEmpty(null); // true
    */

public class Student extends Person {
    String personType;        // teacher, student, MIFSAStudent
    String typeOfStudy; // IT, Law, Economics
    int yearOfStudy;    // 1, 2, 3, 4
    boolean isMIFSAstudent = false;
    
    //overriding Person class (superclass) method setValues, but still calling the super class method to set the name and lastName
    public void setValues(String name, String lastName, String typeOfStudy, int yearOfStudy) {
        super.setValues(name, lastName);
        this.setPersonType("Student");
        this.setTypeOfStudy(typeOfStudy);
        this.setYearOfStudy(yearOfStudy);
    }
    //setValues overloading
    public void setValues(String name, String lastName) {
        super.setValues(name, lastName);
    }
    
    public void setPersonType(String personType){
            this.personType = personType;
    }
    public void setTypeOfStudy(String typeOfStudy){
        if (StringUtils.isEmpty(typeOfStudy)) {
            System.out.println("Please set the type of study");
        } else {
            this.typeOfStudy = typeOfStudy;
        }
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
