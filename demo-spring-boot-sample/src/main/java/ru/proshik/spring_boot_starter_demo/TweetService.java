package ru.proshik.spring_boot_starter_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by proshik on 27.10.16.
 */
@Service
public class TweetService {

    @Autowired
    private Twitter twitter;

    public List<String> getLatestTweets(){
        List<String> tweets = new ArrayList<>();
        try {
            ResponseList<Status> homeTimeline = twitter.getHomeTimeline();
            tweets.addAll(homeTimeline.stream()
                    .map(Status::getText)
                    .collect(Collectors.toList()));
        } catch (TwitterException e) {
            throw new RuntimeException(e);
        }
        return tweets;
    }
}
