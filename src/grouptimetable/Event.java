package grouptimetable;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Event { 
    String eventDate;
    String eventHourTime;
    String eventName;
    String eventType;
    
    //Event constructor
    public Event(String date, String hourTime, String eventName, String eventType) {
        this.eventDate = date;
        this.eventHourTime = hourTime;
        this.eventName = eventName;
        this.eventType = eventType;
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
