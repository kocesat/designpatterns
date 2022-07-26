package com.kocesat.structural.facade.exercise;

import java.util.List;

/**
 * Facade layer
 */
public class TwitterService {
    public List<Tweet> getRecentTweets() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }
}
