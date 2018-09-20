package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements Flying_Behaviour {
    @Override
    public void swim(){
        Log.d("ian","Hey I love swimming sometime");
    }

    public void fly(){
        Log.d("ian","I only fly when I am forced to Fly");
    }
}
