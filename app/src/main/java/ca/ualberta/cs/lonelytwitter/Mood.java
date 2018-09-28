package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    Mood (){
        this.date = new Date ();
    }

    Mood (Date date){
        this.date = date;
    }

    public Date getDate() {return this.date;}

}
