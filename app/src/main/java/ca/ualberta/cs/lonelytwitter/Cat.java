package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Cat extends Animal implements Flying_Behaviour{
    @Override
    public void swim(){
        Log.d("ian","Hey I hate swim");
    }
    public void fly(){
        Log.d("ian","I only fly when I cannot to Fly");
    }
}
