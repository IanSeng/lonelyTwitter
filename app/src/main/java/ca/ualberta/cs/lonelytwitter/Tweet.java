package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private Date date; //only parent can see it
    private String message;
    private static final Integer MAX_CHAR = 140;//static is operating n its class itself

    Tweet(){
        this.date = new Date(); //this is to specify
        this.message = "I am default message";
    }

    Tweet(String message){
        this.date = new Date();
        this.message = message; // Tweet myTweet = new Tweet ('Blaerggh')
    }

    public Date getDate() {return this.date;}

    public String getMessage() {return this.message;}

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHAR) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }
    public abstract Boolean isImportant();

    public String toString(){
        return this.message;
    }
}
