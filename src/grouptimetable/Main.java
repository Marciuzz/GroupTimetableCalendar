package grouptimetable;

/*Final program expectations:

		*Database can store timetables of multiple persons.	
		*User can be switched to see his personal timetable.
		*Personal timetables will be graphically presented for user.
		*User can change date at any time.	
		*User can check events on different dates.
		*User can use GUI to create new events.
*/	

public class Main {
    public static void main(String[] args) {
        MainJFrame mjf = new MainJFrame();
        mjf.setLocationRelativeTo(null);
        mjf.setVisible(true);
    }
}
