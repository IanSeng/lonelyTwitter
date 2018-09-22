package ca.ualberta.cs.lonelytwitter;


public class Happy extends Mood {

    private String message;

    public Happy(){
        this.message = "Happy mood";
    }

    public String getMood(){
        return this.message;
    }
}
