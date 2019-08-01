





- [Perfect Rectangle](https://leetcode.com/problems/perfect-rectangle/description/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__
  - solve it using __line sweeping__ exactly like __Skyline problem__
  - used Priority queue to order the intervals based on y-axis
  - used TreeSet to check if any interval intersect with another
  - time O(n logn) space O(n)
  - VVVVIIIPPPPP check my solution to know how i did it
  - [other solutions did in in O(n) time](https://leetcode.com/problems/perfect-rectangle/discuss/87180/O(n)-solution-by-counting-corners-with-detailed-explaination)


- [Skyline Problem](https://leetcode.com/problems/the-skyline-problem/description/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__
  * solve it again
  * [great explanation](https://www.youtube.com/watch?v=GSBLe8cKu0s)

   ___


- [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/description/)
  * this problem is a VVVVVVIIIIIPPPPPPP, should resolve it for practice.
  * __Needs REVIEW__   * check code documentation for explaining the solution
  * It can be solved in O(n) using a stack based
  * [geeks of geeks](http://www.geeksforgeeks.org/largest-rectangle-under-histogram/)

- [Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/description/)
  * This problem is solved in O(n^2) based of the *Largest Rectangle in Histogram* problem but with an extra space of O(columns) to indicate the height at a current row for every column
  * check documentation in code to understand how it was solved
  * VVVVIIIIPPPPPPPPP, should resolve it for practice








- [Create Maximum Number](https://leetcode.com/problems/create-maximum-number/description/)
  * Did it in 2 ways:
    1. DP: it a bit difficult cz its ganna be a 3d [solution](https://leetcode.com/problems/create-maximum-number/discuss/77314/O(m*n*k)-DP-solution-TLE)
      * Let f(i,j,k) represent maximum number of length k generated from nums1[1:i] and nums2[1:j].       
      *  the formula is: f(i,j,k) = max{f(i-1,j,k), f(i,j-1,k), f(i-1,j,k-1) + [nums1[i]], f(i,j-1,k-1) + [nums2[j]] }
    2. Greedy:
      * To find the maximum ,we can enumerate how digits we should get from nums1 , we suppose it is i.
        => So , the digits from nums2 is K - i.
      * And we can use a stack to get the get maximum number(x digits) from one array.
      * OK, Once we choose two maximum subarray , we should combine it to the answer.
        => It is just like merger sort,
        -  __but we should pay attention to the case: the two digital are equal.__
          => we should find the digits behind it to judge which digital we should choose now.
          => In other words,we should judge which subarry is bigger than the other.     




- Most of the time Pre,In,Post orders problems are duality to each other you have to just find the right duality
- Always practice Pre,In,Post in iterative and Morris Algo
- Try to use TreeSet or TreeMap
- Try to use In,Pre,Post for finding equality btw trees, and other purposes




- [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)
  * VIPPPPPP Important way to solve it without recursion   * __Needs REVIEW__
  * use stack and current pointer   * __STUDY THIS PROBLEM__
  * check [solution](https://leetcode.com/articles/binary-tree-inorder-traversal/)
  * VIPPPPPP Read about [__Threaded BST or Morris__](http://www.geeksforgeeks.org/convert-binary-tree-threaded-binary-tree-set-2-efficient/)
  * [find successor in BST](https://www.quora.com/How-can-you-find-successors-and-predecessors-in-a-binary-search-tree-in-order)

- [Binary Tree PreOrder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
  * similar to above but we put the result.add() inside the second while loop
  * __Needs REVIEW__
  * use stack and current pointer   
  * __STUDY THIS PROBLEM__

- [Binary Tree Post Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/)
  * VVVVVVVIIIIIIPPPPPPPPPPPPP
  * __To practice Do the MORRIS ALGORITHIM__
  * [MORRIS](https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/)
  * *__DUALITY OF PREORDER__*
  * __STUDY THIS PROBLEM__
  * [solution](https://discuss.leetcode.com/topic/30632/preorder-inorder-and-postorder-iteratively-summarization)

- [Binary Search Tree Iterator](https://leetcode.com/problems/binary-search-tree-iterator/discuss/)
  * use the Binary Tree Inorder Traversal Iterative based algo   * this approach will be divided into two parts check my solution
  * there's a [solution without current node](https://discuss.leetcode.com/topic/33645/my-solution-with-less-than-10-lines-of-code)

- [Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/description/)
  * VVVVIIPPPPP problem should solve it again   * __Needs REVIEW__
  * take advantage that every thing that is less than the root will be on the left and values greater than the loop will be on the right
  * So T(i,n) = T(i, k - 1) + T(k + 1, n) for i <= k <= n
  * do it D&C

- [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/description/)
  * Use __Binary Tree Inorder Traversal__ to solve this problem
  * and we should check if previous value >= current value (using previous pointer):     * if yes => FAIL

- [Recover Binary Search Tree](https://leetcode.com/problems/recover-binary-search-tree/description/)
  * VVVVIPPPP
  * find two swapped nodes in O(1) space in BST
  * __use Morris Traversal__

____

- [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/)
  * I used the stack based Algo with some modifications
  * check the code I wrote with its comments
  * NICE question

- [Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/)
  * VVVVVVVVIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP problem
  * __Practice this problem more__
  *  __Needs REVIEW__ : Was able to solve it due to previous question but better
  * its the duality of problem Construct Binary Tree from Preorder and Inorder Traversal
  * Explanation:
    * This question is the DUALITY of {@link ConstructBinaryTreefromPreorderandInorderTraversal
      *    1- instead of starting from index zero and incrementing in both lists (preOrder, inOrder) we start from the last index and decrement in both lists (postOrder, inOrder)
      *    2- In the code we reverse the logic which means where we call current.left become current.right and current.right becomes current.left
    * Why?
      * since a preOrder algo is: current, left, right
      * while a postOrder algo is: left, right, current
      * So...
        *  1- we do point 1 since the current used to be the first and now its the last
        *  2- we do point 2 since the order was (current and then left) now its in reverse order we have (current and then right)
    *  If you draw the tree for the post and in order arrays as follows:
      *  6, 5, 4, 3, 2, 8, 10, 9, 7, 1
      *  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
      *  you will realize that the above statements are visually true
  * [useful link](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/discuss/)



- [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/)
  * this could be done in O(n) recursively
  * its done in a D&C way
    1. we get the mid point (O(1)) like binary search algo
    2. recurse to the left and right
    3. assgine the nodes returned from left and right as children of the midpoint



- [Path Sum III](https://leetcode.com/problems/path-sum-iii/description/)
  - check note in order note.md in cummulative section

- [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/)
  * looks like your outputting the order in a preOrder traversal
  * Did it in a recursive way (check my solution)
  * __VERY NICE SOLUTION__ others did it in an iterative way with O(1) space

- [Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/)
  * do it in O(n) time and O(1) space (no need for recursion)
  * perform the algo level by level, so when you finish a level with filling their next pointers go to the next level and do the same until you finish all the level from the root to the leaves' level
  * VVVVVVVVIIIIIIIIIIIPPPPPPP check explanation in code(intellij) and check pic in the problem for more understanding
  * __Practice this problem more__ [Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/)


- [Binary Tree Upside Down](http://bangbingsyb.blogspot.com/2014/11/leetcode-binary-tree-upside-down.html)
  * this question is locked in LeetCode
  * basically we do the recurse only to the left and after recursion we flip the pointer as said in the question
  * so root.left.left = root.right and root.left.left = root
  * check [geek of geek](http://www.geeksforgeeks.org/flip-binary-tree/)
  * the left most node will never have a right child since the question says
  "all the right nodes are either leaf nodes with a sibling (a left node that shares the same parent node) or empty"



- [Count Complete Tree Nodes](https://leetcode.com/submissions/detail/136796845/)
  * time complexity is O((logn)^2) => T(N) = T(N/2) + O(logn)
  * the O(logn) at every level is cz of checking the height of every level + check if the left subtree of every level is complete to know to which child to recurse to
  * the T(N/2) is cz we are doing like Binary Search Algo we only traverse to 1 child either left or right
  * we check if the left sub tree is complete we add the number of node in it [= 2^(leftSubTreeHeight + 1 ) - 1 (leftSubTreeHeight = currentHeight - 1)] to the total number and then we traverse to the right child
  * if the left sub tree is not complete we add number of nodes in the right sub tree which is [= 2^(rightSubTreeHeight + 1 ) - 1 (rightSubTreeHeight = currentHeight - 1)]

- [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/solution/)
  * use Post order traversal

- [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/)
  * VVVVIIPPPPP
  * If only once use iterative inorder traversal to find the kth smallest O(n)
  * if you do it more often augment the TreeNodes to have the size of their subtree (augmenting BST trees in algo book)

- [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/)
  * check course 1 lecture 6 hw
  * [solution](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/discuss/)

- [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/discuss/)
  * difference btw Binary Tree and BST is that the numbers are not order
  * So do InOrder traversal to find the nodes
  * check code
  * [solution](https://discuss.leetcode.com/topic/18566/my-java-solution-which-is-easy-to-understand)

- [Count Univalue Subtrees](https://kennyzhuang.gitbooks.io/leetcode-lock/content/250_count_univalue_subtrees.html)
  * do a Post Order traversal
  * the return value should of the recursive function is boolean to indicate if the current subtree is a univalue one
  * A node is a univalue subtree if its children are and if its equal to the value of its children => the parent is a univalue
  * solution check my code

- [Closest Binary Search Tree Value II](http://buttercola.blogspot.com/2015/09/leetcode-closest-binary-search-tree_8.html)
  * At first we would find the place that the {@code target} would be. since we dont have pointers to parent from children => we use a stack {@code parents} to save the parent nodes
  * To find the closest {@code k} nodes to the {@code target} we try to do an algo like merge sort at every time we try to find the successor of a node and the predecessor of another node the one that has a less
 diff with the target will be added to {@code result}.
  * So at first we start by fetching the successor and predecessor of the {@code target} and then we fetch the successor of the successor or the predecessor of the predecessor and so on...  until we reach {@code k} nodes
  * if its a BST => space complexity O(log n) and time complexity O(k + log n) since finding predecessor and successor consecutively is amortized O(1)
  * [a solution like mine](https://discuss.leetcode.com/topic/23151/o-logn-java-solution-with-two-stacks-following-hint/9) its a comment written by (ofLucas)
  * other people used the stacks to save all nodes that are less to the target in the pred and all nodes greater than target in suc [other solution](https://discuss.leetcode.com/topic/22940/ac-clean-java-solution-using-two-stacks) 

- [Inorder Successor in BST](https://www.programcreek.com/2014/05/leetcode-inorder-successor-in-bst-java/)
  * this can be solved in time: O(log n) and space: O(1)
  * no need for stack to save the parents   * just save the best solution while trying to fetch for the node that you currently on



- [Verify Preorder Serialization of a Binary Tree](https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/description/)
  * I did it based on normal preorder recusion
  * a nicer solution was proposed using: counting the (outdegrees of a nodes - indegrees of a node) at the end it should be = 0
    - [solution](https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/discuss/78551/7-lines-Easy-Java-Solution)

- [Largest BST Subtree](https://www.programcreek.com/2014/07/leetcode-largest-bst-subtree-java/)
  * its a simple Post Order traversal but for every node we return 3 values:
    1. size of subtree
    2. min of subtree
    3. max of subtree
  * [solution](https://www.programcreek.com/2014/07/leetcode-largest-bst-subtree-java/)

- [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/description/)
  - Here they need to only sum the __left Leaves__
  - left means the leaf is a left child


 


- [Russian Doll Envelopes](https://leetcode.com/problems/russian-doll-envelopes/description/)
  * This problem is a DP problem:
    1- sort the problem by __Asc width and Desc height__;
      - WHY???         
      in order to cut the time from O(n^2) to O(n logn) I should fetch all the envelopes that are greater than the current envelop =>
        sort => this means the values in the dp are only the envelopes greater than the current
    2- find a data structure to store the number of envelopes that its stored in
      - we can use an augmented BST => key of node is H and value is the number of envelops that is inside
      - we can benefit from  __Longest Increasing Subsequence__ since we only care about the total number of envelopes inside each other => its the same problem as LIS
  * time: O(n logn), space: O(n) 










- Try to use DummyHead if the head will change its place
- Floyd's Tortoise and Hare (Cycle Detection): Think of using Slow and Fast pointers 
- Runner technique: use more than one pointers separated btw each other with a constant distance (cracking coding interview p93)
- If end -> beginning (reverse order) __ex: Plus One Linked List__ => 2 ways:
  1. recursive
  2. reverse order + compute + reverse order again



  
- [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/description/)
  * use dummy head where dummyHead.next = head of list since the head will change so u should keep track of the new head
  * use two pointers with distance K

- [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/description/)
  * As previous ones
  * use DummyHead

- [Partition List](https://leetcode.com/problems/partition-list/description/)
  * use a dummyHead and a dummyX where the values less than x put them children for dummyHead and values >= x but them as children for dummyX.
  * at end link the last child in dummyHead to the first child in dummyX


- [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/solution/)
  * solved it with changing the next pointer of every node we iterate over to point to a dummy
  * Slow and fast solution is a [nice solution](http://web.archive.org/web/20160323172731/http://learningarsenal.info/index.php/2015/08/24/detecting-start-of-a-loop-in-singly-linked-list/)

- [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/discuss/)
  * __*VEERYYYYY HARDDDD*__
  * __Practice this problem more__   
  * its a follow up to the above problem   
  * this problem can be solved using the Floyds cycle Algo
  * read this [solution](https://discuss.leetcode.com/topic/19367/java-o-1-space-solution-with-detailed-explanation)
  * read about __Floyd Cycle detection in General Info__



- [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/description/)
  * at first reach node at length/2
  * reverse next part of the list
  * compare if the nodes are the same
  * time: O(n), space O(1)

- [The Celebrity Problem](https://www.geeksforgeeks.org/the-celebrity-problem/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__   
  * NOTE: I DIDNT KNOW HOW TO SOLVE IT USING 2 POINTERS BUT I HAD SOME IDEAS => REVIEWWWWWWWWWWWWWWWWWWWWWW
  * SOLVED IT USING S

- [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__   
  * i did it using BST (O(nlogn)):
  * u do BST on the indecies     
  * then for every mid you calculate the number of values in nums < mid and the summation of values in nums btw start and mid
  * then depending on the 2 calculations (count and summation) you choose whether to go to the right or left
  * using the count only is not sufficient due to this scenario {2,5,4,3,3} => we also need summation     
  * check my code
  * the best solution (O(n)) is done using [__Floyd's Tortoise and Hare Cycle__](https://leetcode.com/problems/find-the-duplicate-number/solution/)

- [Add Two Numbers II](https://leetcode.com/problems/add-two-numbers-ii/discuss/)
    * did it in a recursive
    * check my code its a gd solution
    * pay attention for corner cases:       
      - if the last value has also a carry => add one more node with 1 as value
    * use dummyHead

- [Add Strings](https://leetcode.com/problems/add-strings/description/)
  - did it iterative way since its a string => start from end of string and go to beginning
  - used StringBuilder
  
- [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/solution/)
  * My solution :     
  1. get the min lenght of two lists
    1. start both lists from this length away from the end of list
    2. then start iterating over both lists => the point they intersect is the intersection way
  * Their solution: looks like __Linked List Cycle II__ problem [check it out](https://leetcode.com/problems/intersection-of-two-linked-lists/solution/)

- [Plus One Linked List](https://www.programcreek.com/2014/08/leetcode-plus-one-linked-list-java/)
  * 2 solutions:
    1. recursive
    2. reverse order + do addition + reverse again



  - If you have a linked list and you want to get the midpoint (binray search) to use it for algo in and total cost should be O(n)
   => at first start with left of midpoint then do midpoint then continue with right of midpoint check [Question](
  - use Map to save states
  - if you want O(log n) => think something similar to Binary Search Algo
  - try to use cummulative sums and find a way to answer ur problem
  - if u need __randomization + we have very large input__ => use __*Reservoir Sampling*__



- [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/solution/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__   
  * this problem was encountered in the Algo course
  * its a very nice problem
  * [solution](https://leetcode.com/problems/median-of-two-sorted-arrays/solution/)   
  * the above explanation is __SOOOOOOOOOO VVIIIIIIIIIIPPPPPPPPPP__

____



`
- [Search for a Range](https://leetcode.com/problems/search-for-a-range/discuss/)
  * search for target + 1 and target - 1   * your answer is gd 

- [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/)
  * This [solution](https://leetcode.com/problems/insert-interval/discuss/) is a better way to do it and straight forward
    * they start adding the values intervals.get(i).end < newInterval.start
    * then work on intervals of intervals.get(i).start <= newInterval.end (these are the intersecting intervals)
    * after that they just add the left 

- [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/description/)
  * solve it with O(1) space


- [Gas Station](https://leetcode.com/problems/gas-station/discuss/)
  * Didn't know how to solve it
  * __Needs REVIEW__   * __Practice this problem more__

- [Sort List](https://leetcode.com/problems/sort-list/discuss/)
  * did the quick sort
  * VVVIIIIPPPPPP if you have a linked list => you can use MERGE SORT since it will take also O(1) space



- [Max Product Subarray](
  * similar to [Max Subarray](
  * their notes are written in the DP section check them out
  * VVVVVVVVVVVVIIIIIIIPPPPPPPPPPPPPPP


- [Find Peak Element](https://leetcode.com/problems/find-peak-element/description/)
  * it the problem solved in the first course in its first lecture takes O(log n)
  * **Find 2d Peak Element**
    * check lecture 1 course
    * for every column do 1D find peak
    * time: O(logn * logm) 




____

- [Rotate Array](https://leetcode.com/problems/rotate-array/description/)
  * many solution to solve this problem
  * VVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * One interesting solution which is not intuative:
    - reverse all array
    - reverse 0...k-1
    - reverse k...array.lenght -1
  * check [solution](https://leetcode.com/problems/rotate-array/solution/)

- [Contains Duplicate III](https://leetcode.com/problems/contains-duplicate-iii/description/)
  * find indices absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k
  * can use buckets where the key of bucket is nums[v]/t and store in it the last index that hit this bucket
  * in that case you have to when you are checking an index ex: f you have to check bucket nums[f]/t , (nums[f]/t) + 1, (nums[f]/t) - 1
  * then if the index they have is valid
  * O(n) time and O(n) space




- [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/description/)
  * two ways to do it:
    1. O(n + m) [solution](https://discuss.leetcode.com/topic/20064/my-concise-o-m-n-java-solution)
    2. O(m logn) (solution my code) or [solution](https://discuss.leetcode.com/topic/19487/c-two-solutions-o-m-n-o-mlogn)   * first solution is cleverrrrrrr
  * VVVVVVVVVVVVIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP

- [Shortest Word Distance](https://www.programcreek.com/2014/08/leetcode-shortest-word-distance-java/)
- [Shortest Word Distance II](https://www.programcreek.com/2014/07/leetcode-shortest-word-distance-ii-java/)
- [Shortest Word Distance III](https://www.programcreek.com/2014/08/leetcode-shortest-word-distance-iii/)
  * they are similar to each other
  * check my code for solutions or links above

- [H Index](https://leetcode.com/problems/h-index)
  * can solve it in two ways:
    1. sort (O(n + d) bucket sort) then iterate in a Descending manner to reach an index where the (array.length - index) < arrays[index] (O(n))
    2. no need to sort, create an count[n] array [check solution](https://leetcode.com/problems/h-index/discuss/70810/A-Clean-O(N)-Solution-in-Java)

- [H Index II](https://leetcode.com/problems/h-index-ii/description/)
  * its similar to first way of H Index but now the array is sorted so we need to find a way less than O(n) => use Binary Search O(log n)
  * [solution](https://leetcode.com/problems/h-index-ii/discuss/71063/Standard-binary-search)

- [Nested List Weight Sum II](https://www.programcreek.com/2014/08/leetcode-nested-list-weight-sum-ii-java/)
  * solved it in a recursive way

- [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/discuss/?page=1)
  * [solution](https://leetcode.com/problems/merge-k-sorted-lists/solution/)
  * use priorityQueue which size of rows => the queue contains one element from each row

- [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/)
  * similar to __Merge k Sorted Lists__
  * VVVVVIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP


- String matching Algo:
  * [Rabin-Karp algorithm](https://en.wikipedia.org/wiki/Rabin%E2%80%93Karp_algorithm)
    * [check how Hash Function is done](https://www.geeksforgeeks.org/searching-for-patterns-set-3-rabin-karp-algorithm/)
    * in the hash function we dont care about the length of the hash value cz its always mod p (p is prime)
    * check recitation of lecture 9 course 1
    * append(val) = (u*a + val) mod p = (u mod p) * a + val mod p
    * skip(val) = (u - val * (a^(|x| - 1) mod p) mod p = ((u mod p) - val * (a^(|x| - 1) mod p)) mod p
  * [Knuth-Morris-Pratt](https://www.youtube.com/watch?v=D6dCOa_gMoY)

- try to use String.split(regex)

- instead of using One Outer WHILE loop to iterate until it reach end with many if statements for delimiter, use 2 loop the first while loop iterates to reach end of String but the inner keeps iterating until it reaches the delimiter and then starts again by the help of the outer loop [check example](https://discuss.leetcode.com/topic/11410/my-2ms-easy-solution-with-c-c)






---

- [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/discuss/)
  * VVVVIIPPPPP problem should solve it again
  *  __Needs REVIEW__
  * faced some difficulties when solving it with corner cases
  * __solved it in a very difficult way__ using DP but no need => read other solutions from dicussion

- <a id="Longest_Palindromic_Substring"/> [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/solution/) 
  *  __Needs REVIEW__
  * __Practice this problem more__
  * check solution no need for DP
  * DP is needed only if its a sub-sequence no substring
  * to solve this problem in O(n^2) and O(1) space [check](https://leetcode.com/problems/longest-palindromic-substring/solution/)
  * VVVIIIIIPPPPPPP its [DP solution](https://discuss.leetcode.com/topic/25500/share-my-java-solution-using-dynamic-programming)   which helps in many question and makes it faster. nice to know how to do it in dp

- [Shortest Palindrome](https://leetcode.com/problems/shortest-palindrome/description/)
  * did it in the brute force method just like the normal palindrom algo O(n^2)
  * we can do it in O(n) using (Knuth–Morris–Pratt) algorithm
  * [solution](https://leetcode.com/articles/shortest-palindrome/)

- [Word Ladder II](https://leetcode.com/problems/word-ladder-ii/description/)
  * find all shortest transformation sequence(s) from beginWord to endWord
  *  __Needs REVIEW__
  * __Practice this problem more__
  * VVVVVVIIIIIPPPPPPPP
  * use BFS to find all the paths to build the Pie adj list
  * use DFS to starting from the endWord in the the Pie adj list to reach the beginWord and take only the smallest paths 




- [Group Shifted Strings](https://www.geeksforgeeks.org/group-shifted-string/)
  * for every string generate a string that is the difference of every char with its next char in this string
  * and search for the generated string in the map

- [Reconstruct Original Digits from English](https://leetcode.com/problems/reconstruct-original-digits-from-english/description/)
  - did it in a very ugly way
  - knowing that we have only numbers from 0 -> 9 
    - somehow we can find the number of occurrences of every digit using some unique char in its eng name (ex: for 0 its 'z')
  - [solution](https://leetcode.com/problems/reconstruct-original-digits-from-english/discuss/91207/one-pass-O(n)-JAVA-Solution-Simple-and-Clear)

---

---



- if asked to find the next permutation => use **Trie**



**_Hints_**

- **if u want to return combinations**
  - save the values in a temp Collection
  - => use a temp arrayList or set or queue
  - but at the **base case copy all values** to the new array that ur ganna save (ex: **result.add(new ArrayList<>(container))**;)
  
- if u **dont want repetition or the same value in different place or u need to preserve order**
  - **use starting index** where every recursive call will start from this index and upwards
  - => **doesn't look at behind values**
  - ex: for(int **index = startingIndex**; index < nums.length; ++index)

- if we have **duplicates** => **sort the array** at first
  - and skip duplicate values if needed

- **check oneNote on how to solve these kinds of questions**

**_Problems_**


- [Palindrome Permutation II](https://leetcode.com/articles/palindrome-permutation-ii/)
  - use the general permutation way (backtracking)

- [Factor Combinations](https://kennyzhuang.gitbooks.io/leetcode-lock/content/254_factor_combinations.html)
  - did it in DFS
    - pass the multiplier as a start point to decompose the multiplicent so that the decomposed factors are >=  multiplier
      - => preserve the asc order in the resulting array
    - at every result u get even if its a subproblem add it to the result 
      - (we cant wait until we reach the end)
  - I did it using DP
  - can do it like previous problems using DFS (using the general solution)
 

- [Expression Add Operators](https://leetcode.com/problems/expression-add-operators/description/)
  - did it using backtracking general solution
  - did a double backtracking to have a clearer solution
    1.  one for the numbers only
    2.  the other for the signs
  - used the algo of **BASIC CALCULATOR II**
  - check solution with [one-combined DFS](https://leetcode.com/problems/expression-add-operators/discuss/71895/Java-Standard-Backtrace-AC-Solutoin-short-and-clear)

- [Word Squares](http://massivealgorithms.blogspot.com/2016/10/leetcode-425-word-squares.html)
  - used backtracking to get all combinations
  - trie to find the prefix in the previous words
    <a id="Word_Squares"/>

- [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/solution/)
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - VVVVVVVVIIIIPPPPP problem
  - we do backtracking where at every subproblem we **have two choices at index i its either '(' or ')'**
  - => **try both** until we reach close == n and open == n

---



**_Hints_**

- **check oneNote on how to solve these kinds of questions**

**_Problems_**

- [Word Pattern II](https://www.programcreek.com/2014/07/leetcode-word-pattern-ii-java/)

  - time complexity O(n ^ n)
  - use **Word Pattern** problem
  - use a bit from [Justifying para DP problem](https://leetcode.com/submissions/detail/124226772/)

- [Remove Invalid Parentheses](https://leetcode.com/problems/remove-invalid-parentheses/)

  - do a normal DFS
  - time O(n)
  - at every index we recurs twice if current char is '(' or ')':
    1.  with this current char
    2.  without the current char
  - we can optimize it more but i didnt do it

- [Android Unlock Patterns](http://www.learn4master.com/interview-questions/leetcode/leetcode-android-unlock-patterns)

  - this problem asks only for the count of the different combinations and not to output the combinations and still we do backtracking

- [Generalized Abbreviation](https://gist.github.com/cangoal/bb57a4879a3c892566028b74f1ce50ec)

  - did it in a backtracking way
  - [solution](https://gist.github.com/cangoal/bb57a4879a3c892566028b74f1ce50ec)
  - similar to solution 3 in the above link

- [Minimum Unique Word Abbreviation](http://shirleyisnotageek.blogspot.com/2016/10/minimum-unique-word-abbreviation.html)

  - This is a combination of [Valid Word Abbreviation](http://shirleyisnotageek.blogspot.com/2016/10/valid-word-abbreviation.html) and [Generalized Abbreviation](https://gist.github.com/cangoal/bb57a4879a3c892566028b74f1ce50ec)
  - did it in a backtracking way
  - 2 steps to solve:
    1. generate Abbreviations of the word
       - generate them in a **smart way** so that u dont generate all of the abbs
       - **If we find the smallest valid Abb we return** => no need to check rest of Abb
    2. For every Abb generated we check if its valid within the Dict
       - if yes => Disregard it and find the next Abb

- [Additive Number](https://leetcode.com/problems/additive-number/description/)
  - Do back tracking
  - if int is so large => keep them as String and do addition on the fly


---



- [Shortest Distance from All Buildings](https://www.programcreek.com/2014/05/leetcode-shortest-distance-from-all-buildings-java/)

  - DFS in 2d Array
  - similar to "walls and gates"
  - typical DFS or BFS problem
  - I did it using a DFS, try to do it using BFS
  - pay attention to the trick (all building should reach the spot) i didnt implement that but its easy to do

- [Smallest Rectangle Enclosing Black Pixels](http://buttercola.blogspot.fr/2016/01/leetcode-smallest-rectangle-enclosing.html)

- [Walls and Gates](http://buttercola.blogspot.com/2015/09/leetcode-walls-and-gates.html)

---

---







- [Perfect Squares](https://leetcode.com/problems/perfect-squares/description/

  - looks like Knapsack problem
  - time: O(n $\sqrt{n}$)
  - space: O(n)
  - this problem can be solved using a mathematical proof [Lagrange's Four Square theorem]
  - [all solutions](<https://leetcode.com/problems/perfect-squares/discuss/71488/Summary-of-4-different-solutions-(BFS-DP-static-DP-and-mathematics)>)

* [Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/)

  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - VVVVVVVVIIIIPPPPP problem
  - Solved it in two ways: (check both functions in code)
    1.  solved it in a full DP approach O($k\*I^2$)
    2.  but then i optimized it to O($K\*I$) VVVIIIIPPPPPPP method:
        1.  by saving the state of max profit upon buying a current stock on specific day.
        2.  This specific day should be < current day since the current day is the day to sell this bought stock
        3.  NOTE: buying a current stock at a specific day means that the previous stock should be sold if I bought a previous stock before
  - Equivalence with **Knapsack** => the Sac Size here is the number of transactions and the items here are the prices every day
  - did it in general for K transactions, it looks like Knapsack and stock hw problem
  - [explanation of my solution](https://discuss.leetcode.com/topic/4766/a-clean-dp-solution-which-generalizes-to-k-transactions)


* [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/)

  - in this question we dont have a limit on Transactions => no need for second dimension of length K like previous problems
    => only 1 is needed over the prices of every day
  - The problem here is the cool down => we need to keep the max profit after sell up till before yesterday so that we can calculate **maxProfitAfterBuy = max(profitAfterBuy, profitPreviousSell - price[i])**
    => we need to limit current maxProfitPreviousSell to max (i - 2) position
    => we always check max(maxProfitPreviousSell, profitAfterSellOfBeforeYesterday) => max(maxProfitPreviousSell, dp[i - 2])
  - we only need a dp[] to save the profitOfSell on everyday => space complexity O(n)
    - we can optimize the space complexity to O(1) by saving:
      1.  maxProfitPreviousSell (this is max profit after sell up till before yesterday)
      2.  profitMinus2 (profit Of Yesterday)
      3.  profitMinus1 (profit of Current)
  - check my code
  - most optimized algo:
    - time: O(N)
    - space: O(1)

---





- [Edit distance](https://leetcode.com/problems/edit-distance/)

  - DP problem which is similar to wildcard matching and Regular Expression Matching problems

- [One Edit Distance](http://www.geeksforgeeks.org/check-if-two-given-strings-are-at-edit-distance-one/)

  - simpler version of Edit Distance which only takes O(n + m) time

- [Wildcard Matching](https://leetcode.com/problems/wildcard-matching/description/)

  - check [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/description/) which was solved using recursion
  - solved this problem using topo sort
  - its a DP similar to Edit Distance with some modifications

- [N-Queens](https://leetcode.com/problems/n-queens/)

  - Can be done using DP

- [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)

  - <a id="Maximum_Sum_Subarray">Maximum Subarray</a>
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - Find a way to do it in O(n) (DP)
  - It can be done using Divide and Conquer O(n lgn)

- [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/description/)

  - <a id="Maximum_Product_Subarray">Maximum Product Subarray</a>
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - Find a way to do it in O(n) (DP)
  - for O(n) it differs from the of Max Sum Subarray by at every current value we calculate the Min and Max current value **ex: MaxCurrentValue = Math.max(nums[index], Math.max(maxProduct - nums[index], minProduct - nums[index]))** and the same for MinCurrentValue
  - It can be done using Divide and Conquer O(n lgn)
  - for D&C its a bit different from that of Max Sum Subarray by also keeping track of min on Left and min on Right to multiply them by each other and check if their product is the max

- [Palindrome Partitioning II](https://leetcode.com/problems/palindrome-partitioning-ii/description/)

  - VVVVVIIIIIIPPPPPPPP problemm
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - can use the solution of [Longest Palindromic Substring]
  - the modification is whenever you have a palindrome (even if its not the largest one) check the necessary on cntds on it!!!!!
  - It was so hard to solve it despite the solution was easy



- [Integer Replacement](https://leetcode.com/problems/integer-replacement/description/)

  - solve it using recursive + memorization
  - **note use long instead of int for corner cases**

  ```java
   if(num % 2 == 0)
        return dp[num] = 1 + solve(num/2);
    else
      return dp[num] = 1 + min(solve(num+1), solve(num-1));
  ```



- [Bomb Enemy](http://massivealgorithms.blogspot.com/2016/06/leetcode-361-bomb-enemy.html)

  - easy to do it in brute force
  - but we can do it in time: O(mn) and space O(n) where m = rows and n = columns
  - check the solution in the link or check my solution
  - the brute force method is doing the same stuff many times so if we use a dp we can get the info needed of the current cell from the previous cell






- [Paint Fence](https://www.programcreek.com/2014/05/leetcode-pain-fence-java/)

  - looks like the [House Robber problem](
  - use traversal DP to solve this
  - O(n)
  - not necessary to use array[n] its sufficient to use only to variable (paintLikePrevious, dontPaintLikePrevious) => space: O(1)


- [Nim Game](https://leetcode.com/problems/nim-game/description/)
  - looks like **alternating coin game lecture 10 course 2**
  - somehow we have to find dp[n] = max(min(...), min(....))
  - [solution](https://leetcode.com/problems/nim-game/discuss/134338/Formal-way-of-dynamic-programming-(DP))



- [Word Break II](https://leetcode.com/problems/word-break-ii/description/)

  - its a typical DP problem
  - It would be slow to to save all the String combinations while doing the DP instead for starting index save the possible ending indices
  - and then after finishing the DP do a DFS starting from index 0
  - solution like what i did [check solution 2](https://www.programcreek.com/2014/03/leetcode-word-break-ii-java/)

---



- [Different Ways to Add Parentheses](https://leetcode.com/problems/different-ways-to-add-parentheses/description/)

  - VVVVVVVVVVVIIIIIIIIIIIIPPPPPPPPPPPPPPPPPP
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - NOTE: looks like the Matrix Multiplication DP problem in course
  - can do it recursively and iter dp
  - time O(2^n) since we are outputting all the combinations and not the max
  - I thought i can do it like the the [general solution in the permutation] but it seems it cant be solved cz its hard to remove duplicate solutions
  - [solution](https://discuss.leetcode.com/topic/26076/java-recursive-9ms-and-dp-4ms-solution)

- [Scramble String](https://leetcode.com/problems/scramble-string/description/)

  - The difference btw scrambling and permutation is that in scrambling a subtree for the first word should have the same letters (diff order) as a subtree in the second word
  - looking at the example they gave, subtree "eat" and "tae" have the same letters but scrambled since subtree "at" and "ta" are scramble and "e" == "e" => these subtrees are scrambled with respect to each other
  - The important thing is that the sibling of the leaf nodes are the same in both trees (ex: "a" and "t" are sibling in "at" subtree and "t" and "a" are sibling in "ta") and ("e" and "at" are sibling in "eat" and "ta" and "e" are sibling in "tae" => "eat" and "tea" are scramble with respect to each other)
  - **_note: in order to know if two substrings are scramble They should have the same LENGTH_** => THATS WHY WE HAVE A LOOP OVER LENGTH
  - This problem looks like **Parenthesis DP Problem** (from inside to outside)
  - could be done in O(n^3) using DP and recursion.
  - check discussion to see the idea behind in for more info if you needed

- [Burst Balloons](https://leetcode.com/problems/burst-balloons/discuss/76228/Share-some-analysis-and-explanations)

  - VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  - **Needs REVIEW**
  - **Practice this problem more**
  - this problem is **substring DP x[i:j]** just like the Parenthesis dp problem course 1 lec21
  - the **trick** in this problem is: Instead of divide the problem by the first balloon to burst, we divide the problem by the last balloon to burst.
  - [explanation](https://leetcode.com/problems/burst-balloons/discuss/76228/Share-some-analysis-and-explanations)

---

---

---



**_Hints_**

- use Greedy when **optimization problem** with **unity weight**
- check _Greedy_ and _Greedy vs DP sections_ in OneNote



- **Interval Scheduling**

  - check course 2 lecture 1
  - check Greedy section oneNote
  - sort by finishing time
  - Approach
    - use first finishing time rule to select interval i
    - reject all intervals that overlap selected i
    - repeat until we finish

- [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/)
  - same solution as the interval scheduling idea
  - sort by finish time
  - instead of removing the overlapping now we have to count them

---

---

---



**_Hints_**

- Think about **you will have start and end index**
- String matching Algo:
  - [Rabin-Karp algorithm](https://en.wikipedia.org/wiki/Rabin%E2%80%93Karp_algorithm)
    - [check how Hash Function is done](https://www.geeksforgeeks.org/searching-for-patterns-set-3-rabin-karp-algorithm/)
    - in the hash function we dont care about the length of the hash value cz its always mod p (p is prime)
    - check recitation of lecture 9 course 1
    - append(val) = (u*a + val) mod p = (u mod p) * a + val mod p
    - skip(val) = (u - val _ (a^(|u| - 1) mod p) mod p = ((u mod p) - val _ (a^(|u| - 1) mod p)) mod p
  - [Knuth-Morris-Pratt](https://www.youtube.com/watch?v=D6dCOa_gMoY)




- [Longest Substring with At Most Two Distinct Characters](http://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/)

  - its similar to [Longest Substring Without Repeating Characters](
  - you can use to indecies start and end => O(n)
  - use int[128] to save info
  - check my code submission for this problem its neat
  - [generic solutions](https://discuss.leetcode.com/topic/71662/sliding-window-algorithm-template-to-solve-all-the-leetcode-substring-search-problem)

- [Longest Substring with At Most K Distinct Characters](https://www.programcreek.com/2013/02/longest-substring-which-contains-2-unique-characters/)

  - its a generic solution to the above problem(at most 2)
  - [solution](https://www.programcreek.com/2013/02/longest-substring-which-contains-2-unique-characters/)

- [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/description/)

  - VVVVVVVVVVVVIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
  - **Needs REVIEW**
  - **Practice this problem more**
  - here we have to do like the Amortized HW in course 2 (queue with MIN in O(1) amortized)
  - use the same algo
  - check code or [solution](https://discuss.leetcode.com/topic/19055/java-o-n-solution-using-deque-with-explanation)

---

---

---



- find the next permutation



- [Implement Trie](https://leetcode.com/problems/implement-trie-prefix-tree/description/)

  - implement a [Trie tree](
  - check general information for more info about it
  - [solution](https://leetcode.com/articles/implement-trie-prefix-tree/)

---



- [Add and Search Word](https://leetcode.com/problems/add-and-search-word-data-structure-design/description/)

  - it uses the [Trie tree](
  - but here we have to pay attention for the **wild card** => in the **search method** do it in recursive way


- [Word Search II](

- [Word Squares](

- [Minimum Genetic Mutation](
  - use the trie even do we have diff char
  - => if we reach a diff char loop over all children in current TrieNode


- [Lexicographical Numbers](https://leetcode.com/problems/lexicographical-numbers/description/)
  - VVVVVVVVVVVIIIIIIIIIIIIPPPPPPPPPPPPPPPPPP
  - **STUDY THIS PROBLEM**
  - **Needs REVIEW**
  - I used DFS to implement a TRIE in order to solve the problem
  - it uses the [Trie tree](
  - why Trie? since as mentioned in its definition **a Trie is used to enumerate a set of string according to their Lexi order**



- [Course Schedule](https://leetcode.com/problems/course-schedule/description/

  - its a dependency problem and we must find a cycle
  - so we can do it using topolical sort or DFS if at a certain point the adj vertex is grey => we have a cycle
  - pay attention when they say **to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]** => the is directed

- [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/description/)
  - we must output the courses in the needed order => TOPOLOGICAL SORT

---



- [Evaluate Division](https://leetcode.com/problems/evaluate-division/description/)

  - its similar to **alien language problem**
  - make every String in the equations a vertex => the numerators and denominators arte vertices
  - the edges btw the vertices are weighted => weight btw 2 vertices X and Y = to X/Y
  - => to calculate the division btw X/Y we should do a DFS or BFS from X to Y
  - **NOTE: I DONT CARE WHAT GRAPH ALGO I USE CZ THE DIVISION WILL ALWAYS BE THE SAME => SAME TO USE DFS OR DIJKASTRA**


---



---

---

---





- join of 2 red/black trees
  - check algo -> course 1 -> unit 3 -> old ps

---





**_Hints_**

- Use a modified BFS
  - to pass on only the nodes that are on the same level at a time
    - Inside the !queue.isEmpty() while loop **do a for loop for the currentlevel size**
    - currentLevelSize = queue.size()

**_Problems_**


- [N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/)

  - used modified BFS for current Level traversal
  - [solution](https://leetcode.com/submissions/detail/171229904/)

- [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/)

  - did it using preOrder Traversal
  - nice way to do it using [BFS](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/discuss/)



---



**_Hints_**

- PreOrder Traversal
- save values seen before

**_Problems_**

- [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/)

  - Pay attention that the **condition holds if we are on a leaf node and the sum == 0** and not when reaching a null node
  - since:
    - if we have only a null node as a root we shouldnt return anything
    - if we may added the list twice (when reaching right child of leaf null and left child where both are null)

- [Path Sum III](

---







- [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/description/)
  * use Quick Select
  * pay attention how to pick the pivot [use ur solution](https://leetcode.com/problems/kth-largest-element-in-an-array/)
  * and how to decide if u recurse left or right here is reversed from the normal quick sort since they ask for the kth largest and not smallest
  * O(n)
  * VVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPP

- [H-Index II](https://leetcode.com/problems/h-index-ii/description/)
  - can be solved in binary search

  ``` java
    int rankLargest = citations.length - mid;
    
    if (rankLargest > citations[mid]) {
        start = mid + 1;
    } else {
        maxCitation = Math.max(maxCitation, rankLargest);
        end = mid - 1;
    }
  ```
---

---

---



- <a id="Find_Right_Interval"></a>[Find Right Interval](https://leetcode.com/problems/find-right-interval/description/)
  - since they want the first starting interval j of interval
    => used the trick (sorting + finding right interalv) of **weighted interval scheduling**
  - used the idea of indirect sorting (RTDB uses it) where we sort the indices of original array
    - use customized Comparator
  - [solution](<https://leetcode.com/problems/find-right-interval/discuss/162162/Indirect-sorting-(use-indices-to-sort)-+-customized-Comparator>)
  - Approach:
    - sort intervals based on starting point
    - traverse sorted intervals from n-1 -> 0
    - at every interval at index t binary search the sorted array from t -> n -1
      - in order to find the needed starting pint






---

---

---



- [Find Right Interval](

  - sort by starting point

- [Interval Scheduling](
  - similar to the problem in course2 lect 1
  - sort by finishing time



---

---

---





**_Hints_**

- create an array to **store the cumulative sum at every index**

**_Problems_**

- [Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/description/)

  - nice problem
  - create an intermidiate int[][] dp to save in it the sum of the square btw the current point and (0,0)
  - [solution](https://leetcode.com/problems/range-sum-query-2d-immutable/solution/)
  - i did the last solution

- [Maximum Size Subarray Sum Equals k](https://www.programcreek.com/2014/10/leetcode-maximum-size-subarray-sum-equals-k-java/)

  - VVVVVVVVVVVVVVIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPP
  - **Needs REVIEW**
  - **Practice this problem more**
  - could solve in using DP => O(KN)
  - but i did it by only one pass:
    - upon looping save the cummulative sum of every index in a Map, The key of map should be the sum and the value is the index
    - if we have encountered the same sum twice => save only the first index
    - upon every index try to find diff = currentCummulaticeSum - k if it exists. If yes fint the length of the subarray that sums to k
    - I used ideas from **Range Sum Query - Immutable**
  - time: O(n) space: O(n)

- [Max Sum of Rectangle No Larger Than K](https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/description/)

  - VVVVVVVVVVVVVVIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPP
  - **Needs REVIEW**
  - **Practice this problem more**
  - this problem is a combination of several problem
  - time: O(columns^2 _ rows _ log(rows))
  - space: O(rows)
  - approch:
    1. transform the 2D array to 1D. How?
    - get all combinations between the consecutive columns => time: O(columns^2)
      - ex: assum we have 3 columns for 1 (1->1, 1->2, 1->3), for 2: (2->2, 2->3), for 3: (3->3)
    1. for every 1D array use **Range Sum Query - Immutable** algo to solve the problem
    - but here we need currentCum - lowerCum <= k
    - => so we can use a TreeSet => lowerCum = treeset.ceiling(currentCum - k)
    1. use maxSum = Math.max(maxSum, currentCum - lowerCum)

- [Path Sum III](https://leetcode.com/problems/path-sum-iii/description/)
  <a id="Path_Sum_III"></a>
  - use a map to store the cummulative sum
  - and every time find if we have a countOfDiff = map.get(currentSum - sum)
  - if we find => add countOfDiff to the count

---

---

---



**_Hints_**

- pay attention for overflows (ex: **Guess Number Higher or Lower**)
- try to find a pattern
  - a way so that current state can be represented in previous state, ex(Rotate Function problem): **F(k) - F(k - 1) = .....**
- if we have **'(' or ')'** think about calling **method recursively**

**_Problems_**



- [Count Primes](https://leetcode.com/problems/count-primes/description/)
  - check oneNote -> Math part
  - lets start with finding a Prim it takes O(radical n)
    - since it will be a FOR LOOP FROM 2 TO RADICAL(N)
  - now if we look at number of primes less than N => its takes O(n) time and space
    - Algo: [solution](https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/)
    - pass by every prim number starting from 2 up till n-1 and check its multiples

---



- [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/discuss/)
  - use stack to solve it

- [Basic Calculator](https://leetcode.com/problems/basic-calculator/description/)
  - call the **calculate function recursively when u reach a '(' char**
  - check call its only O(n)
  - **use isAddition** (that is set according to meeting a '+' or '-') to record the operation thats ganna happen with the next number

- [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/description/)
  - VVVVVVVVVVIIIIIIIPPPPPPPPPPP
  - __Needs REVIEW__
  - __Practice this problem more__
  - now since we have * and / we have to walk and look for the operators and then depending on operator we treat the previous value and the current value
  - no need for stack => O(n) time O(1) space
  - check [solution](https://discuss.leetcode.com/topic/17435/java-straight-forward-iteration-solution-with-comments-no-stack-o-n-o-1)

---



- [pow](https://leetcode.com/problems/powx-n/)

  - can be done in O(log n)
  - we have **2 corner cases**:
    - we do the **if(n < 0)** after the recursive call and not before
      - since n may be equal to Integer.MIN_VALUE => if we transformed it into n = -n at the beginning we will have overflow
    - if n == 0 => return 1
  - check this [solution](https://leetcode.com/submissions/detail/171618647/)

- [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/discuss/)
  - VVVVVVVVVVIIIIIIIPPPPPPPPPPP
  - **Needs REVIEW**
  - **Practice this problem more**
  - The only tricky thing about this problem is to determine how many 5s are there.
    - so divide by 5 and by powers of 5
  - VVIIIPPPP: very nice [explanation](https://discuss.leetcode.com/topic/6513/simple-c-c-solution-with-detailed-explaination)
  - check my solution is based on this [link](https://math.stackexchange.com/questions/142126/how-many-zeroes-are-in-100)

---



- [Rectangle Area](https://leetcode.com/problems/rectangle-area/discuss/62138)
  - Area = Arec1 + Arec2 - Aintersection
  - Aintersection = (Max(left) - Min(Right)) * (Min(upper) - Max(bottom))
  - if (Min(upper) <= Max(bottom) || Max(left) >= Min(Right)) => **they dont intersect**
  - [solution](https://leetcode.com/submissions/detail/171631752/)

---



- [Number of Digit One](https://leetcode.com/problems/number-of-digit-one/solution/)
  - can be done in O(logn) the base of log is 10
  - the values between the () is equal to all the possible number of ones up until the previous digit
    - example: for digit 3 the () is all the possible 1s < 1000
  - check the code to understand explanation
  - [official solution](https://leetcode.com/articles/number-of-digit-one/)
  - ![explanation](./NumberOfDigitOne.jpeg)



- [Count Numbers with Unique Digits](https://leetcode.com/problems/count-numbers-with-unique-digits/description/)
  - this problem is basically a permutation problem since they want to count the number with unique digits => permutation of 9Pn
  - we solve it using DP since f(n) = f(n-1)* (10- (n-1))
    => check [solution](https://leetcode.com/problems/count-numbers-with-unique-digits/discuss/83041/JAVA-DP-O(1)-solution.)

---



- [Missing Number](https://leetcode.com/problems/missing-number/description/)
  - Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
  - use Gauss Formula **(arithmetic series) = n(n+1)/2**
  - can be also solved using bit manipulation (VVVVVIIIIPPPPPP)
  - [solution](https://leetcode.com/problems/missing-number/solution/)

- [Arithmetic Slices](https://leetcode.com/problems/arithmetic-slices/description/)
  - VVVVVVIIIIPPPPPPP
  - Idea uses **arithmetic series calculation**
  - There are 3 steps to do here
    1. we need to find the appropriate windows for the series determind 
        - I used two pointers left and right
        - As long as A[right] - A[right - 1] = Current_Window_Diff we ++right => current window increase
    2. Determine number of **combinations per window**
        - this is the arithmetic series calculation part
        - $count/window = \sum_{j= 3}^{len} \sum_{k= 3}^{j} 1 = \dfrac{(len - 2)*(len - 1)  }{2}$
    3. Total count = sum(combinations per window)
  - time O(n)
  - space O(1)

- [Arranging Coins](https://leetcode.com/problems/arranging-coins/description/)
  - use arithmetic series
  - this time we have the total number n
    - => $\sum_{j= 1}^{k} i = n \rightarrow \dfrac{k^2}{2} + \dfrac{k}{1} - n \leq 0 \rightarrow$  k = positive root of equation

- [RotateFunction](https://leetcode.com/problems/rotate-function/)
  - consider finding patterns (F(n) = F(n-1).... )
  - [other solution using F(k) - F(k - 1)](https://leetcode.com/problems/rotate-function/discuss/87853/Java-O(n)-solution-with-explanation)
  - ![explanation](./RotateFunction.jpeg)
  - time: O(n)

---



- [Power of Three](https://leetcode.com/articles/power-of-three)
  - i did it using for loop => O(log3 n)
  - the O(1) solution is so silly:  return n > 0 && 1162261467 % n == 0;
  - check their solution

---

---

---

---



**_Hints_**

- Floyd's Tortoise and Hare
  - [link1](http://web.archive.org/web/20160323172731/http://learningarsenal.info/index.php/2015/08/24/detecting-start-of-a-loop-in-singly-linked-list/)
  - [link2](http://umairsaeed.com/blog/2011/06/23/finding-the-start-of-a-loop-in-a-circular-linked-list/)

**_Problems_**



- [Happy Number](https://leetcode.com/problems/happy-number/description/)
  - [explanation](https://leetcode.com/problems/happy-number/discuss/56919)
  - [my solution with Set](https://leetcode.com/problems/happy-number/discuss/56913)
  - [nice solution using Floyd cycle algo](https://leetcode.com/problems/happy-number/discuss/56917)
  - read more aboud Floyd Cycle in down in general info secion
---

---

---



- [Majority Element](https://leetcode.com/problems/majority-element/description/)
  - Read about [Boyer-Moore Algo](
  - runs in O(n) time and O(1) space
  - majority element must be > n/2
  - VVVVVVVVVVVVIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP


- [Majority Element II](https://leetcode.com/problems/majority-element-ii/description/)
  - its the generic form of Boyer-Moore algo
  - in this case they asked for: all number that are greater > n/3 => we have at most 2 numbers
  - Algo: we need two pointer one for each majority
  - VVVIIIPPP NOTE: while iterating if candidate1 passes by an index that has value of candidate2 we don't decrement the counter of candidate1 we only increments candidate2's counter
  - [solution](https://discuss.leetcode.com/topic/17564/boyer-moore-majority-vote-algorithm-and-my-elaboration)
  
---

---

---



**_Hints_**

- pay attention when calculating the mid (from **overflow**)
  - do **int mid = start + ((end-start) /2)**

**_Problems_**

- [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/description/)
  - its a normal binary search
  - the trick here is to watch for __overflow__ when calculating the mid
    - so dont write int mid = (start + end)/2
    - u should write  int mid = start + ((end-start) /2);
  - [solution](https://leetcode.com/articles/guess-number-higher-or-lower/)

---

---

---

---



- [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/description/)
  * Think about dividing the number by 26
  * check my solution

- [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)
  * similar to __Excel Sheet Column Title__
____





____




- [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/description/)
  * since its only lower case letters => we can use int[26] => space complexity O(1)
  * iterate over string and check we if we have char previosly if yes => record its value in array as Integer.Max_value to say it has been removed

- [Longest Absolute File Path](https://leetcode.com/problems/longest-absolute-file-path/description/)
  * Pay attention:
    - \n and \t are one char
    - file/folder names can contains spaces
  * Idea:
    - Every level store its cummulative value in a __stack__
    - count number of \t preceeding the file/dir name => this number tells u which level the current file/dir will be
      - if stack.size > level => we are in a parallel level => we need to remove from the stack until we reach equal size
      - when removed from stack => input the current level value to stack
      - if current file/dir is a file => longestLength = Math.max(longestLength, sizeOfCurrentFile);
    - continue until we reach input.size()


____




- [Longest Substring with At Least K Repeating Characters](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/)
  * VVVVVVVVVVIIIIIIIPPPPPPPPPPP
  *  __Needs REVIEW__
  * __Practice this problem more__
  * this problem is a typical D&G
    * Divide: loop over string from start to end starting with newSTR = start
      - if we reach an index i where its char has  __freq < k__
        - recurse from newSTR -> i - 1
        - then __newSTR = i + 1__
    * Conquer: if we dont have a char with freq < k =>  current maxLength = start - end + 1 = length of string in current recurrsion state
  * time: O(n logn) 
  * NOTE: its not exponential since the division is btw newSTR -> i - 1 that only happens O(log n) times __check my code for more explanation__


____



  - Think of using TreeSet or TreeMap




- [Min Stack](https://leetcode.com/problems/min-stack/description/)
  * desinged it using one stack and an array to keep track of the min value
  * this question is similar to the HW problem of __Min Queque__ but the hw was harder since it depends on __*Amortization*__

____



____


- [All O`one Data Structure](https://leetcode.com/problems/all-oone-data-structure/description/)
  - used a Map to store for every key its place in the linked list
    - => increment and decrement in O(1)
  - used a linked list to create nodes:
    - node key is the number of occurence (1,2,...)
    - its a doublly linked list
  - Store first and last node of linked list
    - => getMax and getMin: O(1) 

____


- [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/solution/)
  * use two stacks
  * we pop() or peek() are called   * check if stack2 is empty poll last all elements from stack1 and put them in stack2
    * return last of stack2
  * O(1) per operation amortized
  * [solution](https://leetcode.com/articles/implement-queue-using-stacks/)

- [Implement Stack using Queues](https://leetcode.com/articles/implement-stack-using-queues/)
  * [solution](https://leetcode.com/articles/implement-stack-using-queues/)

____





- [Peeking Iterator](https://leetcode.com/problems/peeking-iterator/description/)
  * check code for best solution    * in the peek() do iterator.next() and save it in a variable (called peekValue)
  * should have a field (isStillValid) to check if the current peekValue is still valid



____




- [Data Stream as Disjoint Intervals](https://leetcode.com/problems/data-stream-as-disjoint-intervals/description/)
  * VVVVVVVVVVIIIIIIIPPPPPPPPPPP
  *  __Needs REVIEW__
  * __Practice this problem more__
  * In this problem we are implementing an __Interval Tree__ => check __OneNote__
  * we are using a TreeSet (and not a HashMap) to maintain the sorting order of the intervals
  * the __Key__ of the Tree is Interval.start which is sufficent to brin tree.lower(interval) and tree.higher(interval)
  * [solution](https://leetcode.com/problems/data-stream-as-disjoint-intervals/discuss/120827/Java-solution-that-beats-95.58-using-a-simple-TreeSet)

____



- [Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/description/
  * use a List<Integer> to store the values
  * Map of value to integer
  * Remove method: when u remove a value u take the last value in list and then remove and put it in the index of value removed
  * Add method: always add to end of list
  * Random method: use Random api to get random index from list
  * O(1) all operations

- [Insert Delete GetRandom O(1) - Duplicates allowed](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/description/)
  * similar to above problem but this time the Map should contain a set of indecies corresponding to this value

- [Shuffle an Array](https://leetcode.com/problems/shuffle-an-array/description/)
  * Algo:
    1. In order to return a shuffled array we can at first make a copy of the original array lets call it shuffledArray
    2. Every time shuffle() is called => loop from index: 0 -> length
      -  int randomIndex = random.nextInt(shuffledArray.length - index) + index;
      - swap(this.shuffledArray, randomIndex, index);
  * time: O(n)/shuffle



- [reservoir sampling](https://www.geeksforgeeks.org/reservoir-sampling/)


- [Linked List Random Node](https://leetcode.com/problems/linked-list-random-node/description/)
  * I used a List to store the ListNode and then randomize to pick
  * but What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?
    * then now we use [reservoir sampling](https://www.geeksforgeeks.org/reservoir-sampling/)
    * time: O(n)/operation
    * Algo:
      1. Create an array reservoir[0..k-1] and copy first k items of stream[] to it.
      2. Now one by one consider all items from (k+1)th item to nth item.
        - Generate a random number from 0 to i where i is index of current item in stream[]. Let the generated random number is j.
        - If j is in range 0 to k-1, replace reservoir[j] with arr[i]
      3. In our case k = 1

- [Random Pick Index](https://leetcode.com/problems/random-pick-index/description/)
    * since array is too large => use reservoir sampling where k = 1;
    * use count of how many occurance of current value as upper bound
    * use rnd.nextInt(++count) == 0 to decide whether to take the current index or not

    ```` java
      public int pick(int target) {
          int result = -1;
          int count = 0;
          for (int i = 0; i < nums.length; i++) {
              if (nums[i] != target)
                  continue;
              if (rnd.nextInt(++count) == 0)
                  result = i;
          }
          
          return result;
      }
    ````

____





- [Design Twitter](https://leetcode.com/problems/design-twitter/discuss/)
  * As you may know, there are 2 main approaches for this design:
    1. The first has some distributed complexity in all the operations and an O(1) getNewsFeed.
    2. The second is the O(1) for all operations and most of the complexity is the getNewsFeed.
  * __Which is better and why?__ I beleive that this is not an algorithmic/design problem this is a UX problem. Regardless of the actual complexities. Let's say that we have 2 users the first has 1M followers (people following him/her), let's call this user celebrity and the second user is following 1M other users and let's call this user normal.
    * __Design 1 => The O(1) getNewsFeed.__ While both of the users will have a very fast and nice getNewsFeed experience let's think about posting a tweet. 
      * The celerity will have a bad experience whenever he is posting a tweet and that's because he/she has a lot of followers and his new tweet will need somehow to be published to all the news feeds of the 1M followers.
      * The normal user will post a tweet in almost no time because he has very few or no followers.
    * __Design 2 => The Complex getNewsFeed.__ This time both of the users will enjoy a fantastic O(1) post tweet, but then when it comes to getting the news feed.
      * The celebrity will is following few others and aggregating his/her news feed won't take long.
      * Although the normal user who is following 1M users will need sometime to aggregate his very complex news feed.

  * Now, if you took a closer look at the previous comparison you will find that the user who has taken explicit actions to follow lots and lots of people is making his/her feed complex, he/she unfollows people it becomse simpler. Although the celebrity who is not following a lot is getting better experience because he/she has not taken explicit actions to make other people follow him.

  * In other words, the first design is somehow punishing the celebrities for getting more and more followers while the second design is punishing the users who follow a lot of people. 









  - pay attention for overflows (ex: __Guess Number Higher or Lower__) 
  - try to find a way so that current state can be represented in previous state, ex(Rotate Function problem): F(k) - F(k - 1) = .....
























- if an sql doesn't return a value and you want it to return a null => make it an inline select (PS: SELECT should return only 1 value)
- [assigning value to variable Mysql ](https://stackoverflow.com/questions/39379659/what-does-the-operator-mean-in-mysql)
- nice way to initialize variables without set => make a nested select for initializing variables. [TAKE A LOOK](http://fellowtuts.com/mysql/query-to-obtain-rank-function-in-mysql/)
- always watch out for the alias outputted *dont forget it*
- can use tuples for IN clause since in mySQl it allows that [check](https://leetcode.com/problems/department-highest-salary/solution/)
- Delete row: DELETE FROM table WHERE [CLAUSE]
- use [CASE WHEN](https://www.w3schools.com/sql/func_mysql_case.asp)
- use [BETWEEN](https://www.techonthenet.com/mysql/between.php)
- use [ROUND](https://dev.mysql.com/doc/refman/5.7/en/mathematical-functions.html
- DATE FUNCTIONS:   - [DATE_SUB](https://w3resource.com/mysql/date-and-time-functions/mysql-date_sub-function.php),   - [DATEDIFF](https://w3resource.com/mysql/date-and-time-functions/mysql-datediff-function.php)



- [Nth Highest Salary](https://leetcode.com/problems/nth-highest-salary/description/)
  * function in mysql [check your solution](https://leetcode.com/problems/nth-highest-salary/description/)
  * declare variables
  * use [range limits](https://stackoverflow.com/questions/14536013/what-is-the-difference-between-mysql-limit-range-of-0-500-and-1-500)

- [Rank Scores](https://leetcode.com/problems/rank-scores/description/)
  * VVVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  * __Practice this problem more__
  * this question can be solved using variables and without variables (check solution links below)
  * the solution without variables looks like __cumulative solution__
  * [solution](https://discuss.leetcode.com/topic/16097/simple-short-fast)
  * [tutorial](http://fellowtuts.com/mysql/query-to-obtain-rank-function-in-mysql/)

- [Consecutive Numbers](https://leetcode.com/problems/consecutive-numbers/discuss/)
  * 3 consecutive Numbers should be the same => use 3 joins

- [Employees Earning More Than Their Managers](https://leetcode.com/problems/employees-earning-more-than-their-managers/discuss/)
  * join table with itself

- [Duplicate Emails](https://leetcode.com/problems/duplicate-emails/description/)
  * use having to get count > 1

- [Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/description/)
  * use __Left join__ + __having count(...) = 0__
  * [better approach](https://leetcode.com/problems/customers-who-never-order/solution/)
  * use __Not In__


- [Department Top Three Salaries](https://leetcode.com/problems/department-top-three-salaries/solution/)
  * did it in a hard way
  * [solution](https://leetcode.com/problems/department-top-three-salaries/solution/) is done in a much nicer way with a 3>(select....) in the where cndts

- [Trips and Users](https://leetcode.com/problems/trips-and-users/description/)
  * use [CASE WHEN](https://www.w3schools.com/sql/func_mysql_case.asp)
  * use [BETWEEN](https://www.techonthenet.com/mysql/between.php)
  * use [ROUND](https://dev.mysql.com/doc/refman/5.7/en/mathematical-functions.html
  * [solution](https://leetcode.com/problems/trips-and-users/discuss/69151)









  - use ^
  - use int[32] to store infor about every bit like in the singleNumberII
  - use Integer.lowestOneBit(n) (check documentaion in General Info)
  - n & (n - 1) to check if power of 2
  - sometimse you can use constants like __0x55555555__ to check something (check Power of Four problem)
  - check [summary](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary:-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)
  - instead of doing (1<<i & n) try to do (n>>i & 1)
  - https://stackoverflow.com/questions/1677957/why-byte-b-byte-0xff-is-equals-to-integer-1
  - to change from decimal to Base B take adv of "int number in java is actually represented in binary" (ex: check __Convert a Number to Hexadecimal problem__)



- [Reverse Bits](https://leetcode.com/problems/reverse-bits/description/)
  * check this [solution](https://leetcode.com/problems/reverse-bits/discuss/54950)

- [Power of Two](https://leetcode.com/problems/power-of-two/discuss/)
 * did it using Integer.bitCount(n);
 * another way is to do: n & (n - 1)   
    - since if n = 4 (100) => n - 1 = 3 (11) => n & (n - 1) = 0


_____




- [Pairwise Swap](https://www.geeksforgeeks.org/swap-all-odd-and-even-bits/)
  * Operating on individual pair of bits is difficult => solve in another way
  * divide problem to 2 parts:
    1. odd bits
    2. even bits
  * question: Can we take a number n and move the odd bits over by 1?
    * __Answer: x & 0xaaaaaaaa >>> 1__
  * Note: here we used __logical right shift__ instead of arithmetic cz we want the sign bit to be filled with a zero
____
- [Bitwise AND of Numbers Range](https://leetcode.com/problems/bitwise-and-of-numbers-range/description/)
  * VVVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  * __Practice this problem more__
  * the value will contain only the bits that stay the same through out the range
  * the bits that will stay the same are the common prefix bits btw the smallest and largest number
  * check intellij code for more comments
  * [solutoin](https://leetcode.com/problems/bitwise-and-of-numbers-range/discuss/56729)

- [Single Number](https://leetcode.com/problems/single-number/description/)
  * this problem could be solved by the help of XOR operation on the array
  * check [Bit Manipulation solution](https://leetcode.com/problems/single-number/solution/)
  * check Bit Manipulation notes
  * __*VEERYYYYY HARDDDD*__ [Single Number II](https://leetcode.com/problems/single-number-ii/description/)

- [Single Number II](https://leetcode.com/problems/single-number-ii/description/)
  * __Needs REVIEW__   * __Practice this problem more__
  * [general solution](https://leetcode.com/problems/single-number-ii/discuss/43296) check comment of __felixhao28__ and then __joaofn__

- [Single Number III](https://leetcode.com/problems/single-number-iii/description/)
  * can use the general solution with a mod 2
  * but since its only mod 2 => i used ^
  * [solution](https://leetcode.com/problems/single-number-iii/discuss/69006/)
  * [explanation](https://leetcode.com/problems/single-number-iii/discuss/68901/):
    * The two numbers that appear only once must differ at some bit, this is how we can distinguish between them. Otherwise, they will be one of the duplicate numbers.
        * One important point is that by XORing all the numbers, we actually get the XOR of the two target numbers (because XORing two duplicate numbers always results in 0). Consider the XOR result of the two target numbers; if some bit of the XOR result is 1, it means that the two target numbers differ at that location.
        * Let’s say the at the ith bit, the two desired numbers differ from each other. which means one number has bit i equaling: 0, the other number has bit i equaling 1.
        * Thus, all the numbers can be partitioned into two groups according to their bits at location i.     the first group consists of all numbers whose bits at i is 0.     the second group consists of all numbers whose bits at i is 1.
        * Notice that, if a duplicate number has bit i as 0, then, two copies of it will belong to the first group. Similarly, if a duplicate number has bit i as 1, then, two copies of it will belong to the second group.
        * by XoRing all numbers in the first group, we can get the first number.
    by XoRing all numbers in the second group, we can get the second number

  - [Counting Bits](https://leetcode.com/problems/counting-bits/description/)
    * __Needs REVIEW__
    * I did it using Amortized O(n) time and O(n + 32) space; check the CLRS amortized chap
    * a nice [solution and explanation to find a pattern](https://leetcode.com/problems/counting-bits/discuss/79557/How-we-handle-this-question-on-interview-Thinking-process-+-DP-solution)
    * they did it in a dp approach through finding a pattern

  - [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/description/)
    * we should sum the integers based on __bit maniplution__
    * check [formula](https://www.quora.com/How-does-a-computer-add-numbers)
    * [tutorial](https://www.youtube.com/watch?v=VBDoT8o4q00)
    * this formula is per bit => should do the same formula on all bits iteratively in order to use the carry bit from bit n-1 in bit n

- Next Number
  * check Cracking Coding p 291(pdf)/ 280(book)
  * VVVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  * __Practice this problem more__
  * the hard part is to find the next bigger value and the next smaller value
    * its not only flipping the consecutive 10(smaller) or 01(bigger)
    * we have to push all below 1s
 
- Conversion
  * check Cracking Coding p 291(pdf)/ 280(book)
  * easy to do it using (c = a^b and a>>1 and checking a&1 == 1)
  * a __tricky idea__ is to remove the right most 1 => count aslong as c is not 0:
  ```` java
    int function(int a, int b) {
      int count = 0;
      for (int c = a ^ b; c != 0; c = c & (c - 1)) {
        count++;
      }
      return count;
    }
  ````
- [Convert a Number to Hexadecimal](https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/) 
  *  2 ways:
      - manual:
          -  transform number to Hexa manually
          -  take care of negative numbers 
      -  bitwise:
          -  The basic idea is to deal with 4 bits at a time by extracting those after ANDing with 0xf (00...1111). 
          -  Once you deal with those 4 bits, just shift by 4 bits so that you could deal with next 4. 
          -  NOTE: The good thing about the bitwise is that you don't need to worry about doing anything special with negative numbers.

    ```` java
    public String toHex(int n) {
        if ( n == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
			 while(n!=0) {
				int val = 0xf & n ;
				char c = (char)(val + '0');
				if ( val >=10) {
					c = (char) ('a' + val - 10);
				}
				builder.append(c);
				n = n >>> 4;
			}
			builder.reverse();
			return builder.toString();
    }
    ````






  - ASCII and Unicode are two character encodings.
  - ASCII has 128 code points, 0 through 127. It can fit in a single 8-bit byte (needs 7 bits)
  - Extended ASCII code takes use of the last bit in the byte for other chars (so extends to 0-255)
  - Unicode uses a variable bit encoding program where you can choose between 32, 16, 8-bit encoding -> larger number of chars are supported
  - Unicode currently contains most written languages and still has room for even more.
  - In order to maintain compatibility with the older ASCII, which was already in widespread use at the time, Unicode was designed in such a way that the first eight bits matched that of the most popular ASCII page
  - Unicode is standardized while ASCII isn’t.
  - UTF stands for Unicode Transformation Format.
  - UTF was developed so that users have a standardized means of encoding the characters with the minimal amount of space
  - UTF-8 and UTF 16 are only two of the established standards for encoding.
  - They only differ in how many bytes they use to encode each character
  - Since both are variable width encoding, they can use up to four bytes to encode the data but when it comes to the minimum, UTF-8 only uses 1 byte (8bits) and UTF-16 uses 2 bytes(16bits).
  - This bears a huge impact on the resulting size of the encoded files
  - check how to print the symbols in JAVA (System.out.printf("\73"); here it takes the octal rep of the symbol)


  - Useful links:
    - ASCII code has the range 0-127 (HEX: 7F) -> 7 bits [ASCII](http://www.asciitable.com/)
    - ASCII extended extends to 255 took the last bit of a byte
    - [diff with UTF](https://stackoverflow.com/questions/19212306/whats-the-difference-between-ascii-and-unicode)
    - [print extended ascii in java](https://stackoverflow.com/questions/22273046/how-to-print-the-extended-ascii-code-in-java-from-integer-value)
    - [Difference Between Unicode and ASCII](http://www.differencebetween.net/technology/software-technology/difference-between-unicode-and-ascii/)
    - [Difference between UTF-8 and UTF-16](http://www.differencebetween.net/technology/difference-between-utf-8-and-utf-16/)


 - Normalization is a tech to normalize a data to multiple tables to reduce data redundancy  - Issues faced due to redundancy
    1. Insertion Anomaly
    2. Updating Anomaly
    3. Deletion Anomaly
 - [normalization in DBMS](https://en.wikipedia.org/wiki/Database_normalization)
    - [1NF](https://en.wikipedia.org/wiki/First_normal_form): A table is in 1NF <=>
      1. There's no top-to-bottom ordering to the rows.       2. There's no left-to-right ordering to the columns.
      3. There are no duplicate rows (rows should be uniquely identified).
      4. Every row-and-column intersection contains exactly one value from the applicable domain (and nothing else) (meaning not an array).
      5. All columns are regular [i.e. rows have no hidden components such as row IDs, object IDs, or hidden timestamps].
            - [2NF](https://www.1keydata.com/database-normalization/second-normal-form-2nf.php)
      1. Should Be in 1NF
      2. All attributes(non-key columns) in a row should depend on the key.       3. All non-key attributes cannot be dependent on a subset of the primary key (if composite key).
    - [3NF](https://www.1keydata.com/database-normalization/third-normal-form-3nf.php)
      1. Should Be in 2NF
      2. All columns can be determined ONLY by the KEY in the table and no other column
      3. There is no transitive functional dependency (check example in link)
    - [4NF](https://en.wikipedia.org/wiki/Fourth_normal_form)
      1. Should Be in 3NF
      1. No multi-valued Dependency
    - [BCNF](https://stackoverflow.com/questions/19749913/what-is-the-difference-between-3nf-and-bcnf)
      1. Should Be in 3NF
      2. for each functional dependency X ⟶ A in R, X is a key or superkey in R
    - Useful links:
    1. [Normalization](https://www.youtube.com/watch?v=UrYLYV7WSHM)
    2. [study tonight](https://www.studytonight.com/dbms/database-normalization.php)



  * [link](https://stackoverflow.com/questions/17466218/what-are-the-differences-between-segment-trees-interval-trees-binary-indexed-t)
  * __Segment tree:__ stores intervals, and optimized for "which of these intervals contains a given point" queries.
  * __Interval tree:__ stores intervals as well, but optimized for "which of these intervals overlap with a given interval" queries. It can also be used for point queries - similar to segment tree.
  * __Range tree:__ stores points, and optimized for "which points fall within a given interval" queries.   * __Binary indexed tree:__ stores items-count per index, and optimized for "how many items are there between index m and n" queries.


  - Recursive: O(n) time, O(n) space
  - Iterative + Stack: O(n) time, O(n) space
  - Morris Traversal: O(n) time, O(1) space 


  - O(n) time, O(1) space complexity
  - changes the state of a tree but when finished it return it back
  - the Predecessor of a sub tree will point to the root of the sub tree
  - [explanation](https://www.youtube.com/watch?v=wGXB9OWhPTg)
  - [in order traversal](http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/)
  - [pre order traversal](http://www.geeksforgeeks.org/morris-traversal-for-preorder/)



<a id ="trie">Trie Tree</a>
  - its similar to a [DFA](https://en.wikipedia.org/wiki/Deterministic_finite_automaton)
  - its used for:
    * Auto completion
    * spelling checker
    * T9 predictive text
  - check in the Data structure section for the problems related to it
  - There are several other data structures, like balanced trees and hash tables, which give us the possibility to search for a word in a dataset of strings.Then why do we need trie? Although hash table has O(1)O(1) time complexity for looking for a key, it is not efficient in the following operations:

    * __Finding all keys with a common prefix__
    * __Enumerating a dataset of strings in lexicoical order__
    * __Another reason why trie outperforms hash table, is that as hash table increases in size, there are lots of hash collisions and the search time complexity could deteriorate to O(n) WHILE TRIE is only O(m) where m is the key length__

  - [read about it](https://leetcode.com/articles/implement-trie-prefix-tree/)




  - [types](https://en.wikipedia.org/wiki/Cache_replacement_policies
  - LRU (least recently used)
  - LFU (least frequently used)



  - <a id="Boyer_Moore">[Algorithm](https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm)</a>
  - runs in O(n) time and O(1) space
  - majority element must be > n/2
  - we can be also searching for elements > n/k => check general [solution](https://discuss.leetcode.com/topic/24202/a-general-solution-for-searching-elements-that-appear-more-n-k-times)
    * number of counter equals number of possible candidate     * if one candidate hits a value equals another candidate we dont decrement the counter of the first candidate



- review [Single Number II](https://leetcode.com/problems/single-number-ii/description/)
- [The Skyline Problem ](https://leetcode.com/problems/the-skyline-problem/description/)
- [Ugly Number II](https://leetcode.com/problems/ugly-number-ii/description/)
- [Find the Celebrity]
- [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/description/)
- [Palindrome Partitioning II](https://leetcode.com/problems/palindrome-partitioning-ii/description/)
- [Generate Parentheses](https://leetcode.com/articles/generate-parentheses/)
- [alien language](https://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/)
- [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/discuss/?page=2)
- [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/description/)


