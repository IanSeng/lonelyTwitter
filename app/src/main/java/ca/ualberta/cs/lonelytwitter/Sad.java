package ca.ualberta.cs.lonelytwitter;

public class Sad extends Mood {
    private String message;

    public Sad (){
        this.message = "Sad mood";
    }

    public String getMood(){
        return this.message;
    }

}

