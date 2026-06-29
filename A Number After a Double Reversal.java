class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0,rev1 = 0;
        int temp = num;
        while(num!=0)
        {
            int l = num%10;
            rev = rev*10+l;
            num /= 10;

        }
    
        while(rev!=0)
        {
            int l = rev%10;
            rev1 = rev1*10+l;
            rev /= 10;
        }
       
       
        return rev1==temp;
    }
}
