class TwoSum {
    public int[] twoSum(int[] nums, int target) {
         
        //n square solution
    /*
        for(int i=0;i<nums.length;i++)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(i==j)
                        continue;
                    if(nums[i]+nums[j]==target)
                        return new int[]{i,j};
                }
            }
        return new int[]{};*/
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(target-nums[i]))
                    return new int[]{map.get(target-nums[i]),i};
                map.put(nums[i],i);
                
            }
        return new int[]{};
}}
