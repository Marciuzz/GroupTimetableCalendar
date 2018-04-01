package grouptimetable;

public class Calendar {
    public int Data[][] = new int[100][3]; //   Data[index][0 == year, 1 == month, 2 == day];
    
    public void setDate(int year, int month, int day, int index){
        Data[index][0] = year;
        Data[index][1] = month;
        Data[index][2] = day;
    }
    
    public int getYear(int index){
        return Data[index][0];
    }
    public int getMonth(int index){
        return Data[index][1];
    }
    public int getDay(int index){
        return Data[index][2];
    }
}
