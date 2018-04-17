package com.codecool.web.db;

import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingletonDB {

    List<Tweet> tweets = new ArrayList<>();

    private static SingletonDB ourInstance = new SingletonDB();

    public static SingletonDB getInstance() {
        return ourInstance;
    }

    private SingletonDB() {

        tweets.add(new Tweet("Admin", "Welcome in the TweetCool", new Date()));
        tweets.add(new Tweet("Other", "heyho wveryone", new Date()));
        tweets.add(new Tweet("DOg", "Woof", new Date()));
        tweets.add(new Tweet("YOMI", "Welcome", new Date()));
        tweets.add(new Tweet("CAT", "Miáu", new Date()));
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}
