package grouptimetable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martynas
 */
public class Person {
    String Vardas[] = new String[100];
    String Pavarde[] = new String[100];
    String Pareigos[] = new String[100];
    String SarasoNr[] = new String[100];
    String Studijos[] = new String[100];
    int Kursas[] = new int[100];
    
    public void setVardas(String name, int index){
        Vardas[index] = name;
    }
    public void setPavarde(String name, int index){
        Pavarde[index] = name;
    }
    public void setPareigos(String name, int index){
        Pareigos[index] = name;
    }
    public void setSarasoNr(String name, int index){
        SarasoNr[index] = name;
    }
    public void setStudijos(String name, int index){
        Studijos[index] = name;
    }
    public void setKursas(int number, int index){
        Kursas[index] = number;
    }
    
    public String getVardas(int index){
        return Vardas[index];
    }
    public String getPavarde(int index){
        return Pavarde[index];
    }
    public String getPareigos(int index){
        return Pareigos[index];
    }
    public String getSarasoNr(int index){
        return SarasoNr[index];
    }
    public String getStudijos(int index){
        return Studijos[index];
    }
    public int getKursas(int index){
        return Kursas[index];
    }
}
