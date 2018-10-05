package ca.ualberta.cs.lonelytwitter;

/**
 * The type Normal tweet.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {

        super(message);
    }

    @Override
    public Boolean isImportant() {

        return false;
    }
}
