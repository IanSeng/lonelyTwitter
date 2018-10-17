package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Duplicate found");
        }else{
            tweets.add(tweet);
        }

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
        //return new NormalTweet("some new Tweet");
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;

    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount (){
        return tweets.size();
    }
}
