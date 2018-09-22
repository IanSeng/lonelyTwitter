package ca.ualberta.cs.lonelytwitter;

public class TooLongTweetException extends Exception {
    TooLongTweetException(){
        super("This message is too long! Please keep your tweet within 140 character");
    }
}
