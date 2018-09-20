package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public abstract class Animal {
    protected String type;
    protected String food;

    public void setType(String type){
        this.type = type;
    }
    public void setFood(String type){
        this.type = food;
    }
    public String getType(){
        return this.type = type;
    }
    public String getFood(){
        return this.food = food;
    }
    public abstract void swim();
}
