package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    TweetTooLongException() {
        super("This message is too long! Please keep your tweet within 140 Characters");
    }
}
