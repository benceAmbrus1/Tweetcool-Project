package com.codecool.web.service;

import com.codecool.web.db.SingletonDB;
import com.codecool.web.model.Tweet;
import com.codecool.web.service.exception.NoInputException;

import java.util.Date;
import java.util.List;

public class TweetService {

    public List<Tweet> getTweets(){
        List<Tweet> tweets = SingletonDB.getInstance().getTweets();
        return tweets;
    }

    public void addTweet(String name, String message) throws NoInputException{
        if(name.equals("") || message.equals("")){
            throw new NoInputException ("Please fill both input field");
        } else {
            Tweet tweet = new Tweet(name, message, new Date());
            SingletonDB.getInstance().getTweets().add(tweet);
        }
    }
}
