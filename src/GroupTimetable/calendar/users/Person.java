package GroupTimetable.calendar.users;

import java.io.Serializable;

/**
 * abstract class Person, so we can't create a Person object. It is just inherited by Teacher and Student
 */
abstract public class Person implements Serializable {
    String name;
    String lastName;
    boolean isMIFSAstudent = false;
    
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    void setValues(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        lastName = name;
    }
    
    
    public String getValues() {
        return name+" "+lastName;
    }
    
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
}
