public int divisorSubstrings(int num, int k) {
        
        String s=String.valueOf(num);
        int n=s.length();
        int count=0;
        
        for(int i=0;i<n-k+1;i++){
            count+=helper(s,i,k,num);
        }
        return count;
    }
    public static int helper(String s,int i,int k,int num){
        int n=Integer.parseInt(s.substring(i,i+k));//s.substring(0,2)
        if(n==0)
            return 0;
        if(num%n==0){
            System.out.println(n);
            return 1;
        }
        return 0;
    }