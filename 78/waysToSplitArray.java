public int waysToSplitArray(int[] nums) {
        
        int n=nums.length;
        
        long sum=0,count=0,temp=0;
        
        
        
        for(int i=0;i<n;i++)
            sum+=nums[i];
        
        
        for(int i=0;i<n-1;i++){
            temp+=nums[i];
            sum-=nums[i];
            if(temp>=sum)
                count++;
        }
        
        return (int)count;
        
    }