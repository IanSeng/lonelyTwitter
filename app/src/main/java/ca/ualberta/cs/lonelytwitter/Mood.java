package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Mood.
 */
public abstract class Mood {
    private Date date;

    /**
     * Instantiates a new Mood.
     */
    Mood (){
        this.date = new Date ();
    }

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    Mood (Date date){
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {return this.date;}

}
