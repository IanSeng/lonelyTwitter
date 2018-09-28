package ca.ualberta.cs.lonelytwitter;

public class Happy extends Mood {
    private String message;

    Happy(){
        this.message = "I am happy.";
    }
    public String getMood(){
        return this.message;
    }
}

