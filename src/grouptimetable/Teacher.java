package grouptimetable;

import org.apache.commons.lang3.StringUtils;

public class Teacher extends Person {   
    String facultyName;
    public Teacher(String name, String lastName, String facultyName) {
        super(name, lastName);
        setFacultyName(facultyName);
    }
    
    public void setFacultyName(String facultyName){
        if (StringUtils.isEmpty(facultyName)) {
            System.out.println("Please set correct faculty abbreviation (Must be 3 letters)!");
        } else {
            this.facultyName = facultyName;
        }
    }
}
