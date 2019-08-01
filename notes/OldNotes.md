# LeetCode Problems

- [LeetCode Problems](#LeetCode-Problems)
  - [Greedy](#Greedy)
    - [Hints](#Hints)
    - [Problems](#Problems)
      - [Priority Queue](#Priority-Queue)
  - [BST](#BST)
    - [Hints](#Hints-1)
    - [Problems](#Problems-1)
    - [Augmenting BST](#Augmenting-BST)
  - [Pointers / Linked List](#Pointers--Linked-List)
    - [Tips](#Tips)
    - [Problems](#Problems-2)
  - [Arrays](#Arrays)
    - [Tips](#Tips-1)
    - [Problems](#Problems-3)
      - [Maxima-Minima](#Maxima-Minima)
  - [String](#String)
    - [Problems](#Problems-4)
      - [Excel](#Excel)
      - [Decoding](#Decoding)
  - [D&G](#DG)
  - [Data Structures](#Data-Structures)
    - [Hints:](#Hints)
    - [This section is an important one to review](#This-section-is-an-important-one-to-review)
      - [Union Find](#Union-Find)
      - [Linked list](#Linked-list)
      - [Queue and Stack](#Queue-and-Stack)
      - [Iterator](#Iterator)
      - [Randomization](#Randomization)
        - [RESERVOIR SAMPLING (Very Large Input)](#RESERVOIR-SAMPLING-Very-Large-Input)
  - [Design](#Design)
  - [Math](#Math)
    - [Hints](#Hints-2)
    - [Problems](#Problems-5)
  - [Bit Manipulation](#Bit-Manipulation)
    - [Hints](#Hints-3)
    - [Problems](#Problems-6)
      - [Using Constants](#Using-Constants)
- [General Information](#General-Information)
  - [Difference between ASCII, extended ASCII, UTF-8, UTF-16](#Difference-between-ASCII-extended-ASCII-UTF-8-UTF-16)
  - [Diff btw segmant Tree, Range Tree, Interval Tree:](#Diff-btw-segmant-Tree-Range-Tree-Interval-Tree)
  - [How many ways to traverse a BST. We have 3 ways:](#How-many-ways-to-traverse-a-BST-We-have-3-ways)
    - [Morris Traversal in BST](#Morris-Traversal-in-BST)
  - [Trie Tree](#Trie-Tree)
  - [Caching](#Caching)
  - [Boyer-Moore Majority Algorithm](#Boyer-Moore-Majority-Algorithm)
- [TODO](#TODO)


## Greedy

### Hints
  -   maxQueue: PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(20,Collections.reverseOrder());

___

### Problems 

#### Priority Queue


- [Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/description/)
  - At first sort the array bases on __(o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]__
  - Iterate over the sorted array and add the current person to a list in position = person[1] = number of people >=current height
  - time: O(n^2) 

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
## BST

### Hints 

- Most of the time Pre,In,Post orders problems are duality to each other you have to just find the right duality
- Always practice Pre,In,Post in iterative and Morris Algo
- Try to use TreeSet or TreeMap
- Try to use In,Pre,Post for finding equality btw trees, and other purposes


### Problems

- [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)
  * VIPPPPPP Important way to solve it without recursion   * __Needs REVIEW__
  * use stack and current pointer   * __STUDY THIS PROBLEM__
  * check [solution](https://leetcode.com/articles/binary-tree-inorder-traversal/)
  * VIPPPPPP Read about [__Threaded BST or Morris__](http://www.geeksforgeeks.org/convert-binary-tree-threaded-binary-tree-set-2-efficient/)
  * [find successor in BST](https://www.quora.com/How-can-you-find-successors-and-predecessors-in-a-binary-search-tree-in-order)

- [Binary Tree PreOrder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
  * similar to above but we put the result.add() inside the second while loop
  * __Needs REVIEW__
  * use stack and current pointer   * __STUDY THIS PROBLEM__

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
    * This question is the DUALITY of {@link ConstructBinaryTreefromPreorderandInorderTraversal#buildTree(int[], int[])}:
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

- [Verify Preorder Sequence in Binary Search Tree](https://kennyzhuang.gitbooks.io/leetcode-lock/content/255_verify_preordersequence_in_binary_search_tree.html)
  * VVVVVVVVIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP problem
  * the trick here is to use the Iterative preOrder algo to solve it
  * at first did it with an additional stack   * optimized it to use O(1) space
  * check my code in intellij
  * my solution can be refactored to become like [their solution](https://kennyzhuang.gitbooks.io/leetcode-lock/content/255_verify_preordersequence_in_binary_search_tree.html)

- [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/)
  * this could be done in O(n) recursively
  * its done in a D&C way
    1. we get the mid point (O(1)) like binary search algo
    2. recurse to the left and right
    3. assgine the nodes returned from left and right as children of the midpoint

- [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/)
  * Pay attention that the **condition holds if we are on a leaf node and the sum == 0** and not when reaching a null node 
  * since: 
    * if we have only a null node as a root we shouldnt return anything
    * if we may added the list twice (when reaching right child of leaf null and left child where both are null)

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



- [Binary Tree Longest Consecutive Sequence](https://www.geeksforgeeks.org/longest-consecutive-sequence-binary-tree/)
  * do a preOrderTraversal
  * __TRICK:__ to decide the length at every node do: return Math.max(leftLength, rightLength, __currentLength__).
    -  we need to compare to currentLength since the children may reset the length since child.val != current.val + 1
  * [my solution](http://buttercola.blogspot.com/2015/12/blog-post.html)

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

### Augmenting BST
 
- [Count of Smaller Numbers After Self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/description/)
  * similar to above __Longest Increasing Subsequence__ problem using the __BST solution__
  * instead of saving the max increasing subseq at every node we save the size of the subtree => upon inserting a node we can add the number of nodes less than the current
  * in order to get the correct answer we must start iterating from the end of the array an insert every element upon iteration to retrieve the count of this element
  * This problem uses the same Data Structure for the __ranking problem__

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

- [Count of Range Sum](https://leetcode.com/problems/count-of-range-sum/description/)
  * This problem uses the same Data Structure for the __ranking problem__
  * augment the BST by the size of the subtree



## Pointers / Linked List


### Tips

- Try to use DummyHead if the head will change its place
- Floyd's Tortoise and Hare (Cycle Detection): Think of using Slow and Fast pointers 
- Runner technique: use more than one pointers separated btw each other with a constant distance (cracking coding interview p93)
- If end -> beginning (reverse order) __ex: Plus One Linked List__ => 2 ways:
  1. recursive
  2. reverse order + compute + reverse order again
- when re-arranging nodes make sure to change node.next to appropraite value or null
  - ex: **Odd Even Linked List**  

### Problems

- [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
  * use two pointers with distance K
  
- [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/description/)
  * use dummy head where dummyHead.next = head of list since the head will change so u should keep track of the new head
  * use two pointers with distance K

- [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/description/)
  * As previous ones
  * use DummyHead





- [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/discuss/)
  * Think like the problem of water container where you start from left and right.
  
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

- [Reorder List](https://leetcode.com/problems/reorder-list/description/)
  * partition list to two parts and use Reverse Linked List in this problem for the second part



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
    2. start both lists from this length away from the end of list
    3. then start iterating over both lists => the point they intersect is the intersection way
  * Their solution: looks like __Linked List Cycle II__ problem [check it out](https://leetcode.com/problems/intersection-of-two-linked-lists/solution/)

- [Plus One Linked List](https://www.programcreek.com/2014/08/leetcode-plus-one-linked-list-java/)
  * 2 solutions:
    1. recursive
    2. reverse order + do addition + reverse again

## Arrays

### Tips

  - If you have a linked list and you want to get the midpoint (binray search) to use it for algo in and total cost should be O(n)
   => at first start with left of midpoint then do midpoint then continue with right of midpoint check [Question](#List_To_BST)   - if your looping in a cycle somehow => could be translated to __Floyd's Tortoise and Hare Cycle__ VVVVVIIIIPPPPPPP
  - use Map to save states
  - if you want O(log n) => think something similar to Binary Search Algo
  - try to use cummulative sums and find a way to answer ur problem
  - if u need __randomization + we have very large input__ => use __*Reservoir Sampling*__

### Problems

- [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/solution/)
  * VVVVVVVVVVVVVVVVVIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  *  __Practice this problem more__   
  * this problem was encountered in the Algo course
  * its a very nice problem
  * [solution](https://leetcode.com/problems/median-of-two-sorted-arrays/solution/)   
  * the above explanation is __SOOOOOOOOOO VVIIIIIIIIIIPPPPPPPPPP__

____


_____



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



- [Max Product Subarray](#Maximum_Product_Subarray)
  * similar to [Max Subarray](#Maximum_Sum_Subarray)
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


- [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/discuss/)
  * iterate from left to right to calculate the cumulative product
  * then iterate from right to left to calculate the cumulative product
  * time O(n), Space O(1)
  * [solution](https://discuss.leetcode.com/topic/18864/simple-java-solution-in-o-n-without-extra-space)



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



- [H Index II](https://leetcode.com/problems/h-index-ii/description/)
  * its similar to first way of H Index but now the array is sorted so we need to find a way less than O(n) => use Binary Search O(log n)
  * [solution](https://leetcode.com/problems/h-index-ii/discuss/71063/Standard-binary-search)


- [Submission Detail](https://leetcode.com/problems/game-of-life/description/)
  * in order to solve it in-place we need to depend on the bits of every int in the array:
    [2nd bit, 1st bit] = [next state, current state]

    - 00  dead (next) <- dead (current)
    - 01  dead (next) <- live (current)      
    - 10  live (next) <- dead (current)      
    - 11  live (next) <- live (current)   
  * check [this solution](https://leetcode.com/problems/game-of-life/discuss/73223/Easiest-JAVA-solution-with-explanation)
  * for the infinite board part we need only to take as input the list of Live Coordinates no need for the full board => [infinite board solution](https://leetcode.com/problems/game-of-life/discuss/73217/Infinite-board-solution) 



  
- [Bulls and Cows](https://leetcode.com/problems/bulls-and-cows/description/)
  * did it using one array[10] => space O(1) and two passes => time O(n)
  * another [solution with only one pass](https://leetcode.com/problems/bulls-and-cows/discuss/74621/One-pass-Java-solution)


- [Nested List Weight Sum II](https://www.programcreek.com/2014/08/leetcode-nested-list-weight-sum-ii-java/)
  * solved it in a recursive way
____

#### Maxima-Minima

- [Wiggle Subsequence](https://leetcode.com/problems/wiggle-subsequence/description/)
  * to solve this problem we need to count the number of alterantions between a Maxima and a Minima
  * time: O(n), Space: O(1)
  * [solution](https://leetcode.com/articles/wiggle-subsequence/)
  * similar to __finding the number of alternating max. and min. peaks in the array__

- [Next Permutation](https://leetcode.com/problems/next-permutation/description/)
  * VVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPP
  * __*VEERYYYYY HARDDDD*__
  * __Practice this problem more__   
  * [solution](https://leetcode.com/problems/next-permutation/solution/)



____


## String

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


### Problems



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



- [Reconstruct Original Digits from English](https://leetcode.com/problems/reconstruct-original-digits-from-english/description/)
  - did it in a very ugly way
  - knowing that we have only numbers from 0 -> 9 
    - somehow we can find the number of occurrences of every digit using some unique char in its eng name (ex: for 0 its 'z')
  - [solution](https://leetcode.com/problems/reconstruct-original-digits-from-english/discuss/91207/one-pass-O(n)-JAVA-Solution-Simple-and-Clear)


---

#### Excel

- [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/description/)
  * Think about dividing the number by 26
  * check my solution

- [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)
  * similar to __Excel Sheet Column Title__
____

#### Decoding
- [Encode and Decode Strings](http://buttercola.blogspot.com/2015/09/leetcode-encode-and-decode-strings.html)
  * the solution that i did is the same as in the link above
  * to encode the list<String> to string => for ever String in the list we add at the end of it # and the length of that string

____



- [Remove Duplicate Letters](https://leetcode.com/problems/remove-duplicate-letters/description/)
  * VVVVVVVVVVIIIIIIIPPPPPPPPPPP
  *  __Needs REVIEW__
  * __Practice this problem more__
  * This problem use a small idea from the __*Min Stack* DS problem__ which is:
      - when u insert you check:
        1. if the inserted char is smaller than the head of the stack
        2. if the char in the head of stack exists in the string after the inserted char (to garanty that the head will be present in the result)

        - if yes => pop head from stack
        - if no => push the current char
      - above cnd is in a while()

  * Time: O(n), Space: O(n)      
  * Explanation:
                First, given "bcabc", the solution should be "abc". If we think about this problem intuitively, you would sort of go from the beginning of the string and start removing one if there is still the same character left and a smaller character is after it. Given "bcabc", when you see a 'b', keep it and continue with the search, then keep the following 'c', then we see an 'a'. Now we get a chance to get a smaller lexi order, you can check if after 'a', there is still 'b' and 'c' or not. We indeed have them and "abc" will be our result.

        Come to the implementation, we need some data structure to store the previous characters 'b' and 'c', and we need to compare the current character with previous saved ones, and if there are multiple same characters, we prefer left ones. This calls for a stack.

        After we decided to use stack, the implementation becomes clearer. From the intuition, we know that we need to know if there are still remaining characters left or not. So we need to iterate the array and save how many each characters are there. A visited array is also required since we want unique character in the solution. The line while(!stack.isEmpty() && stack.peek() > c && count[stack.peek()-'a'] > 0) checks that the queued character should be removed or not, like the 'b' and 'c' in the previous example. After removing the previous characters,push in the new char and mark the visited array.


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


## D&G

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
## Data Structures

### Hints:
  - Think of using TreeSet or TreeMap

### This section is an important one to review

- [LRU Cache](https://leetcode.com/problems/lru-cache/discuss/)
  * can do it in a very simple way using LinkedHashTable (check the code I did)
  * to do it in a [proper way](https://discuss.leetcode.com/topic/6613/java-hashtable-double-linked-list-with-a-touch-of-pseudo-nodes):
    1. use normal Hash table to store the key as the key and as a value store a pointer     
    2. this pointer points to the representing object of the key in the doubly linked list which is used to sort the LRU objects

- [LFU Cache](https://leetcode.com/problems/lfu-cache/discuss/)
  * used a HashMap to store the key to its place in a List
  * used a List to store the Map<Key, Value> based on the key's frequency meaning that the first index in the list show all the key-value pair that have freq of 1 and second index means freq of 2 etc... (Like Bucket Sort)
  * my solution is similar to [this](https://discuss.leetcode.com/topic/69402/c-list-with-hashmap-with-explanation)
  * In order to achieve O(1) time we used 2 HashMaps and a List



____
#### Union Find
- [Number of Islands](https://leetcode.com/problems/number-of-islands/description/)
  * [__UNION FIND__](https://gist.github.com/drmalex07/3e6695025a1788e669cec7f8d93d98dc)
  * basically this question is used to implement the union find algo
  * read about it in recitation 3 course 2
  * [solution](https://leetcode.com/problems/number-of-islands/solution/)

- [Number Of Island II](http://buttercola.blogspot.com/2016/01/leetcode-number-of-islands-ii.html)
  * this is a classic UNION-FIND DS
  * check course 2 recitaion 3

____
#### Linked list

- [All O`one Data Structure](https://leetcode.com/problems/all-oone-data-structure/description/)
  - used a Map to store for every key its place in the linked list
    - => increment and decrement in O(1)
  - used a linked list to create nodes:
    - node key is the number of occurence (1,2,...)
    - its a doublly linked list
  - Store first and last node of linked list
    - => getMax and getMin: O(1) 

____

#### Queue and Stack
- [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/solution/)
  * use two stacks
  * we pop() or peek() are called   * check if stack2 is empty poll last all elements from stack1 and put them in stack2
    * return last of stack2
  * O(1) per operation amortized
  * [solution](https://leetcode.com/articles/implement-queue-using-stacks/)

- [Implement Stack using Queues](https://leetcode.com/articles/implement-stack-using-queues/)
  * [solution](https://leetcode.com/articles/implement-stack-using-queues/)

____

#### Iterator

- [Peeking Iterator](https://leetcode.com/problems/peeking-iterator/description/)
  * check code for best solution    * in the peek() do iterator.next() and save it in a variable (called peekValue)
  * should have a field (isStillValid) to check if the current peekValue is still valid

____


- [Tic-Tac-Toe](https://www.programcreek.com/2014/05/leetcode-tic-tac-toe-java/)
  * I did it in two ways:
    1. naive:O(n) everytime a player plays
    2. DP: O(1) time, O(n^2) space
  * they Did it in a better solution O(1)/play time and O(n) space
    - actually u dont need O(n^2)space u just need row[n] and col[n] and two ints for the diagonals
    - [check nice solution](https://www.programcreek.com/2014/05/leetcode-tic-tac-toe-java/)



____

#### Randomization

- [Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/description/#)
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

##### RESERVOIR SAMPLING (Very Large Input)

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



## Design

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






## Math

### Hints
  - pay attention for overflows (ex: __Guess Number Higher or Lower__) 
  - try to find a way so that current state can be represented in previous state, ex(Rotate Function problem): F(k) - F(k - 1) = .....

### Problems






















## Bit Manipulation

### Hints
  - use ^
  - use int[32] to store infor about every bit like in the singleNumberII
  - use Integer.lowestOneBit(n) (check documentaion in General Info)
  - n & (n - 1) to check if power of 2
  - sometimse you can use constants like __0x55555555__ to check something (check Power of Four problem)
  - check [summary](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary:-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)
  - instead of doing (1<<i & n) try to do (n>>i & 1)
  - https://stackoverflow.com/questions/1677957/why-byte-b-byte-0xff-is-equals-to-integer-1
  - to change from decimal to Base B take adv of "int number in java is actually represented in binary" (ex: check __Convert a Number to Hexadecimal problem__)

### Problems

- [Reverse Bits](https://leetcode.com/problems/reverse-bits/description/)
  * check this [solution](https://leetcode.com/problems/reverse-bits/discuss/54950)

- [Power of Two](https://leetcode.com/problems/power-of-two/discuss/)
 * did it using Integer.bitCount(n);
 * another way is to do: n & (n - 1)   
    - since if n = 4 (100) => n - 1 = 3 (11) => n & (n - 1) = 0


_____

#### Using Constants

- [Power of Four](https://leetcode.com/problems/power-of-four/discuss/80456/O(1)-one-line-solution-without-loops)
  * VVVVVVVVVVVVVVVVIIIIIIIIIIIIIIIIIIIIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
  * __Needs REVIEW__
  * __Practice this problem more__
  * 2 ways:
    1.  return Integer.bitCount(num) == 1&&  Integer.numberOfTrailingZeros(num) % 2 == 0;
    2. return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
      - The basic idea is from power of 2, We can use “n&(n-1) == 0” to determine if n is power of 2.
      - For power of 4, the additional restriction is that in binary form, the only “1” should always located at the odd position.           
      - For example, 4^0 = 1, 4^1 = 100, 4^2 = 10000.           
      - So we can use “num & 0x55555555==num” to check if “1” is located at the odd position.
  * __second solution is better cz it doesn't depend on a specific language__

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



# General Information

## Difference between ASCII, extended ASCII, UTF-8, UTF-16
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




## Diff btw segmant Tree, Range Tree, Interval Tree:
  * [link](https://stackoverflow.com/questions/17466218/what-are-the-differences-between-segment-trees-interval-trees-binary-indexed-t)
  * __Segment tree:__ stores intervals, and optimized for "which of these intervals contains a given point" queries.
  * __Interval tree:__ stores intervals as well, but optimized for "which of these intervals overlap with a given interval" queries. It can also be used for point queries - similar to segment tree.
  * __Range tree:__ stores points, and optimized for "which points fall within a given interval" queries.   * __Binary indexed tree:__ stores items-count per index, and optimized for "how many items are there between index m and n" queries.

## How many ways to traverse a BST. We have 3 ways:
  - Recursive: O(n) time, O(n) space
  - Iterative + Stack: O(n) time, O(n) space
  - Morris Traversal: O(n) time, O(1) space 

### Morris Traversal in BST
  - O(n) time, O(1) space complexity
  - changes the state of a tree but when finished it return it back
  - the Predecessor of a sub tree will point to the root of the sub tree
  - [explanation](https://www.youtube.com/watch?v=wGXB9OWhPTg)
  - [in order traversal](http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/)
  - [pre order traversal](http://www.geeksforgeeks.org/morris-traversal-for-preorder/)


## Trie Tree
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


## Caching

  - [types](https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU)
  - LRU (least recently used)
  - LFU (least frequently used)


## Boyer-Moore Majority Algorithm
  - <a id="Boyer_Moore">[Algorithm](https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm)</a>
  - runs in O(n) time and O(1) space
  - majority element must be > n/2
  - we can be also searching for elements > n/k => check general [solution](https://discuss.leetcode.com/topic/24202/a-general-solution-for-searching-elements-that-appear-more-n-k-times)
    * number of counter equals number of possible candidate     * if one candidate hits a value equals another candidate we dont decrement the counter of the first candidate

# TODO

- review [Single Number II](https://leetcode.com/problems/single-number-ii/description/)
- [The Skyline Problem ](https://leetcode.com/problems/the-skyline-problem/description/)
- [Find the Celebrity]
- [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/description/)
- [Palindrome Partitioning II](https://leetcode.com/problems/palindrome-partitioning-ii/description/)
- [Generate Parentheses](https://leetcode.com/articles/generate-parentheses/)


- [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/discuss/?page=2)


