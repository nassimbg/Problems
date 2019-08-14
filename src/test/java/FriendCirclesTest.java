import static org.junit.Assert.*;

import org.junit.Test;

public class FriendCirclesTest {

   @Test
   public void findCircleNumDFS() {
      int[][] adjMatrix = new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

      assertEquals(2, FriendCircles.findCircleNumDFS(adjMatrix));
   }

   @Test
   public void findCircleNumDFS2() {
      int[][] adjMatrix = new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };

      assertEquals(1, FriendCircles.findCircleNumDFS(adjMatrix));
   }


   @Test
   public void findCircleNumUnionFind() {
      int[][] adjMatrix = new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

      assertEquals(2, FriendCircles.findCircleNumUnionFind(adjMatrix));
   }

   @Test
   public void findCircleNumUnionFind2() {
      int[][] adjMatrix = new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };

      assertEquals(1, FriendCircles.findCircleNumUnionFind(adjMatrix));
   }
}