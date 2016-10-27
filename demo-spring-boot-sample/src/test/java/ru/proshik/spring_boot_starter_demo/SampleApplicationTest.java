package ru.proshik.spring_boot_starter_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import twitter4j.TwitterException;

import java.util.List;

/**
 * Created by proshik on 27.10.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SampleApplicationTest {

    @Autowired
    private TweetService tweetService;

    @Test
    public void testGetTweets() throws TwitterException {
        List<String> tweets = tweetService.getLatestTweets();
        tweets.forEach(System.err::println);
    }

}
