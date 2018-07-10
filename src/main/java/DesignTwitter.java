import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DesignTwitter {

   //todo write why O(k) getNewsFeed and others O(1)
   static class Twitter {

      private static final int THRESHOLD_TWEETS = 10;
      Map<Integer, User> users;
      long timeStamp;

      /**
       * Initialize your data structure here.
       */
      public Twitter() {
         this.users = new HashMap<>();
         this.timeStamp = 0;

      }

      /**
       * Compose a new tweet.
       */
      public void postTweet(int userId, int tweetId) {

         users.computeIfAbsent(userId, k -> new User()).tweets.add(0, new Tweet(++timeStamp, tweetId));

      }

      /**
       * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
       */
      public List<Integer> getNewsFeed(int userId) {
         LinkedList<Tweet> tweets = new LinkedList<>();

         User user = users.get(userId);

         if (user != null) {

            mergeTweets(tweets, user.tweets);

            for (int friend : user.friends) {
               mergeTweets(tweets, users.get(friend).tweets);
            }

         }
         return tweets.stream().map(p -> p.tweetId).collect(Collectors.toList());
      }

      private void mergeTweets(List<Tweet> tweets, List<Tweet> currentTweets) {
         ListIterator<Tweet> allTweets = tweets.listIterator();

         int counter = 0;
         int currentCount = 0;
         while (counter < THRESHOLD_TWEETS) {

            if (currentCount == currentTweets.size()) {
               break;
            }

            Tweet currentAllTweet = null;
            if (allTweets.hasNext()) {
               currentAllTweet = allTweets.next();
            }

            if (currentAllTweet == null || currentTweets.get(currentCount).timeStamp > currentAllTweet.timeStamp) {
               if (currentAllTweet!= null && allTweets.hasPrevious()) {
                  allTweets.previous();
               }
               allTweets.add(currentTweets.get(currentCount++));
            }
            ++counter;
         }

         while (tweets.size() > THRESHOLD_TWEETS) {
            tweets.remove(tweets.size() - 1);
         }
      }

      /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
         public void follow ( int followerId, int followeeId){
            if (followeeId !=followerId) {
               users.computeIfAbsent(followerId, k1 -> new User()).friends.add(followeeId);

               users.computeIfAbsent(followeeId, k -> new User());
            }
         }

      /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
         public void unfollow(int followerId, int followeeId){
            users.computeIfPresent(followerId, (k1, v1) -> {
               v1.friends.remove(followeeId);
               return v1;
            });
         }

   }

      private static class User {
         Set<Integer> friends;
         List<Tweet> tweets;

         User() {
            friends = new HashSet<>();
            tweets = new LinkedList<>();
         }
      }

      private static class Tweet {
         long timeStamp;
         int tweetId;

         Tweet(long timeStamp, int tweetId) {
            this.timeStamp = timeStamp;
            this.tweetId = tweetId;
         }
      }

   }

