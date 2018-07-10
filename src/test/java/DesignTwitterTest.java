import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class DesignTwitterTest {

   @Test
   public void testScenario1() {
      DesignTwitter.Twitter twitter = new DesignTwitter.Twitter();
      // User 1 posts a new tweet (id = 5).
      twitter.postTweet(1, 5);

      // User 1's news feed should return a list with 1 tweet id -> [5].
      assertEquals(Arrays.asList(5), twitter.getNewsFeed(1));

      // User 1 follows user 2.
      twitter.follow(1, 2);

      // User 2 posts a new tweet (id = 6).
      twitter.postTweet(2, 6);

      // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
      // Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
      assertEquals(Arrays.asList(6, 5), twitter.getNewsFeed(1));

      // User 1 unfollows user 2.
      twitter.unfollow(1, 2);

      // User 1's news feed should return a list with 1 tweet id -> [5],
      // since user 1 is no longer following user 2.
      assertEquals(Arrays.asList(5), twitter.getNewsFeed(1));
   }


   @Test
   public void testScenario2() {
      DesignTwitter.Twitter twitter = new DesignTwitter.Twitter();
      twitter.postTweet(1, 5);


      twitter.postTweet(1, 3);

      assertEquals(Arrays.asList(3, 5), twitter.getNewsFeed(1));

   }


   @Test
   public void testScenario3() {
      DesignTwitter.Twitter twitter = new DesignTwitter.Twitter();
      twitter.postTweet(1, 5);


      twitter.follow(1, 2);
      twitter.follow(2, 1);

      assertEquals(Arrays.asList( 5), twitter.getNewsFeed(2));
      twitter.postTweet(2, 6);
      assertEquals(Arrays.asList( 6, 5), twitter.getNewsFeed(1));
      assertEquals(Arrays.asList( 6, 5), twitter.getNewsFeed(2));

      twitter.unfollow(2,1);
      assertEquals(Arrays.asList( 6, 5), twitter.getNewsFeed(1));
      assertEquals(Arrays.asList(6), twitter.getNewsFeed(2));

      twitter.unfollow(1,2);
      assertEquals(Arrays.asList(5), twitter.getNewsFeed(1));
      assertEquals(Arrays.asList(6), twitter.getNewsFeed(2));

   }
}