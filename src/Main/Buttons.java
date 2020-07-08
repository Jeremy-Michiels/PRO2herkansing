package Main;

import java.util.Observable;

public class Buttons extends Observable {
    private int number;
    private String taken;

    public Buttons(int number){
        this.number = number;
        this.taken = "/";
    }
    public int getNumber(){
        return this.number;
    }
    public String getTaken(){
        return this.taken;
    }
    public void setTaken(String newTaken){
        this.taken = newTaken;
        setChanged();
        notifyObservers();
    }
}
