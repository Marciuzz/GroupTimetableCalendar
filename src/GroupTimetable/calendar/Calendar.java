package grouptimetable.calendar;

/*Final program expectations:

		*calendar.databse.Database can store timetables of multiple persons.
		*User can be switched to see his personal timetable.
		*Personal timetables will be graphically presented for user.
		*User can change date at any time.	
		*User can check events on different dates.
		*User can use GUI to create new events.
*/

import grouptimetable.calendar.design.MainJFrame;

public class Calendar {
    public static void main(String[] args) {
        MainJFrame mainWindow = new MainJFrame();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
