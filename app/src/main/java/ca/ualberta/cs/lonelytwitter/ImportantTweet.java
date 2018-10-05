package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Important tweet.
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     * The super class
     */
    ImportantTweet() {
        super();
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     * this will return the message to the super class
     */
    ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
