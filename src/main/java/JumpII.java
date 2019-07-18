public class JumpII {


   public int jump2(int[] nums) {
      int numberOfJumps = 0;

      int lastIndexWithCurrentJumps = 0;
      int lastIndexWithNextJumps = lastIndexWithCurrentJumps;

      for (int i = 0; i < nums.length -1; i++) {
         if (i > lastIndexWithCurrentJumps) {
            lastIndexWithCurrentJumps = lastIndexWithNextJumps;
            lastIndexWithNextJumps++;
            numberOfJumps++;
         }

         if (nums[i] + i > lastIndexWithNextJumps) {
            lastIndexWithNextJumps = Math.max(lastIndexWithNextJumps, nums[i] + i);
         }

         if (lastIndexWithNextJumps >= nums.length - 1){
            numberOfJumps++;
            break;
         }

      }

      return numberOfJumps;
   }

   public int jump(int[] nums) {
      if(nums.length<2)return 0;
      int level=0,currentMax=0,i=0,nextMax=0;

      while(currentMax-i+1>0){		//nodes count of current level>0
         level++;
         for(;i<=currentMax;i++){	//traverse current level , and update the max reach of next level
            nextMax=Math.max(nextMax,nums[i]+i);
            if(nextMax>=nums.length-1)return level;   // if last element is in level+1,  then the min jump=level
         }
         currentMax=nextMax;
      }
      return 0;

   }
}
