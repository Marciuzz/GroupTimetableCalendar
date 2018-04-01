package grouptimetable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {
    public String Events[][] = new String[100][2];
    
    //Event constructor
    public Event(int index, String event, Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm");
        Events[index][0] = event;
        Events[index][1] = ft.format(date);
        System.out.println(Events[index][0] + " " + Events[index][1]);
    }
    
}
