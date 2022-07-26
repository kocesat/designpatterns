package com.kocesat.structural.facade.exercise;

public class Demo {
  public static void main(String[] args) {
    // Calling facade layer
    var twitterService = new TwitterService();
    twitterService.getRecentTweets();
  }
}
