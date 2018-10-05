package ca.ualberta.cs.lonelytwitter;

/**
 * The type Happy.
 */
public class Happy extends Mood {
    private String message;

    /**
     * Instantiates a new Happy.
     * This subclass will return the message i am happy
     */
    Happy(){
        this.message = "I am happy.";
    }

    /**
     * Get mood string.
     *This subcass will the message of getMood
     * @return the string
     */
    public String getMood(){
        return this.message;
    }
}

