package GroupTimetable.calendar.event;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Event implements Serializable {
    public int eventId;
    public String eventDate;
    public String eventHourTime;
    public String eventName;
    public String eventType;
    
    //Event constructor
    public Event(int eventId, String date, String hourTime, String eventName, String eventType) {
        this.eventId = eventId;
        this.eventDate = date;
        this.eventHourTime = hourTime;
        this.eventName = eventName;
        this.eventType = eventType;
    }
    
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    
    public void setEventDate(String date) {
        this.eventDate = date;
    }
    public void setEventHourTime(String hourTime) {
        this.eventHourTime = hourTime;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    public int getEventId() {
        return eventId;
    }
    public String getEventDate() {
        return eventDate;
    }
    public String getEventHourTime() {
        return eventHourTime;
    }
    public String getEventName() {
        return eventName;
    }
    public String getEventType() {
        return eventType;
    }


}
