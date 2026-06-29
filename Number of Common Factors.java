class Solution {
    public int[] factors(int n)
    {
        int i;
        int[] val = new int[n];
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                val[i-1] = i;
            }
        }
        return val;
    }
    public int commonFactors(int a, int b) {
        int[] a1 = factors(a);
        int[] b1 = factors(b);
        int count =0;
        for(int i = 0;i<a1.length;i++)
        {
            for(int j =0; j<b1.length; j++)
            {
                if(a1[i]!=0&&a1[i]==b1[j])
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}
