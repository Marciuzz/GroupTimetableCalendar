/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptimetable;

public class Database {
    public Object[][] getCommonEvents() {
        Object[][] data = {
            {"8:30 - 10:00", "Web Programming"},
            {"10:15 - 12:00", "Introduction to Python"},
            {"12:00 - 14:00", "Object-oriented programming in Java"},
            {"14:00 - 16:00", "Data structures"},
            {"16:00 - 18:00", "Human - Computer Interaction"},
            {"18:00 - 20:00", "Data storage"}
        };
        return data;
    }
}
